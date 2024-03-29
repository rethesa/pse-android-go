package com.example.androidgoapp.androidgoapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.androidgoapp.androidgoapp.R;

/**
 * Created by Schokomonsterchen on 13.01.2017.
 */

public class GroupnameCreateFragment extends Fragment implements View.OnClickListener {

    private EditText groupname;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        if(this.getActivity().getIntent().getStringExtra("GroupID").equals("false")) {
            view = inflater.inflate(R.layout.groupname_create_fragment, container, false);
            groupname = (EditText) view.findViewById(R.id.input_edittext);
            view.findViewById(R.id.next_group_button).setOnClickListener(this);
        } else {
            getFragmentManager().beginTransaction()
                    .replace(R.id.groupname_container, new UsernameRegistrationFragment())
                    .addToBackStack(null)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
            view = inflater.inflate(R.layout.groupname_change_fragment, container, false);
        }
        return view;
    }

    @Override
    public void onClick(View view) {
        if(R.id.next_group_button == view.getId()) {
            if(isGroupnameValid()) {
                createGroup();
            }
        }
    }


    /**
     * save the username and change Activity
     */
    private void createGroup() {
        String finalGroupname = groupname.getText().toString();
        //TODO: save groupname
        this.getActivity().startActivity(new Intent(this.getActivity(), GroupActivity.class));
    }


    /**
     * check if username is valid
     * @return if username is valid
     */
    private boolean isGroupnameValid() {
        //TODO: entscheide was als valide giltund prüfen
        return true;
    }
}