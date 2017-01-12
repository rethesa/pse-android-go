package com.example.androidgoapp.androidgoapp.ActivityAndFragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.androidgoapp.androidgoapp.Database.DBHelperGroup;
import com.example.androidgoapp.androidgoapp.R;

/**
 * Created by Theresa on 21.12.2016.
 */

public class MapActivity extends AppCompatActivity {

    //<GoService>
    //<Group.name>

    //das ist im Moment doppelt
    private DBHelperGroup myDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        myDbHelper = new DBHelperGroup(this);
    }

       /*
    Since getWritableDatabase() and getReadableDatabase() are expensive to call when the database
    is closed, you should leave your database connection open for as long as you possibly need to
    access it. Typically, it is optimal to close the database in the onDestroy() of the calling
    Activity.*/

    @Override
    protected void onDestroy() {
        myDbHelper.close();
        super.onDestroy();
    }


}
