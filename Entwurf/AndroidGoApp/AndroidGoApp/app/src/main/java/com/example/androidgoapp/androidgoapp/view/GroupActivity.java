package com.example.androidgoapp.androidgoapp.view;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by Theresa on 21.12.2016.
 */

public class GroupActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    Calendar calendar = Calendar.getInstance();

    protected void onCreate(Bundle saveInstanceState) {

    }


    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {

    }
}
