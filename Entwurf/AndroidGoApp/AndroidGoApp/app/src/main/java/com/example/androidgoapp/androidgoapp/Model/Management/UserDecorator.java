package com.example.androidgoapp.androidgoapp.Model.Management;

/**
 * Created by Theresa on 20.12.2016.
 */

public abstract class UserDecorator implements UserComponent{

    private String userName;
    private int userID;
    private GpsObject gpsObject;

    public UserDecorator(String name) {
        this.userName = name;
        //this.userID =
        //this.gpsObject
    }




    public String getUserName() {
        return userName;
    }

    public int getUserID() {
        return userID;
    }

    public GpsObject getGpsObject() {
        return gpsObject;
    }












}
