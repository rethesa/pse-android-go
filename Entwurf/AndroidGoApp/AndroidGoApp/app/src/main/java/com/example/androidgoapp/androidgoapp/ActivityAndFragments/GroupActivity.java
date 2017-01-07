package com.example.androidgoapp.androidgoapp.ActivityAndFragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.androidgoapp.androidgoapp.Database.FeedReaderDbHelper;
import com.example.androidgoapp.androidgoapp.R;

/**
 * Created by Theresa on 21.12.2016.
 */

public class GroupActivity extends AppCompatActivity {

    FeedReaderDbHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        mDbHelper = new FeedReaderDbHelper(this);
    }





}
