package com.example.androidgoapp.androidgoapp.Model.Management;

import com.example.androidgoapp.androidgoapp.Model.MapView;


/**
 * To get the positions of all group members every few seconds.
 */

public class GoService implements Runnable {

    Group group;
    boolean goStatus;
    MapView map;

    protected GoService() {
        goStatus = false;
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


    /**
     * When user presses his go Button he activates his go status and sends his position in
     * regular periods to the other group members.
     */
    protected void activateGoStatus(){
        goStatus = true;
    }

    protected void deactivateGoStatus() {
        goStatus = false;
    }







    void updateGroup(){

    }

    void updateMap() {

    }


}


