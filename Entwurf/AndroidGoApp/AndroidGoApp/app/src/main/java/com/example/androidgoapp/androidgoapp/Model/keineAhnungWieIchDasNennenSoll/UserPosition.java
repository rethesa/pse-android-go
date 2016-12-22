package com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll;

import android.util.Pair;

/**
 * Created by Theresa on 20.12.2016.
 */

public class UserPosition {

    private int xCoordinate;
    private int yCoordinate;

    private Pair<Integer,Integer> position;

    private UserPosition() {
    }

    protected Pair getPosition(int userID) {
        //TODO
        return position;
    }

    public void showPositionOnMap(Pair<Integer, Integer> position) {
        //TODO
    }
}
