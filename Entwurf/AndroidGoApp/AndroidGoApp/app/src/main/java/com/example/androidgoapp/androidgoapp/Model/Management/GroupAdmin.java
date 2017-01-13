package com.example.androidgoapp.androidgoapp.Model.Management;

/**
 * Created by Theresa on 20.12.2016.
 */

public class GroupAdmin extends UserDecorator {

    public GroupAdmin(String name) {
        super(name);
    }


    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public int getUserID() {
        return 0;
    }

    @Override
    public String getUserDeviceId() {
        return null;
    }

    @Override
    public boolean getView() {
        return false;
    }
}
