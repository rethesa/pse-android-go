package com.example.androidgoapp.androidgoapp.Database;

import android.database.Cursor;

/**
 * Created by Theresa on 10.01.2017.
 */

public interface Service {

    public Cursor readData(String name);
    public boolean deleteData(String name);
    public boolean updateData(String name);

}
