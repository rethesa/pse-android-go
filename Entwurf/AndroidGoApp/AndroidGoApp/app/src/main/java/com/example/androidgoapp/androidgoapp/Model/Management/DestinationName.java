package com.example.androidgoapp.androidgoapp.Model.Management;

import android.util.Pair;

/**
 * Created by Theresa on 20.12.2016.
 */

public class DestinationName {

    private String destinationName;

    private DestinationName() {
    }

    /**
     * Admin chooses a place on the map where the group will meet.
     * @param destinationPosition
     */
    protected String setDestinationNameByPosition(Pair<Float, Float> destinationPosition) {
        String destinationName = null;//get with osmdroid
        return destinationName;
    }

    /**
     * Get name of the destination to show in activity.
     * @return name
     */
    protected String getDestinationName() {
        return destinationName;
    }

}
