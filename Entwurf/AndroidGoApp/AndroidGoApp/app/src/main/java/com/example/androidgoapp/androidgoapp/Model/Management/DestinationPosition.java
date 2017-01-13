package com.example.androidgoapp.androidgoapp.Model.Management;

import android.util.Pair;

/**
 * Created by Theresa on 12.01.2017.
 */

public class DestinationPosition {

    private float latitude;
    private float longitude;

    private Pair<Float,Float> destinationPosition;

    private DestinationPosition() {
    }

    /**
     * Admin of the group writes the address/ name of the place where the group will meet and if
     * the address/ name is valid the app will show the place on the map.
     * @param destinationName where the group will meet
     */
    protected Pair<Float, Float> setDestinationPositionByName(String destinationName) {
        destinationPosition = null; //get with osmdroid
        //get coordinates of this place with osmdroid
        return destinationPosition;
    }

    /**
     * Get the coordinates of the position of the destination.
     * @return
     */
    protected String getDestinationPosition() {
        return null;
    }

    /**
     * Coordinates of the destination to mark on the map for the group meeting.
     * @param destinationPosition
     */
    public void showDestinationPositionOnMap(Pair<Float, Float> destinationPosition) {
        //TODO
    }
}
