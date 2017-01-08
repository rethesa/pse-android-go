package com.example.androidgoapp.androidgoapp.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Group;

/**
 * Created by Theresa on 07.01.2017.
 */

public final class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.

    private FeedReaderContract() {
    }

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
    KEINE AHNUNG OB DIE ZWEI METHODEN NICHT BESSER WOANDERS HINGEHÖREN; DENN EIGENTLICH SOLLTEN DIE PRIVATE SEIN
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





    private Context context; //DAS PASST DENKE ICH SO AUCH NICHT (SIEHE IN MapActivity WIE myDbHelper INSTANZIIERT WIRD
    FeedReaderDbHelper myDbHelper = new FeedReaderDbHelper(context);

    //insert new row with information in database
    public boolean insertData(Group group) {
        // Gets the data repository in write mode
        SQLiteDatabase db = myDbHelper.getWritableDatabase();

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

        if (newRowId == -1) {
            //in case of an error insert() returns -1
            return false;
        } else {
            return true;
        }
    }


}
