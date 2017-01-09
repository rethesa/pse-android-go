package com.example.androidgoapp.androidgoapp.Database;

import android.provider.BaseColumns;

/**
 * Created by Theresa on 09.01.2017.
 */

public final class FeedReaderContractUser {

    private FeedReaderContractUser() {
    }

    public static class FeedEntryUser implements BaseColumns {
        public static final String TABLE_NAME = "user_client";
        //columns of table
        public static final String COL1_USER_ID = "user_id";
        public static final String COL2_USER_NAME = "user_name";
        public static final String COL3_LAST_KNOWN_USER_POSITION = "last_known_user_position";
    }

    // Create table
    protected static final String SQL_CREATE_ENTRIES_USER =
            "CREATE TABLE " + FeedReaderContractGroup.FeedEntryGroup.TABLE_NAME + " (" +
                    FeedEntryUser.COL1_USER_ID + " INTEGER PRIMARY KEY," +
                    FeedEntryUser.COL2_USER_NAME + " TEXT," +
                    FeedEntryUser.COL3_LAST_KNOWN_USER_POSITION + " INTEGER)";  //ähh, geht das überhaupt, da das ja eigentlich zwei sind????

    // Delete table
    protected static final String SQL_DELETE_ENTRIES_USER =
            "DROP TABLE IF EXISTS " + FeedEntryUser.TABLE_NAME;
}
