package com.example.androidgoapp.androidgoapp.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.androidgoapp.androidgoapp.R;

/**
 * Created by Schokomonsterchen on 12.01.2017.
 */

public class GroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group_activity_dynamisch);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.group_container, new GroupMapNotGoFragment()).commit();
        }

    }

}