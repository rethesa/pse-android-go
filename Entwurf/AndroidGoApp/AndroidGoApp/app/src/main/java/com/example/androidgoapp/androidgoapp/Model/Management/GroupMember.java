package com.example.androidgoapp.androidgoapp.Model.Management;

/**
 * Created by Theresa on 20.12.2016.
 */

public class GroupMember extends UserDecorator {

    public GroupMember(String name) {
        super(name);
    }

    @Override
    public boolean getView() {
        return false;
    }

}
