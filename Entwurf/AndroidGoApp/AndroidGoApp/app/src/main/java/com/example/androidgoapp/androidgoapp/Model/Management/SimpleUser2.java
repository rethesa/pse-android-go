package com.example.androidgoapp.androidgoapp.Model.Management;

/**
 * Created by Theresa on 20.12.2016.
 */

public abstract class SimpleUser2 {

    private String userName;
    private int userID;
    private UserPosition userPosition;

    public SimpleUser2(String name) {
        this.userName = name;
        //this.userID =
        //this.userPosition
    }

    /**
     * Change the name of the user to a different one.
     * @param name
     */
    public void changeUserName(String name) {
        userName = name;
        //TODO
    }

    public String getUserName() {
        return userName;
    }

    public int getUserID() {
        return userID;
    }

    public UserPosition getUserPosition() {
        return userPosition;
    }












}
