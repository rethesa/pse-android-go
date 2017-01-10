package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * General functions of the group database.
 * @author Theresa Heine
 * @version 1.0
 */

public class DBHelperGroup extends SQLiteOpenHelper {

    // If you change the database schema, you must increment the database version.
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "group.db";

    /**
     * Create table with the defined entries.
     */
    private static final String SQL_CREATE_ENTRIES_GROUP =
            "CREATE TABLE " + FeedReaderContractGroup.FeedEntryGroup.TABLE_NAME + " (" +
                    FeedReaderContractGroup.FeedEntryGroup.COL1_GROUP_ID + " INTEGER PRIMARY KEY," +
                    FeedReaderContractGroup.FeedEntryGroup.COL2_GROUP_NAME + " TEXT," +
                    FeedReaderContractGroup.FeedEntryGroup.COL3_APPOINTMENT_DATE + " INTEGER," +
                    FeedReaderContractGroup.FeedEntryGroup.COL4_APPOINTMENT_TIME + " INTEGER," +
                    FeedReaderContractGroup.FeedEntryGroup.COL5_APPOINTMENT_DEST + " INTEGER" +
                    FeedReaderContractGroup.FeedEntryGroup.COL6_GO_SERVICE + " TEXT)";  //????

    /**
     * Delete table.
     */
    private static final String SQL_DELETE_ENTRIES_GROUP =
            "DROP TABLE IF EXISTS " + FeedReaderContractGroup.FeedEntryGroup.TABLE_NAME;

    /**
     * Constructor to define general information of the database.
     * @param context
     */
    public DBHelperGroup(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * It is called first time when database is created.
     * @param sqLiteDatabase to create
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES_GROUP);
        } catch (Exception e) {

        }
    }

    /**
     *  Run when database is upgraded / changed, like drop tables, add tables etc.
     * @param sqLiteDatabase to upgrade
     * @param oldVersion of database
     * @param newVersion of database
     */
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL(SQL_DELETE_ENTRIES_GROUP);
        onCreate(sqLiteDatabase);
    }

}
