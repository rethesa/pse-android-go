package com.example.androidgoapp.androidgoapp.Database;

import android.provider.BaseColumns;

/**
 * Created by Theresa on 09.01.2017.
 */

public final class FeedReaderContractAllocation {

    private FeedReaderContractAllocation() {
    }

    public static class FeedEntryAllocation implements BaseColumns {
        public static final String TABLE_NAME = "allocation";
        //columns
        public static final String COL1_ID = "allocation_id";
        public static final String COL2_GR_ID = "group_id";
        public static final String COL3_US_ID = "user_id";
    }

    protected static final String SQL_CREATE_ENTRIES_GROUP =
            "CREATE TABLE " + FeedReaderContractGroup.FeedEntryGroup.TABLE_NAME + " (" +
                    FeedEntryAllocation.COL1_ID + " INTEGER PRIMARY KEY," +
                    FeedEntryAllocation.COL2_GR_ID + " INTEGER," +
                    FeedEntryAllocation.COL3_US_ID + " INTEGER)";

    protected static final String SQL_DELETE_ENTRIES_GROUP =
            "DROP TABLE IF EXISTS " + FeedEntryAllocation.TABLE_NAME;

}
