package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.androidgoapp.androidgoapp.Model.Management.SimpleUser2;

import java.util.List;

/**
 * Created by Theresa on 11.01.2017.
 *  * user hinzufügen
 * user löschen
 * user updaten
 * user lesen
 */

public class ServiceUser {

    private final DBHelperUser dbHelperUser;
    private SQLiteDatabase db;
    private ServiceAllocation sAlloc;

    public ServiceUser(Context context) {
        dbHelperUser = new DBHelperUser(context.getApplicationContext());
    }

    /**
     * Add a new user to the database (it just happens when when adding a new user to a group, and
     * also then not always, just if the user doesn't exist already).
     * @param user object
     * @return true if insertion was successful
     */
    public boolean insertUserData(SimpleUser2 user) {
        //TODO
        //check if the user is already in the list
        db = dbHelperUser.getWritableDatabase();
        return false;
    }

    /**
     * Get name, or the latitude and longitude of the user.
     * @param userID of the user to get information about
     * @return user object
     */
    public SimpleUser2 readUserData(int userID) {
        //TODO
        return null;
    }

    /**
     * Get all User objects of all groups the actual user is member of.
     * @return
     */
    public List<SimpleUser2> readAllUsers() {
        //TODO
        db = dbHelperUser.getReadableDatabase();
        List<SimpleUser2> res = null;
        return res;
    }

    /**
     * Delete user in user.db
     * @param userID of the user to delete
     * @return true if deletion was successful
     */
    public boolean deleteUser(int userID) {
        return false;
    }

    /**
     * Update inforamtion about user.
     * @param userID of the user to update
     * @return true if update was successful
     */
    public boolean updateData(int userID) {
        return false;
    }

}
