package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.SimpleUser2;

/**
 * Created by Theresa on 11.01.2017.
 */

public class ServiceUser implements Service {

    private final DBHelperUser dbHelperUser;
    private SQLiteDatabase db;

    public ServiceUser(Context context) {
        dbHelperUser = new DBHelperUser(context.getApplicationContext());
    }

    public boolean insertData(SimpleUser2 user) {
        db = dbHelperUser.getWritableDatabase();
        return false;
    }

    @Override
    public Cursor readData(String userName) {
        return null;
    }

    @Override
    public boolean deleteData(String userName) {
        return false;
    }

    @Override
    public boolean updateData(String userName) {
        return false;
    }
}
