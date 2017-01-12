package com.example.androidgoapp.androidgoapp.Model;

import com.example.androidgoapp.androidgoapp.Database.ServiceAllocation;
import com.example.androidgoapp.androidgoapp.Database.ServiceAppointment;
import com.example.androidgoapp.androidgoapp.Database.ServiceGroup;
import com.example.androidgoapp.androidgoapp.Model.Management.Appointment;
import com.example.androidgoapp.androidgoapp.Model.Management.Group;
import com.example.androidgoapp.androidgoapp.Model.Management.SimpleUser2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Theresa on 21.12.2016.
 */

public class GroupHandler {

    private List<String> grouplist;
    private ServiceAllocation sAlloc;
    private ServiceAppointment sApp;
    private ServiceGroup sGroup;

    private void updateAllGroups() {
    }

    /**
     * The actual user creates a new group on his device and becomes admin of this group by default.
     * He has to choose a unique group name.
     * The group will be added to group.db, the appointment of this group to appointment.db and that
     * the user is member of the group, there will be also a new entry in allocation.db
     * @param groupName the user wants to call his group
     * @param user who creates the group and becomes admin
     */
    public void createGroup(String groupName, SimpleUser2 user) {
        Group group = new Group(groupName, user);
        Appointment appointment = new Appointment();
        sGroup.insertNewGroup(group, user.getUserID());
        sApp.insertAppointment(group.getGroupID(), appointment);
        sAlloc.insertNewGroupMemberAlloc(group.getGroupID(), user.getUserID());
        sAlloc.updateGroupMemberToAdmin(group.getGroupID(), user.getUserID());//as admin
        //TODO
    }

    /**
     * Delete group from group.db, delete group from appointment.db, delete group and member from
     * allocation.db and delete users who aren't in any other group with the actual user anymore
     * from the user.db
     * @param group to delete
     */
    public void deleteGroup(Group group){
        sApp.deleteAppointmentData(group.getGroupID());
        sAlloc.deleteAllGroupMemberAlloc(group.getGroupID());
        //sUser.deleteUser()
        sGroup.deleteGroupData(group.getGroupID());
    }

    /**
     * To get all names of the groups the actual user is member of to show these on the side bar
     * in the MapActivity.
     * @return list of the group names
     */
    public List<String> getAllGroupNames() {
        grouplist = new LinkedList<String>();
        //Alle Gruppen des actual users bekommen
        sGroup.readAllGroupNames();
        return grouplist;
    }
}
