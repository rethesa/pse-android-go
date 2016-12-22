package com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll;

import com.example.androidgoapp.androidgoapp.Model.MapView;
import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Group;


/**
 * To get the positions of all group members every few seconds.
 */

public class GoService implements Runnable {

    Group group;
    boolean goStatus = false;
    MapView map;

    protected GoService() {

    }

    /**
     * update gps coords of groupmembers every 5 seconds.
     */
    @Override
    public void run() {
        while(this.goStatus) {
            group.update();
        }
    }

    void updateGroup(){

    }

    void updateMap() {

    }


}


