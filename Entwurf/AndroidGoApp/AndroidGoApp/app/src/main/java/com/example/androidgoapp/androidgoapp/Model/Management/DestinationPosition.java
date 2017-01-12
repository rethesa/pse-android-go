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
     * Admin chooses a place on the map where the group will meet.
     * @param destinationPosition
     */
    protected String setDestinationNameByCoordinates(Pair<Float, Float> destinationPosition) {
        String destinationName = null;//get with osmdroid
        return destinationName;
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
