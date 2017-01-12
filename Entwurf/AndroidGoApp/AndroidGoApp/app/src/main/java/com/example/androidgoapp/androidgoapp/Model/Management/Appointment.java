package com.example.androidgoapp.androidgoapp.Model.Management;

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
        appointmentDestination.setDestinationCoordinatesByName(""); //coordinates will be created out of the name
    }

    /**
     * Set new date and time for the next appointment.
     * @param stringDate
     * @param stringTime
     */
    protected void setAppointmentDate(String stringDate, String stringTime) {
        appointmentDate.setDate(stringDate);
        appointmentDate.setTime(stringTime);
    }

    /**
     * Set a new destination for the appointment.
     * @param appointmentDestination
     */
    protected void setAppointmentDestination(String appointmentDestination){

    }

    /**
     * To show in activity.
     * @return
     */
    public AppointmentDate getAppointmentDate() {
        return appointmentDate;
    }
}