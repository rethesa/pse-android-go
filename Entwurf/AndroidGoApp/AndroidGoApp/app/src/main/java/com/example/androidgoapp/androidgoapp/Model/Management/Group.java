package com.example.androidgoapp.androidgoapp.Model.Management;

import com.example.androidgoapp.androidgoapp.Database.ServiceAllocation;
import com.example.androidgoapp.androidgoapp.Database.ServiceAppointment;
import com.example.androidgoapp.androidgoapp.Database.ServiceGroup;
import com.example.androidgoapp.androidgoapp.Database.ServiceUser;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by Theresa on 20.12.2016.
 */

public class Group {

    private int groupID;
    private String groupName;
    private Appointment appointment;
    private AppointmentDate date;
    private AppointmentDestination destination;
    private GoService goService;
    private List<String> groupMemberList;

    private ServiceGroup sGroup;
    private ServiceUser sUser;
    private ServiceAppointment sApp;
    private ServiceAllocation sAlloc;

    public Group(String name, SimpleUser2 user) {
        this.groupName = name;
        //this.groupID =     increases
        appointment.setAppointmentDate("01012000","0000");
        appointment.setAppointmentDestination("default");
        goService = new GoService();
        groupMemberList = new LinkedList<String>();
        groupMemberList.add(user.getUserName()); //the user who creates the group is user by default
    }

    /**
     * Admin can create a Link and send it with an extern messenger to the person he wants to add to
     * the group.
     * @param group where the created link corresponds to.
     */
    public String getGroupLinkToSend(Group group) {
        //server creates link and it's just saved there
        //TODO
        String link = null;
        return link;
    }

    /**
     * Adds a new group member to the given group.
     * @param group to add the member to
     * @param user to be added
     */
    public void addGroupMember(Group group, SimpleUser2 user) {
        sUser.insertUserData(user); //just if user does not exist already
        sAlloc.insertNewGroupMemberAlloc(group.groupID, user.getUserID());
    }

    /**
     * Admin can upgrade a group member to an admin.
     * @param group where user should become admin
     * @param user to become new admin of the group (while the other one still exists)
     */
    public void makeGroupMemberToAdmin(Group group, SimpleUser2 user) {
        sAlloc.updateGroupMemberToAdmin(group.getGroupID(), user.getUserID());//set admin boolean true
        //TODO
    }

    /**
     * Get all the member names who are in the same group.
     * @param group to show the members of
     * @return names of all users which are in the given group
     */
    public List<String> getAllGroupMemberNames(Group group) {
        sAlloc.readAllUserIdsOfOneGroup(group.groupID); //returns list of all user id's which are in this group
        sUser.readAllUsers(); //compare the id's and add the names which are in both lists to the groupMemberList
        //TODO
        return groupMemberList;
    }

    /**
     * Group admin deletes one of his group members. After that it has to be checked, if the deleted
     * user is still in any other group with the actual user. If not also delete this user from the
     * user.db
     * @param group of the group to delete the user
     * @param user of the user to delete
     */
    public void deleteGroupMember(Group group, SimpleUser2 user) {
        sAlloc.deleteGroupMemberAlloc(group.getGroupID(), user.getUserID());
        //check if user has to be deleted (not in any other group with the actual user)
        //TODO
    }

    /**
     * User leaves group by himself. It's like the admin deletes a group member.
     * @param group
     * @param user
     */
    public void leaveGroup(Group group, SimpleUser2 user) {
        group.deleteGroupMember(group, user);
        //TODO
    }

    /**
     * Set the time and date of a new appointment.
     * @param group with the appointment
     * @param date of the appointment
     * @param time of the appointment
     */
    public void setGroupAppointmentDate(Group group, Appointment appointment, String date, String time) {
        appointment.setAppointmentDate(date, time);
        sApp.updateData(group.getGroupID(), appointment);
        //TODO
    }

    /**
     * Set a new destination just with the address of the place where the group will meet.
     * The coordinates of that place will be generated.
     * @param group
     * @param appointment
     * @param destination
     */
    public void setGroupAppointmentDestinationName(Group group, Appointment appointment, String destination) {
        appointment.setAppointmentDestination(destination);
        sApp.updateData(group.getGroupID(), appointment);
        //TODO
    }

    /**
     * Set a new destination over the map and just set a needle where the group will meet. The name
     * will be generated.
     * @param group
     * @param latitude
     * @param longitude
     */
    public void setGroupAppointmentDestinationCoordinate(Group group, int latitude, int longitude){

    }

    /**
     * Activate the go button of the current group of the actual user.
     * @param group in which actual user says that he will be on his way to the appointment.
     */
    public void activateGoService(Group group) {
        goService.activateGoStatus();//sets goStatus to true
        sGroup.updateGroupData(group); //updates go service in database
    }

    /**
     * Deactivate the go button of the current group of the actual user.
     * This normally happens after the appointment is over.
     * @param group of the group who met
     */
    public void deactivateGoService(Group group) {
        goService.deactivateGoStatus();//sets goStatus to false
        sGroup.updateGroupData(group);//updates go service in database
    }

    /**
     * Change the name of the group to a different unique one.
     * @param newGroupName of the group
     */
    public void changeGroupName(Group group, String newGroupName) {
        //check newGroupName is unique (server)
        sGroup.updateGroupData(group);
        groupName = newGroupName;
    }

    /**
     * Get the group id of the group.
     * @return group id
     */
    public int getGroupID() {
        return groupID;
    }

    /**
     * Get the name of the group.
     * @return group name
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Get the date and the time of the appointment of the group.
     * @return date and time
     */
    public AppointmentDate getAppointmentDate() {
        return date;
    }

    /**
     * Get the destination name and the position of the appointment of the group.
     * @return destinantion name and destination position
     */
    public AppointmentDestination getAppointmentDest() {
        return destination;
    }

    /**
     * Get the go service of the group of the actual user.
     * @return go service
     */
    public GoService getGoService() {
        return goService;
    }
}
