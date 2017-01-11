package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.SimpleUser2;

import java.util.List;

/**
 * Created by Theresa on 11.01.2017.
 *  * user hinzufügen
 * user löschen
 * user updaten
 * user lesen
 */

public class ServiceUser implements Service{

    private final DBHelperUser dbHelperUser;
    private SQLiteDatabase db;

    public ServiceUser(Context context) {
        dbHelperUser = new DBHelperUser(context.getApplicationContext());
    }

    /**
     * Add a new user to the database.
     * @param user object
     * @return true if insertion was successful
     */
    public boolean insertUserData(SimpleUser2 user) {
        db = dbHelperUser.getWritableDatabase();
        return false;
    }

    /**
     * Get Information about user.
     * @param userID of the user to get information about
     * @return user object
     */
    public SimpleUser2 readUserData(int userID) {
        return null;
    }

    /**
     * Get all members of all groups the actual user is member of.
     * @return list of all names that are listed in the user database.
     */
    public List<String> getAllUserNames() {
        db = dbHelperUser.getReadableDatabase();
        List<String> res = null;
        return res;
    }

    protected List<SimpleUser2> getAllUsers() {
        db = dbHelperUser.getReadableDatabase();
        List<SimpleUser2> res = null;
        return res;
    }

    /**
     * Delete user.
     * @param userID of the user to delete
     * @return true if deletion was successful
     */
    @Override
    public boolean deleteData(int userID) {
        return false;
    }

    /**
     * Update inforamtion about user.
     * @param userID of the user to update
     * @return true if update was successful
     */
    @Override
    public boolean updateData(int userID) {
        return false;
    }

}
