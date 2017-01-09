package com.example.androidgoapp.androidgoapp.Database;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

/**
 * Created by Theresa on 09.01.2017.
 */

public final class FeedReaderContractGroup {

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private FeedReaderContractGroup() {
    }

    /* Inner class that defines the table contents */
    public static class FeedEntryGroup implements BaseColumns {

        public static final String TABLE_NAME = "groups_client";

        public static final String COL1_GROUP_ID = "group_id";
        public static final String COL2_GROUP_NAME = "group_name";
        public static final String COL3_APPOINTMENT_DATE = "group_appointment_date";
        public static final String COL4_APPOINTMENT_TIME = "group_appointment_time";
        public static final String COL5_APPOINTMENT_DEST = "group_appointment_dest";
        public static final String COL6_GO_SERVICE = "group_go_service";
    }

    // Create table
    protected static final String SQL_CREATE_ENTRIES_GROUP =
            "CREATE TABLE " + FeedEntryGroup.TABLE_NAME + " (" +
                    FeedEntryGroup.COL1_GROUP_ID + " INTEGER PRIMARY KEY," +
                    FeedEntryGroup.COL2_GROUP_NAME + " TEXT," +
                    FeedEntryGroup.COL3_APPOINTMENT_DATE + " INTEGER," +
                    FeedEntryGroup.COL4_APPOINTMENT_TIME + " INTEGER," +
                    FeedEntryGroup.COL5_APPOINTMENT_DEST + " INTEGER" +
                    FeedEntryGroup.COL6_GO_SERVICE + " TEXT)";  //????

    // Delete table
    protected static final String SQL_DELETE_ENTRIES_GROUP =
            "DROP TABLE IF EXISTS " + FeedEntryGroup.TABLE_NAME;

}
