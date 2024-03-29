package com.example.androidgoapp.androidgoapp.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.androidgoapp.androidgoapp.R;

/**
 * Created by Schokomonsterchen on 10.01.2017.
 */

public class UsernameRegistrationFragment extends Fragment implements View.OnClickListener {

    private EditText username;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.username_registration_fragment, container, false);
        username = (EditText) view.findViewById(R.id.input_edittext);
        view.findViewById(R.id.next_registration_button).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if(R.id.next_registration_button == view.getId()) {
            if(isUsernameValid()) {
                registrate();
            }
        }
    }


    /**
     * save the username and change Activity
     */
    private void registrate() {
        String finalUsername = username.getText().toString();
        //TODO: save username
        this.getActivity().startActivity(new Intent(this.getActivity(), GroupActivity.class));
    }


    /**
     * check if username is valid
     * @return if username is valid
     */
    private boolean isUsernameValid() {
        //TODO: entscheide was als valide giltund prüfen
        return true;
    }
}