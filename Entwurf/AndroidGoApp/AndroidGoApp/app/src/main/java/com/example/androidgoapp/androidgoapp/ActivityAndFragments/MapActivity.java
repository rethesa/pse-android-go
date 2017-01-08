package com.example.androidgoapp.androidgoapp.ActivityAndFragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.androidgoapp.androidgoapp.Database.FeedReaderDbHelper;
import com.example.androidgoapp.androidgoapp.R;

/**
 * Created by Theresa on 21.12.2016.
 */

public class MapActivity extends AppCompatActivity {

    //<GoService>
    //<Group.name>

    public FeedReaderDbHelper myDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        myDbHelper = new FeedReaderDbHelper(this);
    }


}
