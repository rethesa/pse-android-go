package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.androidgoapp.androidgoapp.Database.FeedReaderContractUser.SQL_CREATE_ENTRIES_USER;
import static com.example.androidgoapp.androidgoapp.Database.FeedReaderContractUser.SQL_DELETE_ENTRIES_USER;

/**
 * Created by Theresa on 09.01.2017.
 */

public class DBHandlerUser extends SQLiteOpenHelper {

    // If you change the database schema, you must increment the database version.
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "user.db";

    public DBHandlerUser(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES_USER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL(SQL_DELETE_ENTRIES_USER);
        onCreate(sqLiteDatabase);
    }
}
