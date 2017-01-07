package com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll;

/**
 * Created by Schokomonsterchen on 21.12.2016.
 */

public class Appointment {

    private AppointmentDate appointmentDate;
    private AppointmentDestination appointmentDestination;

    protected void setAppointmentDate(String stringDate) {
        appointmentDate.setDate(stringDate);
    }

    protected void setAppointmentDestination(String stringappointmentDestination) {
        appointmentDestination.setDestination(stringappointmentDestination);
    }

}