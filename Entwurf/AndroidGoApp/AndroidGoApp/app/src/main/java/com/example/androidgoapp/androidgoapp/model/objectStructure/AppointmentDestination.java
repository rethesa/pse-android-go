package com.example.androidgoapp.androidgoapp.model.objectStructure;

import android.util.Pair;

/**
 * Created by Theresa on 13.01.2017.
 */

public class AppointmentDestination {

    private String destinationName;
    private float latitude;
    private float longitude;
    private Pair<Float,Float> destinationPosition;

    private AppointmentDestination() {
        //destinationPosition = new Pair<>(latitude,latitude);
    }

    protected void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    protected void setDestinationPosition(Pair<Float, Float> destinationPosition) {
        this.destinationPosition = destinationPosition;
    }

    protected String getDestinationName() {
        return destinationName;
    }

    protected Pair<Float,Float> getDestinationPosition() {
        return destinationPosition;
    }
}

