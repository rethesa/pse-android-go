package com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by Theresa on 20.12.2016.
 */

public class Group {

    private String groupName;
    private int groupID;
    private AppointmentDate date;
    private AppointmentDestination destination;
    private GoService goService;
    private List<GroupMember> groupMemberList;

    protected Group(String name, Administrator admin) {
        this.groupName = name;
        //this.groupID =
        date.setDate("01012020"); //default date 01.01.2020
        date.setTime("0000"); //default time at 00:00
        destination.setDestination("default"); //some default destination (must be on the map)
        //goService
        groupMemberList = new LinkedList<GroupMember>();
        groupMemberList.add(admin);
    }

    protected List getAllGroupMembers(Group group) {
        //TODO
        return groupMemberList;
    }

    /*
    schauen ob sich irgendwas in den Gruppen getan hat, also ob Mitglieder hinzugefügt/ gelöscht wurden,...
     */
    void update() {

    }

    /** set current groups go status to "go"
     *
     */
    public void activateGoStatus() {

    }

    public void leaveGroup() {
        //TODO
    }

    public void getGroupLink() {
        //TODO
    }

    public void deleteGroupMember(int _ID, String name) {
        //TODO
    }

    public void makeGroupMemberToAdmin(int _ID, String name) {
        //TODO
    }

    public void changeGroupName(String name) {
        //TODO
    }

    public void setAppointmentDate(String date, String time) {
        //TODO
    }

    public void setAppointmentDestination(String destination) {
        //TODO
    }


}
