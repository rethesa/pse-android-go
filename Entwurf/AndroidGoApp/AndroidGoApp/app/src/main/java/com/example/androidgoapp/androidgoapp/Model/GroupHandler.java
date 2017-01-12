package com.example.androidgoapp.androidgoapp.Model;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Group;
import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.GroupMember;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Theresa on 21.12.2016.
 */

public class GroupHandler {

    List<GroupMember> memberlist = new LinkedList<GroupMember>();

    void updateAllGroups() {

    }

    private List getAllGroups() {
        //Alle Gruppen des actual users bekommen
        return memberlist;
    }

    public void createGroup() {
        //Neue Gruppe hinzufügen
        //TODO
    }
}
