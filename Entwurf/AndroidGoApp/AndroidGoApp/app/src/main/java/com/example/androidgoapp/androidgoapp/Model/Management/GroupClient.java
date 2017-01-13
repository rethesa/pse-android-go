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

public class GroupClient {

    private int groupID;
    private String groupName;
    private Appointment appointment;
    private AppointmentDate date;
    private DestinationName destinationName;
    private DestinationPosition destinationPosition;
    private GoStatus goStatus;
    private List<String> groupMemberList;

    private GroupClient groupClient;

    private ServiceGroup sGroup;
    private ServiceUser sUser;
    private ServiceAppointment sApp;
    private ServiceAllocation sAlloc;

    public GroupClient(String name, UserDecorator user) {
        this.groupName = name;
        //this.groupID =     increases
        appointment.setAppointmentDate("01012000","0000");
        appointment.setAppointmentDestination("default");
        goStatus = new GoStatus(null);//????? CONSTRUCTOR IN GOSERVICE
        groupMemberList = new LinkedList<String>();
        groupMemberList.add(user.getUserName()); //the user who creates the group is user by default
    }

    /**
     * Admin can create a Links and send it with an extern messenger to the person he wants to add to
     * the groupClient.
     * @param groupClient where the created link corresponds to.
     */
    public Links createInviteLink() {
        //server creates links and it's just saved there
        //TODO
        Links links = null;
        return links;
    }

    /**
     * Adds a new groupClient member to the given groupClient.
     * @param groupClient to add the member to
     * @param user to be added
     */
    public void addGroupMember(UserDecorator user) {
        sUser.insertUserData(user); //just if user does not exist already
        sAlloc.insertNewGroupMemberAlloc(groupClient.groupID, user.getUserID());
    }

    /**
     * Admin can upgrade a groupClient member to an admin.
     * @param groupClient where user should become admin
     * @param user to become new admin of the groupClient (while the other one still exists)
     */
    public void makeGroupMemberToAdmin(UserDecorator user) {
        sAlloc.updateGroupMemberToAdmin(groupClient.getGroupID(), user.getUserID());//set admin boolean true
        //TODO
    }

    /**
     * Get all the member names who are in the same groupClient.
     * @param groupClient to show the members of
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
     * @param groupClient of the groupClient to delete the user
     * @param user of the user to delete
     */
    public void deleteGroupMember(UserDecorator user) {
        sAlloc.deleteGroupMemberAlloc(groupClient.getGroupID(), user.getUserID());
        //check if user has to be deleted (not in any other groupClient with the actual user)
        //TODO
    }

    /**
     * User leaves groupClient by himself. It's like the admin deletes a groupClient member.
     * @param groupClient
     * @param user
     */
    public void leaveGroup(UserDecorator user) {
        groupClient.deleteGroupMember(user);
        //TODO
    }

    /**
     * Set the time and date of a new appointment.
     * @param groupClient with the appointment
     * @param date of the appointment
     * @param time of the appointment
     */
    public void setGroupAppointmentDate(String date, String time) {
        appointment.setAppointmentDate(date, time);
        sApp.updateData(groupClient.getGroupID(), appointment);
        //TODO
    }

    /**
     * Set a new destination just with the address of the place where the groupClient will meet.
     * The coordinates of that place will be generated.
     * @param groupClient
     * @param appointment
     * @param destination
     */
    public void setGroupAppointmentDestinationName(String destination) {
        appointment.setAppointmentDestination(destination);
        sApp.updateData(groupClient.getGroupID(), appointment);
        //TODO
    }

    /**
     * Set a new destination over the map and just set a needle where the groupClient will meet. The name
     * will be generated.
     * @param groupClient
     * @param latitude
     * @param longitude
     */
    public void setGroupAppointmentDestinationCoordinate(float latitude, float longitude){

    }

    /**
     * Activate the go button of the current groupClient of the actual user.
     * @param groupClient in which actual user says that he will be on his way to the appointment.
     */
    public void activateGoService() {
        goStatus.activateGoStatus();//sets goStatus to true
        sGroup.updateGroupData(groupClient); //updates go service in database
    }

    /**
     * Deactivate the go button of the current groupClient of the actual user.
     * This normally happens after the appointment is over.
     * @param groupClient of the groupClient who met
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
     * Get the date and the time of the appointment of the group.
     * @return date and time
     */
    public AppointmentDate getAppointmentDate() {
        return date;
    }

    /**
     * Get the destination name of the appointment of the group.
     * @return destinantion name and destination position
     */
    public DestinationName getAppointmentName() {
        return destinationName;
    }

    /**
     * Get the destination position on the map of the appointment of the group.
     * @return
     */
    public DestinationPosition getAppointmentPosition() {
        return destinationPosition;
    }

    /**
     * Get the go service of the group of the actual user.
     * @return go service
     */
    public GoStatus getGoStatus() {
        return goStatus;
    }

    /**
     * Find out what kind of user (GroupAdmin or GroupMember) the actual user is, so he gets the
     * right view of the group. The GroupAdmin has more functionality than a GroupMember and because
     * of that the GroupAdmin gets a different view.
     * @param userId
     * @return the type of the actual user in this group.
     */
    public UserComponent getMember(int userId) {
        UserComponent us = null;
        return us;
    }


    /**
     public Appointment getAppointment();

     */
}