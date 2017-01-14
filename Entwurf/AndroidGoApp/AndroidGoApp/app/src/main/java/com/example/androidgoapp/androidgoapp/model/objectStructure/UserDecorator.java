package com.example.androidgoapp.androidgoapp.model.objectStructure;

import android.graphics.Point;

import java.security.Policy;

/**
 * Created by Theresa on 20.12.2016.
 */

public abstract class UserDecorator implements UserComponent {

    private String userName;
    private int userID;
    private GpsObject gpsObject;

    public UserDecorator(String name) {
        this.userName = name;
        //this.userID =
        //this.gpsObject
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public int getUserID() {
        return userID;
    }

    @Override
    public String getUserDeviceId() {
        return null;
    }

    @Override
    public Point getUserPosition() {
       return null;
    }

    public boolean getView() {
        return false;
    }

    public GpsObject getGpsObject() {
        return gpsObject;
    }

}
