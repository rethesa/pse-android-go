package com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll;

import android.webkit.GeolocationPermissions;

import java.sql.Time;
import java.util.Date;

//if destination and date is definabel individual, this class is waste

/**
 * Created by Schokomonsterchen on 21.12.2016.
 */

public class Appointment {

    private GeolocationPermissions place;
    private Date date;
    private Time time;

    public void setPlace(GeolocationPermissions place) {
        this.place = place;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public GeolocationPermissions getPlace() {
        return place;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }
}
