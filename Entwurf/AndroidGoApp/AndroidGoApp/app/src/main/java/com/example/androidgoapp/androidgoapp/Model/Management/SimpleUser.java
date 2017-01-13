package com.example.androidgoapp.androidgoapp.Model.Management;

/**
 * Created by Theresa on 13.01.2017.
 */

public class SimpleUser {

    private String userName;
    private int userId;
    private String userDeviceId;


    public SimpleUser(String userName, String userDeviceId) {

    }
    /**
     * Change the name of the user to a different one.
     * @param name
     */
    public void changeUserName(String name) {
        userName = name;
        //TODO
    }
}
