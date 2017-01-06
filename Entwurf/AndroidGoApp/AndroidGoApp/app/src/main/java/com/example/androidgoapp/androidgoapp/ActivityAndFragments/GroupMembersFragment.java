package com.example.androidgoapp.androidgoapp.ActivityAndFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidgoapp.androidgoapp.R;

/**
 * Created by Schokomonsterchen on 21.12.2016.
 */

public class GroupMembersFragment extends Fragment implements View.OnClickListener
{
    public static GroupMembersFragment create()
    {
        GroupMembersFragment groupMembersFragment = new GroupMembersFragment();
        return groupMembersFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.groupmembers_fragment, container, false);
        return view;
    }

    /**
     * hier weren die Button groupname, appointment, addMember implementiert
     * @param view
     */
    @Override
    public void onClick(View view)
    {

    }

    //TODO: Button member(1).. member(numberOfMember) initialisieren

    /**
     * um den Link zu teilen
     */
    private void shareBranchLink()
    {

    }

    /**
     * um den Link auf dem server zu speichern
     */
    private void saveLinkonServer()
    {

    }
}