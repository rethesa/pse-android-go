package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * General functions of the allocation database.
 * @author Theresa Heine
 * @version 1.0
 */

public class DBHelperAllocation extends SQLiteOpenHelper {

    // If you change the database schema, you must increment the database version.
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "allocation.db";

    /**
     * Create table with the defined entries.
     */
    private static final String SQL_CREATE_ENTRIES_ALLOCATION =
            "CREATE TABLE " + FeedReaderContractGroup.FeedEntryGroup.TABLE_NAME + " (" +
                    FeedReaderContractAllocation.FeedEntryAllocation.COL1_ID + " INTEGER PRIMARY KEY," +
                    FeedReaderContractAllocation.FeedEntryAllocation.COL2_GR_ID + " INTEGER," +
                    FeedReaderContractAllocation.FeedEntryAllocation.COL3_US_ID + " INTEGER)";

    /**
     * Delete table.
     */
    private static final String SQL_DELETE_ENTRIES_ALLOCATION =
            "DROP TABLE IF EXISTS " + FeedReaderContractAllocation.FeedEntryAllocation.TABLE_NAME;

    /**
     * Constructor to define general information of the database.
     * @param context
     */
    public DBHelperAllocation(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * It is called first time when database is created.
     * @param sqLiteDatabase to create
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES_ALLOCATION);
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
        sqLiteDatabase.execSQL(SQL_DELETE_ENTRIES_ALLOCATION);
        onCreate(sqLiteDatabase);
    }
}
