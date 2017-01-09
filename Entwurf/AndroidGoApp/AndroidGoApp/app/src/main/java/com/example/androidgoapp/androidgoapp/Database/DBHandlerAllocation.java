package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.androidgoapp.androidgoapp.Database.FeedReaderContractAllocation.SQL_CREATE_ENTRIES_ALLOCATION;
import static com.example.androidgoapp.androidgoapp.Database.FeedReaderContractAllocation.SQL_DELETE_ENTRIES_ALLOCATION;

/**
 * Created by Theresa on 09.01.2017.
 */

public class DBHandlerAllocation extends SQLiteOpenHelper {

    // If you change the database schema, you must increment the database version.
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "allocation.db";

    public DBHandlerAllocation(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES_ALLOCATION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL(SQL_DELETE_ENTRIES_ALLOCATION);
        onCreate(sqLiteDatabase);
    }
}
