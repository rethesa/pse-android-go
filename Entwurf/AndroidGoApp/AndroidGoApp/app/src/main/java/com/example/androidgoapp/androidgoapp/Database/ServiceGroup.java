package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.androidgoapp.androidgoapp.Model.Management.Group;

import java.util.List;

/**
 * Created by Theresa on 11.01.2017.
 *
 * Gruppe hinzufügen
 * Gruppe löschen
 * Gruppe aktualisieren
 * alle informationen zu einer Gruppe abrufen
 *
 */

public class ServiceGroup {

    private final DBHelperGroup dbHelperGroup;
    private SQLiteDatabase db;
    private ServiceAllocation sAlloc;
    private ServiceUser sUser;
    private ServiceAppointment sApp;

    public ServiceGroup(Context context) {
        dbHelperGroup = new DBHelperGroup(context.getApplicationContext());
    }

    /**
     * Add a new group to group.db database
     * @param group to add to database
     * @param userID of the user who created the group and will be admin
     * @return return true if inserting was successful
     */
    public boolean insertNewGroup(Group group, int userID) {
        //TODO
        db = dbHelperGroup.getWritableDatabase();
        return false;
    }

    /**
     * Get name and go service of the group with the given group id.
     * @param groupID of the group to get information about
     * @return group object
     */
    public Group readGroupData(int groupID) {
        //TODO
        db = dbHelperGroup.getReadableDatabase();
        return null;
    }

    /**
     * To get all groups the actual user is member of and because all the groups saved in the database
     * are just the ones he is member of, we can go through the list and return all group names
     * @return list of all names that are listed in the group database.
     */
    public List<String> readAllGroupNames() {
        //TODO
        db = dbHelperGroup.getReadableDatabase();
        List<String> res = null;
        return res;
    }

    /**
     * Delete a group in group.db.
     * @param groupID of the group to delete
     * @return true if deletion was successful
     */
    public boolean deleteGroupData(int groupID) {
        //TODO
        return false;
    }

    /**
     * Update data when group name or go service of the group have changed.
     * @param group to update name or go service
     * @return true if update was successful
     */
    public boolean updateGroupData(Group group) {
        //TODO
        db = dbHelperGroup.getWritableDatabase();
        return false;
    }

}