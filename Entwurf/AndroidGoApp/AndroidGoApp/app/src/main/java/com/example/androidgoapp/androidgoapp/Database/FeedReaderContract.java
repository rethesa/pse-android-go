package com.example.androidgoapp.androidgoapp.Database;

import android.provider.BaseColumns;

/**
 * Created by Theresa on 07.01.2017.
 */

public final class FeedReaderContract {

    private FeedReaderContract() {
    }

    public static class FeedEntry implements BaseColumns {

        public static final String TABLE_NAME = "groups_client";

        public static final String COL1_GROUP_ID = "group_id";
        public static final String COL2_GROUP_NAME = "group_name";
        public static final String COL3_GROUP_APPOINTMENT_DATE = "group_appointment_date";
        public static final String COL4_GROUP_APPOINTMENT_DEST = "group_appointment_dest";
        public static final String COL5_GROUP_GO_SERVICE = "group_go_service";
        public static final String COL6_GROUP_MEMBER = "group_member";


        protected static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" +
                        FeedEntry.COL1_GROUP_ID + " INTEGER PRIMARY KEY," +
                        FeedEntry.COL2_GROUP_NAME + " TEXT," +
                        FeedEntry.COL3_GROUP_APPOINTMENT_DATE + " TEXT," + //TEXT???
                        FeedEntry.COL4_GROUP_APPOINTMENT_DEST + " TEXT" +
                        FeedEntry.COL5_GROUP_GO_SERVICE + " TEXT" + //????
                        FeedEntry.COL6_GROUP_MEMBER + " TEXT)"; //????

        protected static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;

    }
}
