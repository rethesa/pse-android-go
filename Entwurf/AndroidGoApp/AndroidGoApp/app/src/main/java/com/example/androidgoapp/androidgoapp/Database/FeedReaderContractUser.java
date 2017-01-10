package com.example.androidgoapp.androidgoapp.Database;

import android.provider.BaseColumns;

/**
 * Define the structure of all group members of all groups the actual user is member of and how
 * they will be saved on the client.
 * @author Thersa Heine
 * @version 1.0
 */

public final class FeedReaderContractUser {

    private FeedReaderContractUser() {
    }

    /**
     * Inner class that defines the table contents.
     */
    public static class FeedEntryUser implements BaseColumns {
        /**
         * Define the name of the table.
         */
        public static final String TABLE_NAME = "user_client";

        /**
         * First column is the user id (PRIMARY KEY).
         */
        public static final String COL1_USER_ID = "user_id";
        /**
         * Second column is the name of the user.
         */
        public static final String COL2_USER_NAME = "user_name";
        /**
         * Third column is the latitude of the users actual position.
         */
        public static final String COL3_LATITUDE = "last_known_latitude";
        /**
         * Foruth column is the longitude of the users actual position.
         */
        public static final String COL4_LONGITUDE = "last_known_longitude";
    }
}
