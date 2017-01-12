package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Appointment;
import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Group;
import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.SimpleUser2;

import java.util.List;

/**
 * Created by Theresa on 11.01.2017.
 *
 * Gruppe hinzufügen
 * Gruppe löschen
 * Gruppe aktualisieren
 * alle informationen zu einer Gruppe abrufen
 *
 */

public class ServiceGroup {

    private final DBHelperGroup dbHelperGroup;
    private SQLiteDatabase db;
    private ServiceAllocation sAlloc;
    private ServiceUser sUser;
    private ServiceAppointment sApp;

    public ServiceGroup(Context context) {
        dbHelperGroup = new DBHelperGroup(context.getApplicationContext());
    }

    /**
     * Add a new group to database and add the user who creates the group as first member and as
     * admin. There is no appointment set (or do we set an default appointment?)
     * @param group to add to database
     * @param userID of the user who created the group and will be admin
     * @return return true if inserting was successful
     */
    public boolean insertNewGroup(Group group, int userID) {
        //TODO
        sAlloc.insertNewGroup(group.getGroupID());//adds to allocation
        sAlloc.insertNewGroupMemberAlloc(group.getGroupID(), userID); //adds first group member
        sAlloc.updateGroupMemberToAdmin(group.getGroupID(), userID);//as admin
        Appointment appointment = null; //default Appointment
        sApp.insertAppointment(group.getGroupID(), appointment);
        db = dbHelperGroup.getWritableDatabase();
        return false;
    }

    /**
     * Needed because if I would make in ServiceAllocation the insertNewGroupMemberAlloc pulic, then
     * I would have an back arrow from Allocation to User (and I try to avoid circles)
     * @param groupID of the group to add the memeber to
     * @param user object to add to user.db if it doesn't exist yet and to allocation.db
     * @return true if adding was successful
     */
    public boolean insertNewGroupMember(int groupID, SimpleUser2 user) {
        //TODO
        sUser.insertUserData(user); //if user is not already in this database
        sAlloc.insertNewGroupMemberAlloc(groupID, user.getUserID());
        return false;
    }//BESTREITBAR!!!!!!!!!!!!! eigentlich in Alloc

    /**
     * Get name and go service of the group with the given group id.
     * @param groupID of the group to get information about
     * @return group object
     */
    public Group readGroupData(int groupID) {
        //TODO
        db = dbHelperGroup.getReadableDatabase();
        return null;
    }
    public List<String> getGroupAdmin(int groupID) {
        return null;
    }

    /**
     * Get all members names where the second column of the database equals the given group Id
     * @param groupID of the group to get the members from
     * @return a list of the member id's
     */
    public List<String> getAllMembersOfOneGroup(int groupID) {
        //getAllUserIdsOfOneGroup();
        sAlloc.getAllUserIdsOfOneGroup(groupID);
        sUser.getAllUsers(); //compare the user id's we got with the user id's of all users and
        //add these names to the list where the id is in both lists
        db = dbHelperGroup.getReadableDatabase();
        List<String> res = null;
        return res;
    } //GEENAUSO BESTREITBAR OB NICHT IN ALLOC

    /**
     * To get all groups the actual user is member of and because all the groups saved in the database
     * are just the ones he is member of, we can go through the list and return all group names
     * @return list of all names that are listed in the group database.
     */
    public List<String> getAllGroupNames() {
        //TODO
        db = dbHelperGroup.getReadableDatabase();
        List<String> res = null;
        return res;
    }

    /**
     * Delete a group in group.db, in appointment.db, in alloc.db and maybe also in user.db.
     * @param groupID of the group to delete
     * @return true if deletion was successful
     */
    public boolean deleteGroupData(int groupID) {
        //TODO
        sAlloc.deleteOldGroup(groupID);//deletes group from allocation.db
        sApp.deleteAppointmentData(groupID);//deletes group from appointment.db
        //also check if some users have to be deleted from the user.db
        //sUser.deleteData(); if some users arent in any group with the actual user anymore
        return false;
    }
    public boolean deleteGroupMember(int groupID, int userID) {

        return false;
    }

    /**
     * Update data when group name or go service of the group have changed.
     * @param groupID of the group to update
     * @return true if update was successful
     */
    public boolean updateGroupData(int groupID) {
        //TODO
        db = dbHelperGroup.getWritableDatabase();
        return false;
    }

    //BESTREITBAR: GET APPOINTMENT; ADD APPOINTMENT; DELETE APPOINTMENT
    //GROUP DATA IST ABER MIT ALLOC UND APPOINTMENT NICHT MEHR EINDEUTIG

}
