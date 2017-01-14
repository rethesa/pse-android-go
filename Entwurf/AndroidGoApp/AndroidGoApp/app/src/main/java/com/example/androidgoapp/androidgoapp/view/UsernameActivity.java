package com.example.androidgoapp.androidgoapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Schokomonsterchen on 10.01.2017.
 */

public class UsernameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.username_activity_dynamisch);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.username_container, new UsernameChangeFragment()).commit();
        }

    }

}