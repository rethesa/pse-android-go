package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

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
     * Mitglied zu Gruppe hinzufügen
     * Mitglied aus Gruppe entfernen
     * Alle Mitglieder einer Gruppe bekommen
     * Alle Gruppen des actual users bekommen
     * Admins einer Gruppe bekommen
     * Neue Gruppe hinzufügen+++
     * Alte Gruppe löschen +++
     * Mitglied zu Admin machen
     */

    
    /**
     * This method is called, when ServiceGroup a new group to it's database adds. It creates a new
     * connection between group and group member. The very first group member is always admin,
     * because he created the group.
     * @param groupId to put in second column
     * @param userIdAdmin to add in third column and because he's the first user in this group, he
     *                    is admin by default (admin == true)
     * @return true if adding was successful
     */
    protected void insertNewGroup(int groupId, int userIdAdmin) {
        db = dbHelperAllocation.getWritableDatabase();
        //TODO
    }

    /**
     * Deletes all entries with this groupID in the second column (also needs to check, if some users
     * in the user list have to be deleted, because they are in no other group with the actual user).
     * @param groupID of the group to delete
     */
    public void deleteOldGroup(int groupID) {
    }

    /**
     * Get all members where the second column of the database equals the given group Id
     * @param groupID of the group to get the members from
     * @return a list of the member id's
     */
    public List<String> getAllMembersOfOneGroup(int groupID) {
        //getAllUserIdsOfOneGroup();
        ServiceUser user = null;
        user.getAllUsers(); //compare the user id's we got with the user id's of all users and
        //add these names to the list where the id is in both lists
        db = dbHelperAllocation.getReadableDatabase();
        List<String> res = null;
        return res;
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
