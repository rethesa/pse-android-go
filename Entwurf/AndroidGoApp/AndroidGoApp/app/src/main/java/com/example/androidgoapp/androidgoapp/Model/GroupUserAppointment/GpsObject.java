package com.example.androidgoapp.androidgoapp.Model.GroupUserAppointment;

import android.util.Pair;

/**
 * Created by Theresa on 20.12.2016.
 */

public class GpsObject {

    private float latitude;
    private float longitude;
    private String timestamp;
    private Pair<Float,Float> userPosition;

    private GpsObject() {
    }

    public Pair<Float, Float> getGpsObject() {
        userPosition = new Pair<>(latitude, longitude);
        //TODO
        return userPosition;
    }

    /**
     * Time of the GpsObject to see how old it is.
     * @return
     */
    public String getTimestamp() {
        return timestamp;
    }

    public void showGpsObjectOnMap(Pair<Float, Float> position) {
        //TODO
    }
}
