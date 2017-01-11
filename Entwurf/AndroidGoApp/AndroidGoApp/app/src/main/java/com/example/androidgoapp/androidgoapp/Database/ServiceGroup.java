package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Group;

/**
 * Created by Theresa on 11.01.2017.
 */

public class ServiceGroup implements Service {

    private final DBHelperGroup dbHelperGroup;
    private SQLiteDatabase db;

    public ServiceGroup(Context context) {
        dbHelperGroup = new DBHelperGroup(context.getApplicationContext());
    }

    /**
     * Add a group to database.
     * @param group to add
     * @return return true if insertig was successful
     */
    public boolean insertData(Group group) {
        db = dbHelperGroup.getWritableDatabase();
        return false;
    }

    /**
     * Get information about the given group id.
     * @param groupName name of the group to get information from
     * @return information of the group
     */
    public Cursor readData(String groupName) {
        db = dbHelperGroup.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from contacts where id=" + groupName + "", null );
        return res;
    }

    /**
     * Delete a group.
     * @param groupName name of the group to delete
     * @return true if deletion was successful
     */
    public boolean deleteData(String groupName) {
        return false;
    }

    /**
     * Update data when information about the group have changed.
     * @param groupName name of the group to update
     * @return true if update was successful
     */
    public boolean updateData(String groupName) {
        db = dbHelperGroup.getWritableDatabase();
        return false;
    }
}
