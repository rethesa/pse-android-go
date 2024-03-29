package com.example.androidgoapp.androidgoapp.model.objectStructure;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Theresa on 20.12.2016.
 */

public class AppointmentDate {

    private SimpleDateFormat dateParser= new SimpleDateFormat("dd.MM.yyyy");
    private SimpleDateFormat timeParser = new SimpleDateFormat("HH:mm");
    private java.util.Date date;
    private java.util.Date time;

    private AppointmentDate(){
    }

    /**
     * Set the date of the appointment of the group
     * @param stringDate in dd.MM.yyyy
     */
    protected void setDate(String stringDate) {
        try {
            this.date = dateParser.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Set the time of the appointment for the group.
     * @param stringTime time in HH:mm
     */
    protected void setTime(String stringTime) {
        try {
            this.time = timeParser.parse(stringTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get the date of the appointment.
     * @return date of the appointment
     */
    protected Date getDate() {
        return date;
    }

    /**
     * Get the time of the appointment.
     * @return time of the appointment
     */
    protected Date getTime() {
        return time;
    }


}
