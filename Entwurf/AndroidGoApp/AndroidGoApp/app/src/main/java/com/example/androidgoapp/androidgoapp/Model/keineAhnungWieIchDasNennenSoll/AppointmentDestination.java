package com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll;

import android.util.Pair;

/**
 * Created by Theresa on 20.12.2016.
 */

public class AppointmentDestination {

    private String destinationName;
    private float latitude;
    private float longitude;

    private AppointmentDestination() {
    }


    /**
     * Admin of the group writes the address of the place the group will meet and if address is valid
     * the app will show the place on the map.
     * @param destinationName where the group will meet
     */
    protected void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
        //get coordinates of this place
    }

    /**
     * Set the Destination Coordinates and get the name of this place with osmdroid
     * @param latitude
     * @param longitude
     */
    protected void setDestinationCoordinates(int latitude, int longitude) {

    }

    /**
     * Get name of the destination to show in activity.
     * @return name
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * Get the coordinates of the destination to show on the map.
     * @return pair of latitude and longitude
     */
    public Pair<Float, Float> getCoordinates() {
        return null;
    }


}
