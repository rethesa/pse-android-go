package com.example.androidgoapp.androidgoapp.ActivityAndFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Appointment;
import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.AppointmentDate;
import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.AppointmentDestination;
import com.example.androidgoapp.androidgoapp.R;

/**
 * Created by Schokomonsterchen on 21.12.2016.
 */

public class GroupAppointmentFragment extends Fragment implements View.OnClickListener
{
//    private AppointmentDestination appointmentDestination;
//    private AppointmentDate appointmentDate;
    private Appointment appointment;

    public static GroupAppointmentFragment create()
    {
        GroupAppointmentFragment groupAppointmentFragment = new GroupAppointmentFragment();
        return groupAppointmentFragment;
    }

    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.groupappointment_fragment, container, false);
        return view;
    }

    /**
     * hier weren die Button map, selectTime und next implementiert
     * @param view
     */
    @Override
    public void onClick(View view)
    {

    }

    //TODO: Scroller für hours und minutes und date initialisieren

    /**
     * hier wird die Texteingabe place implementiert
     * @param outState
     */
    @Override
    public void onSaveInstanceState(Bundle outState)
    {

    }

    public Appointment getAppointment() {
        return appointment;
    }


/*    public AppointmentDestination getAppointmentDestination() {
        return appointmentDestination;
    }

    public AppointmentDate getAppointmentDate() {
        return appointmentDate;
    }

*/
}