package com.example.androidgoapp.androidgoapp.model.objectStructure;

/**
 * Created by Theresa on 20.12.2016.
 */

public class GroupMemberClient extends UserDecoratorClient {

    public GroupMemberClient(String name) {
        super(name);
    }

    @Override
    public boolean getView() {
        return false;
    }

}
