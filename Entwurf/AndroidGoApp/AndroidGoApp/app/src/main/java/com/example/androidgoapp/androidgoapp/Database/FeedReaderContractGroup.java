package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Group;

import java.util.Objects;

/**
 * Define the structure of the table how the groups will be saved on the client.
 * @author Theresa Heine
 * @version 1.0
 */

public final class FeedReaderContractGroup {

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private FeedReaderContractGroup() {
    }

    /**
     * Inner class that defines the table contents.
     */
    public static class FeedEntryGroup implements BaseColumns {

        /**
         * Define the name of the table
         */
        public static final String TABLE_NAME = "groups_client";

        /**
         * First column with the group id (PRIMARY KEY).
         */
        public static final String COL1_GROUP_ID = "group_id";
        /**
         * Second column with the group name.
         */
        public static final String COL2_GROUP_NAME = "group_name";
        /**
         * Third column with the date of the appointment.
         */
        public static final String COL3_APPOINTMENT_DATE = "group_appointment_date";
        /**
         * Fourth column with the time of the appointment.
         */
        public static final String COL4_APPOINTMENT_TIME = "group_appointment_time";
        /**
         * Fifth column with the destination of the appointment, where the group will meet.
         */
        public static final String COL5_APPOINTMENT_DEST = "group_appointment_dest";
        /**
         * Go service of the actual user of the app and if it's go_button is pressed for this group
         * or not.
         */
        public static final String COL6_GO_SERVICE = "group_go_service";
    }
}
