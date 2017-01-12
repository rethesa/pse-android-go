package com.example.androidgoapp.androidgoapp.Model.Management;

import android.util.Pair;

/**
 * Created by Theresa on 20.12.2016.
 */

public class AppointmentDestination {

    private String destinationName;
    DestinationPosition destinationPosition;

    private AppointmentDestination() {
    }

    /**
     * Admin of the group writes the address of the place the group will meet and if address is valid
     * the app will show the place on the map.
     * @param destinationName where the group will meet
     */
    protected DestinationPosition setDestinationCoordinatesByName(String destinationName) {
        this.destinationName = destinationName;
        //get coordinates of this place with osmdroid
        return destinationPosition;
    }

    /**
     * Get name of the destination to show in activity.
     * @return name
     */
    protected String getDestinationName() {
        return destinationName;
    }

}
