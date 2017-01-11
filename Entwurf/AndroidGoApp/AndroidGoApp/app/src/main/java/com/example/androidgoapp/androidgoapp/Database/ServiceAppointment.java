package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Theresa on 11.01.2017.
 */

public class ServiceAppointment implements Service {

    private final DBHelperAppointment dbHelperAppointment;
    private SQLiteDatabase db;

    public ServiceAppointment(Context context) {
        dbHelperAppointment = new DBHelperAppointment(context.getApplicationContext());
    }

    @Override
    public Cursor readData(String name) {
        return null;
    }

    @Override
    public boolean deleteData(String name) {
        return false;
    }

    @Override
    public boolean updateData(String name) {
        return false;
    }
}
