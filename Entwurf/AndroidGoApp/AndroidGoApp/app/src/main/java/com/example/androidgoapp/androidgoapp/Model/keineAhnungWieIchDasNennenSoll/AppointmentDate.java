package com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Theresa on 20.12.2016.
 */

public class AppointmentDate {

    private SimpleDateFormat dateParser= new SimpleDateFormat("dd.MM.yyyy");
    private SimpleDateFormat timeParser = new SimpleDateFormat("HH:mm");
    private java.util.Date date;
    private java.util.Date time;

    protected AppointmentDate(){
    }

    protected void setDate(String stringDate) {
        try {
            this.date = dateParser.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    protected void setTime(String stringTime) {
        try {
            this.time = timeParser.parse(stringTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /*public Date getDate() {
        return date;
    }*/

    /*
    public Date getTime() {
        return time;
    }*/

}
