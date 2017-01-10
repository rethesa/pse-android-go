package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Group;
import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.SimpleUser2;

/**
 * General functions of the user database.
 * @author Theresa Heine
 * @version 1.0
 */

public class DBHelperUser extends SQLiteOpenHelper implements DBHelper{

    // If you change the database schema, you must increment the database version.
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "user.db";

    private SQLiteDatabase db;
    /**
     * Create table with the defined entries.
     */
    private static final String SQL_CREATE_ENTRIES_USER =
            "CREATE TABLE " + FeedReaderContractGroup.FeedEntryGroup.TABLE_NAME + " (" +
                    FeedReaderContractUser.FeedEntryUser.COL1_USER_ID + " INTEGER PRIMARY KEY," +
                    FeedReaderContractUser.FeedEntryUser.COL2_USER_NAME + " TEXT," +
                    FeedReaderContractUser.FeedEntryUser.COL3_LATITUDE + " INTEGER," +
                    FeedReaderContractUser.FeedEntryUser.COL4_LONGITUDE + " INTEGER)";

    /**
     * Delete table.
     */
    private static final String SQL_DELETE_ENTRIES_USER =
            "DROP TABLE IF EXISTS " + FeedReaderContractUser.FeedEntryUser.TABLE_NAME;

    /**
     * Constructor to define general information of the database.
     * @param context
     */
    public DBHelperUser(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * It is called first time when database is created.
     * @param sqLiteDatabase to create
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES_USER);
    }

    /**
     *  Run when database is upgraded / changed, like drop tables, add tables etc.
     * @param sqLiteDatabase to upgrade
     * @param oldVersion of database
     * @param newVersion of database
     */
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL(SQL_DELETE_ENTRIES_USER);
        onCreate(sqLiteDatabase);
    }

    public boolean insertData(SimpleUser2 user) {
        db = this.getWritableDatabase();
        return false;
    }

    @Override
    public Cursor readData(String userName) {
        return null;
    }

    @Override
    public boolean deleteData(String userName) {
        return false;
    }

    @Override
    public boolean updateData(String userName) {
        return false;
    }
}
