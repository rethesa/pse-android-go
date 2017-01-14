package com.example.androidgoapp.androidgoapp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.androidgoapp.androidgoapp.R;

/**
 * Created by Schokomonsterchen on 13.01.2017.
 */

public class GroupnameActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.groupname_activity_dynamisch);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.groupname_container, new GroupnameCreateFragment()).commit();
        }
    }

}