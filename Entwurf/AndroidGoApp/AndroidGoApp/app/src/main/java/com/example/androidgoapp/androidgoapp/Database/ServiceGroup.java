package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Group;

import java.util.List;

/**
 * Created by Theresa on 11.01.2017.
 *
 * Gruppe hinzufügen
 * Gruppe löschen
 * Gruppe aktualisieren
 * alle informationen zu einer Gruppe abrufen
 */

public class ServiceGroup implements Service {

    private final DBHelperGroup dbHelperGroup;
    private SQLiteDatabase db;

    public ServiceGroup(Context context) {
        dbHelperGroup = new DBHelperGroup(context.getApplicationContext());
    }

    /**
     * Add a new group to database.
     * @param group to add
     * @param userID
     * @return return true if insertig was successful
     */
    public boolean insertNewGroup(Group group, int userID) {
        ServiceAllocation sa = null;
        sa.insertNewGroup(group.getGroupID(), userID);//adds to allocation
        db = dbHelperGroup.getWritableDatabase();
        return false;
    }

    /**
     * Get information about the group with the given group id.
     * @param groupID of the group to get information about
     * @return group object
     */
    public Group readGroupData(int groupID) {
        db = dbHelperGroup.getReadableDatabase();
        return null;
    }

    /**
     * To get all groups the actual user is member of and because all the groups saved in the database
     * are just the ones he is member of, we can go through the list and return all group names
     * @return list of all names that are listed in the group database.
     */
    public List<String> getAllGroupNames() {
        db = dbHelperGroup.getReadableDatabase();
        List<String> res = null;
        return res;
    }

    /**
     * Delete a group.
     * @param groupID of the group to delete
     * @return true if deletion was successful
     */
    @Override
    public boolean deleteData(int groupID) {
        return false;
    }

    /**
     * Update data when information about the group has changed.
     * @param groupID of the group to update
     * @return true if update was successful
     */
    @Override
    public boolean updateData(int groupID) {
        db = dbHelperGroup.getWritableDatabase();
        return false;
    }

}
