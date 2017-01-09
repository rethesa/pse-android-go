package com.example.androidgoapp.androidgoapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Theresa on 09.01.2017.
 */

public abstract class DBHandler extends SQLiteOpenHelper {



    //wird noch nicht verwendet, da ich nicht genau weiß, wie ich das bei den Subklassen dann mit dem Construktor also
    //v.a. mit name und version mache
    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
}
