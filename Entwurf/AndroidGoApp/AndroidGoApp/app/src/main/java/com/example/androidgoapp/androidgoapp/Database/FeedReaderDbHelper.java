package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.androidgoapp.androidgoapp.Database.FeedReaderContract.SQL_CREATE_ENTRIES;
import static com.example.androidgoapp.androidgoapp.Database.FeedReaderContract.SQL_DELETE_ENTRIES;


/**
 * Created by Theresa on 07.01.2017.
 */

public class FeedReaderDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "groups.db";
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;


    public FeedReaderDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }


}
