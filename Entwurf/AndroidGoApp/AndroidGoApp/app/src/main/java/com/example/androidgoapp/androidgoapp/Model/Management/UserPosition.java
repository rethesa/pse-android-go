package com.example.androidgoapp.androidgoapp.Model.Management;

import android.util.Pair;

/**
 * Created by Theresa on 20.12.2016.
 */

public class UserPosition {

    private float latitude;
    private float longitude;

    private Pair<Float,Float> userPosition;

    private UserPosition() {
    }

    protected Pair<Float, Float> getUserPosition() {
        //TODO
        return userPosition;
    }

    public void showUserPositionOnMap(Pair<Float, Float> position) {
        //TODO
    }
}
