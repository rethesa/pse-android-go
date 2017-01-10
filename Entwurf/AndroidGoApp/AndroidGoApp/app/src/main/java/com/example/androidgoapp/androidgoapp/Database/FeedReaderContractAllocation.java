package com.example.androidgoapp.androidgoapp.Database;

import android.provider.BaseColumns;

/**
 * Define the structure of the table for the connection between groups and users.
 * @author Theresa Heine
 * @version 1.0
 */

public final class FeedReaderContractAllocation {

    private FeedReaderContractAllocation() {
    }

    /**
     * Inner class that defines the table contents.
     */
    public static class FeedEntryAllocation implements BaseColumns {
        /**
         * Define the name of the table.
         */
        public static final String TABLE_NAME = "allocation";

        /**
         * First column in the table is a simple increasing id (PRIMARY KEY).
         */
        public static final String COL1_ID = "allocation_id";
        /**
         * Second column in the table is the group id.
         */
        public static final String COL2_GR_ID = "group_id";
        /**
         * Third column in the table is the user id of all users
         * with the same group id.
         */
        public static final String COL3_US_ID = "user_id";

    }

}
