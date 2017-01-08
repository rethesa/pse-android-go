package com.example.androidgoapp.androidgoapp.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Group;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Theresa on 07.01.2017.
 */

public final class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private FeedReaderContract() {
    }
    SQLiteDatabase db;

    /* Inner class that defines the table contents */
    public static class FeedEntry implements BaseColumns {

        public static final String TABLE_NAME = "groups_client";

        public static final String COL1_GROUP_ID = "group_id";
        public static final String COL2_GROUP_NAME = "group_name";
        public static final String COL3_APPOINTMENT_DATE = "group_appointment_date";
        public static final String COL4_APPOINTMENT_DEST = "group_appointment_dest";
        public static final String COL5_GO_SERVICE = "group_go_service";
        //public static final String COL6_GROUP_MEMBER = "group_member";
    }

    /*
    KEINE AHNUNG OB DIE ZWEI ATTRIBUTE NICHT BESSER WOANDERS HINGEHÖREN; DENN EIGENTLICH SOLLTEN DIE PRIVATE SEIN
     */
    // Create table
    protected static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" +
                    FeedEntry.COL1_GROUP_ID + " INTEGER PRIMARY KEY," +
                    FeedEntry.COL2_GROUP_NAME + " TEXT," +
                    FeedEntry.COL3_APPOINTMENT_DATE + " TEXT," + //TEXT??? bzw. muss man datum und Uhrzeit vielleicht besser trennen?
                    FeedEntry.COL4_APPOINTMENT_DEST + " TEXT" +
                    FeedEntry.COL5_GO_SERVICE + " TEXT)";  //????
    //FeedEntry.COL6_GROUP_MEMBER + " TEXT)"; //????

    // Delete table
    protected static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;

    //DAS PASST DENKE ICH SO AUCH NICHT (SIEHE IN MapActivity WIE myDbHelper INSTANZIIERT WIRD
    private Context context;
    FeedReaderDbHelper myDbHelper = new FeedReaderDbHelper(context);

    /**
     * insert new row with information in database
     * @param group
     * @return
     */
    public boolean insertData(Group group) {
        // Gets the data repository in write mode
        db = myDbHelper.getWritableDatabase();
        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FeedEntry.COL1_GROUP_ID, group.getGroupID());
        values.put(FeedEntry.COL2_GROUP_NAME, group.getGroupName());
        values.put(FeedEntry.COL3_APPOINTMENT_DATE, String.valueOf(group.getAppointmentDate()));
        values.put(FeedEntry.COL4_APPOINTMENT_DEST, String.valueOf(group.getAppointmentDest()));
        values.put(FeedEntry.COL5_GO_SERVICE, String.valueOf(group.getGoService()));
        //values.put(FeedEntry.COL6_GROUP_MEMBER, group.getGroupMember());
        // Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(FeedEntry.TABLE_NAME, null, values);
        //in case of an error insert() returns -1
        if (newRowId == -1) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * read Data from Database
     * @return results in cursor object
     */
    public Cursor readData() {
        db = myDbHelper.getReadableDatabase();
    // Define a projection that specifies which columns from the database
    // you will actually use after this query.
        String[] projection = {
                FeedEntry.COL1_GROUP_ID,
                FeedEntry.COL2_GROUP_NAME,
                FeedEntry.COL3_APPOINTMENT_DATE,
                FeedEntry.COL4_APPOINTMENT_DEST,
                FeedEntry.COL5_GO_SERVICE
        };
        //Filter reusults where "group name" = 'super coole Gruppe'
        String selection = FeedEntry.COL2_GROUP_NAME + " = ?";
        String[] selectionArgs = { "super coole Gruppe" };
        // How you want the results sorted in the resulting Cursor
        String sortOrder =
                FeedEntry.COL1_GROUP_ID + " DESC";
        /*
         * To read from a database, use the query() method, passing it your selection criteria
         * and desired columns. The method combines elements of insert() and update(), except
         * the column list defines the data you want to fetch, rather than the data to insert.
         * The results of the query are returned to you in a Cursor object.
         */
        Cursor cursor = db.query(
                FeedEntry.TABLE_NAME,                     // The table to query
                projection,                               // The columns to return
                selection,                                // The columns for the WHERE clause
                selectionArgs,                            // The values for the WHERE clause
                null,                                     // don't group the rows
                null,                                     // don't filter by row groups
                sortOrder                                 // The sort order
        );

        /*
        To look at a row in the cursor, use one of the Cursor move methods, which you must always
        call before you begin reading values. Since the cursor starts at position -1, calling
        moveToNext() places the "read position" on the first entry in the results and returns
        whether or not the cursor is already past the last entry in the result set. For each row,
        you can read a column's value by calling one of the Cursor get methods, such as getString()
        or getLong(). For each of the get methods, you must pass the index position of the column
        you desire, which you can get by calling getColumnIndex() or getColumnIndexOrThrow().
        When finished iterating through results, call close() on the cursor to release its resources.
         */
        List itemIds = new ArrayList<>();
        while(cursor.moveToNext()) {
            long itemId = cursor.getLong(
                    cursor.getColumnIndexOrThrow(FeedEntry._ID));
            itemIds.add(itemId);
        }
        cursor.close();
        // The results of the query are returned to you in a Cursor object.
        return cursor;
    }

    public boolean deleteData() {
        // Define 'where' part of query.
        String selection = FeedEntry.COL1_GROUP_ID + " LIKE ?";
        // Specify arguments in placeholder order.
        String[] selectionArgs = { "super coole Gruppe" };
        // Issue SQL statement.
        db.delete(FeedEntry.TABLE_NAME, selection, selectionArgs);

        return false;
    }

    /**
     * update data of database
     * @param group
     * @return
     */
    public boolean updateData(Group group) {
        db = myDbHelper.getReadableDatabase();
        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FeedEntry.COL2_GROUP_NAME, group.getGroupName());

        // Which row to update, based on the title
        String selection = FeedEntry.COL2_GROUP_NAME + " LIKE ?";
        String[] selectionArgs = { "coole Gruppe" };
        int count = db.update(
                FeedEntry.TABLE_NAME,
                values,
                selection,
                selectionArgs);

        return false;
    }

}
