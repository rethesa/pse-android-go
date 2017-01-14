package com.example.androidgoapp.androidgoapp.view;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;


/**
 * Created by Schokomonsterchen on 12.01.2017.
 */

public class GroupAppointmentFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.group_appointment_fragment, container, false);

        view.findViewById(R.id.groupname_button).setOnClickListener(this);
        view.findViewById(R.id.appointment_button).setOnClickListener(this);
        view.findViewById(R.id.time_button).setOnClickListener(this);
        view.findViewById(R.id.date_button).setOnClickListener(this);
        view.findViewById(R.id.place_button).setOnClickListener(this);
        view.findViewById(R.id.next_appointment_button).setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        Fragment groupMapFragment;
        if (go()) {
            groupMapFragment = new GroupMapFragmentGo();
        } else {
            groupMapFragment = new GroupMapFragment();
        }
        if (R.id.groupname_button == id) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.group_container, new GroupMembersFragment())
                    .addToBackStack(null)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
        } else if (R.id.appointment_button == id) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.group_container, groupMapFragment)
                    .addToBackStack(null)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
        } else if (R.id.time_button == id) {
            TimePickerFragment timePickerFragment = new TimePickerFragment();
            timePickerFragment.showTimePickerDialog(view);
        } else if (R.id.date_button == id) {
            DatePickerFragment datePickerFragment = new DatePickerFragment();
            datePickerFragment.showDatePickerDialog(view);
        } else if (R.id.place_button == id) {
/*            Intent intent = new Intent(this.getActivity(), UsernameActivity.class);
            intent.putExtra("OpenFirstTime", "false");
            this.getActivity().startActivity(intent);
  */          //TODO: speichere place
        } else if (R.id.next_appointment_button == id) {
            //TODO: Verändere String "Mustertreffen"
            getFragmentManager().beginTransaction()
                    .replace(R.id.group_container, groupMapFragment)
                    .addToBackStack(null)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
        }

    }

    private boolean go() {
        //TODO: überprüfen, ob go gedrückt ist
        return false;
    }


}