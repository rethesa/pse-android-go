package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Theresa on 11.01.2017.
 */

public class ServiceAllocation {

    private final DBHelperAllocation dbHelperAllocation;
    private SQLiteDatabase db;

    public ServiceAllocation(Context context) {
        dbHelperAllocation = new DBHelperAllocation(context.getApplicationContext());
    }

    /**
     * Make connection between group and group member
     * @param groupId to identify the group to add the user to
     * @param userId user to be added as member to the group
     * @return true if adding was successful
     */
    public boolean insertData(int groupId, int userId) {
        db = dbHelperAllocation.getWritableDatabase();
        return false;
    }

    /**
     * Get information about the given group id.
     * @param id of the group or the member to get information about
     * @return information about the group or the member
     */
    public Cursor readData(int id) {
        return null;
    }

    /**
     * Delete connection betwenn an group and its member.
     * @param groupid the group in which to delte the member
     * @param userId meber to delete in group
     * @return true if deletion was successful
     */
    public boolean deleteData(int groupid, int userId) {
        return false;
    }

    /**
     * Update data between group and group member
     * @param id of group or member to update
     * @return true if update was successful
     */
    public boolean updateData(int id) {
        return false;
    }
}
