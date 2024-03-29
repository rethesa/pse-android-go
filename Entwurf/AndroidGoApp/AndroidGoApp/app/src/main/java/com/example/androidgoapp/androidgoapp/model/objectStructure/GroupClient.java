package com.example.androidgoapp.androidgoapp.model.objectStructure;

import com.example.androidgoapp.androidgoapp.controller.database.ServiceAllocation;
import com.example.androidgoapp.androidgoapp.controller.database.ServiceAppointment;
import com.example.androidgoapp.androidgoapp.controller.database.ServiceGroup;
import com.example.androidgoapp.androidgoapp.controller.database.ServiceUser;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by Theresa on 20.12.2016.
 */

public class GroupClient {

    private int groupID;
    private String groupName;
    private Appointment appointment;
    private AppointmentDate date;
    private AppointmentDestination appointmentDestination;
    private GoStatus goStatus;
    private List<String> groupMemberList;

    private GroupClient groupClient;

    private ServiceGroup sGroup;
    private ServiceUser sUser;
    private ServiceAppointment sApp;
    private ServiceAllocation sAlloc;

    public GroupClient(String name, UserComponent user) {
        this.groupName = name;
        //this.groupID =     increases
        appointment.setAppointmentDate("01012000","0000");
        appointment.setAppointmentDestination("default");
        goStatus = new GoStatus(null);//????? CONSTRUCTOR IN GOSERVICE
        groupMemberList = new LinkedList<String>();
        groupMemberList.add(user.getUserName()); //the user who creates the group is user by default
    }

    /**
     * Admin can create a Link and send it with an extern messenger to the person he wants to add to
     * the groupClient.
     */
    public Link createInviteLink() {
        //server creates link and it's just saved there
        //TODO
        Link link = null;
        return link;
    }

    /**
     * Adds a new groupClient member to the given groupClient.
     * @param user to be added
     */
    public void addGroupMember(UserComponent user) {
        sUser.insertUserData(user); //just if user does not exist already
        sAlloc.insertNewGroupMemberAlloc(groupClient.groupID, user.getUserID());
    }

    /**
     * Admin can upgrade a groupClient member to an admin.
     * @param user to become new admin of the groupClient (while the other one still exists)
     */
    public void makeGroupMemberToAdmin(UserComponent user) {
        sAlloc.updateGroupMemberToAdmin(groupClient.getGroupID(), user.getUserID());//set admin boolean true
        //TODO
    }

    /**
     * Get all the member names who are in the same groupClient.
     * @return names of all users which are in the given groupClient
     */
    public List<String> getAllGroupMemberNames() {
        sAlloc.readAllUserIdsOfOneGroup(groupClient.groupID); //returns list of all user id's which are in this groupClient
        sUser.readAllUsers(); //compare the id's and add the names which are in both lists to the groupMemberList
        //TODO
        return groupMemberList;
    }

    /**
     * GroupClient admin deletes one of his groupClient members. After that it has to be checked, if the deleted
     * user is still in any other groupClient with the actual user. If not also delete this user from the
     * user.db
     * @param user of the user to delete
     */
    public void deleteGroupMember(UserComponent user) {
        sAlloc.deleteGroupMemberAlloc(groupClient.getGroupID(), user.getUserID());
        //check if user has to be deleted (not in any other groupClient with the actual user)
        //TODO
    }

    /**
     * User leaves groupClient by himself. It's like the admin deletes a groupClient member.
     * @param user
     */
    public void leaveGroup(UserComponent user) {
        groupClient.deleteGroupMember(user);
        //TODO
    }

    /**
     * Activate the go button of the current groupClient of the actual user.
     */
    public void activateGoService() {
        goStatus.activateGoStatus();//sets goStatus to true
        sGroup.updateGroupData(groupClient); //updates go service in database
    }

    /**
     * Deactivate the go button of the current groupClient of the actual user.
     * This normally happens after the appointment is over.
     */
    public void deactivateGoService() {
        goStatus.deactivateGoStatus();//sets goStatus to false
        sGroup.updateGroupData(groupClient);//updates go service in database
    }

    /**
     * Change the name of the groupClient to a different unique one.
     * @param newGroupName of the groupClient
     */
    public void changeGroupName(String newGroupName) {
        //check newGroupName is unique (server)
        sGroup.updateGroupData(groupClient);
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
     * Get the go service of the group of the actual user.
     * @return go service
     */
    public GoStatus getGoStatus() {
        return goStatus;
    }


    /**
     * Get the appointment (time, date, name or destination) of the group.
     * @return appointment information
     */
    public Appointment getAppointment() {
        return appointment;
    }

    /**
     * Find out what kind of user (GroupAdminClient or GroupMemberClient) the actual user is, so he gets the
     * right view of the group. The GroupAdminClient has more functionality than a GroupMemberClient and because
     * of that the GroupAdminClient gets a different view.
     * @param userId
     * @return the type of the actual user in this group.
     */
    public UserComponent getMember(int userId) {
        UserComponent us = null;
        return us;
    }

}