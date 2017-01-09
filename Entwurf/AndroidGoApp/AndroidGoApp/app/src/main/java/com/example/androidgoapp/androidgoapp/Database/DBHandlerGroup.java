package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.androidgoapp.androidgoapp.Database.FeedReaderContractGroup.SQL_CREATE_ENTRIES_GROUP;
import static com.example.androidgoapp.androidgoapp.Database.FeedReaderContractGroup.SQL_DELETE_ENTRIES_GROUP;


/**
 * Created by Theresa on 09.01.2017.
 */

public class DBHandlerGroup extends SQLiteOpenHelper {

    // If you change the database schema, you must increment the database version.
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "group.db";


    public DBHandlerGroup(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * It is called first time when database is created. We usually create tables and the
     * initialize here.
     * @param sqLiteDatabase
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES_GROUP);
    }

    /**
     *  Run when database is upgraded / changed, like drop tables, add tables etc
     * @param sqLiteDatabase
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL(SQL_DELETE_ENTRIES_GROUP);
        onCreate(sqLiteDatabase);
    }


}
