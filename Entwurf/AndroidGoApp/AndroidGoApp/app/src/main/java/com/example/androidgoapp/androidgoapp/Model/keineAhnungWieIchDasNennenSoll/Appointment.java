package com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll;

/**
 * Created by Schokomonsterchen on 21.12.2016.
 */

public class Appointment {

    private AppointmentDate appointmentDate;
    private AppointmentDestination appointmentDestination;
    //private DestinationPosition destinationPosition; //latitude and longitude

    protected void Appointment() {
        appointmentDate.setDate("01012000");//default
        appointmentDate.setTime("0000");//default
        appointmentDestination.setDestinationName(""); //coordinates will be created out of the name
    }

    protected void setAppointmentDate(String stringDate, String stringTime) {
        appointmentDate.setDate(stringDate);
        appointmentDate.setTime(stringTime);
    }

    protected void setAppointmentDestination(String appointmentDestination){

    }

    protected AppointmentDate getAppointmentDate() {
        return appointmentDate;
    }
}