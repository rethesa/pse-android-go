package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Appointment;

import java.util.List;

/**
 * Created by Theresa on 11.01.2017.
 * Appointment erstellen
 * Appointment löschen
 * Appointment ändern
 * Informationen über Appointent bekommen: return Appointment
 */

public class ServiceAppointment implements Service {

    private final DBHelperAppointment dbHelperAppointment;
    private SQLiteDatabase db;

    public ServiceAppointment(Context context) {
        dbHelperAppointment = new DBHelperAppointment(context.getApplicationContext());
    }

    /**
     * Insert the very first appointment for the group.
     * @param groupID of the group the appointment is for
     * @param appointment of the group (date, time, destination)
     * @return
     */
    public boolean insertAppointment(int groupID, Appointment appointment) {
        db = dbHelperAppointment.getWritableDatabase();
        try {

            return false;
        } finally {
            db.close();
        }
    }

    /**
     * Get information about the appointment through the corresponding group
     * @param groupID of the group to get information about the appointment
     * @return appointment object
     */
    public Appointment readAppointmentData(int groupID) {
        return null;
    }

    /**
     * Appointment will be deleted if group will be deleted.
     * @param groupID delete the appointment of this group
     * @return true if the deletion was successful
     */
    @Override
    public boolean deleteData(int groupID) {
        return false;
    }

    /**
     * Every group hast just one Appointment, so if there is a new Appointment it will override the
     * old one. So update is the most important method of appointment.
     * @param groupID to actualise the corresponding appointment
     * @return true if update was successful
     */
    @Override
    public boolean updateData(int groupID) {
        return false;
    }

}
