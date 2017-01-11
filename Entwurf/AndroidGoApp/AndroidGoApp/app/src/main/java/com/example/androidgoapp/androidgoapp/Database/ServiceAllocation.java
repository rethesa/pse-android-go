package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.content.Intent;
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
     * because he created the group. The allocation Id will increase automatically.
     * @param groupId to put in second column
     * @return true if adding was successful
     */
    protected void insertNewGroup(int groupId) {
        db = dbHelperAllocation.getWritableDatabase();
        //TODO
    }

    /**
     * Add another user to the group.
     * @param userID
     * @param groupID
     */
    protected void insertNewGroupMemberAlloc(int groupID, int userID) {

    }

    /**
     * Make another group member to admin
     * @param groupId
     * @param userID of the user to become admin
     */
    public void makeGroupMemberToAdmin(int groupId, int userID) { //PUBLIC ODER PROTECTED????

    }

    /**
     * Deletes all entries with this groupID in the second column (also needs to check, if some users
     * in the user list have to be deleted, because they are in no other group with the actual user).
     * @param groupID of the group to delete
     */
    protected void deleteOldGroup(int groupID) {
        //TODO
        //vielleicht noch überprüfen, ob jetzt die gelöschten userId's auch in keiner anderen Gruppe merh auftauchen
        //damit diese dann ganz von user.db auch gelöscht werden können
    }

    /**
     *
     * @param groupID
     * @return
     */
    protected List<Integer> getAllUserIdsOfOneGroup(int groupID) {

        return null;
    }
    /**
     * Get information about the given group id.
     * @param id of the group or the member to get information about
     * @return information about the group or the member
     */
    public Cursor readData(int alloc_id) {
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
     * @param alloc_id of group or member to update
     * @return true if update was successful
     */
    public boolean updateData(int alloc_id) {
        return false;
    }














}
