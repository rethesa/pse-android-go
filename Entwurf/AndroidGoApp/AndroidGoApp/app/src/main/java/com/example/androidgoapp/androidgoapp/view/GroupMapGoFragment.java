package com.example.androidgoapp.androidgoapp.view;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidgoapp.androidgoapp.R;

import org.osmdroid.views.MapView;

/**
 * Created by Schokomonsterchen on 13.01.2017.
 */

public class GroupMapGoFragment extends GroupMapFragment {


    @Override
    protected View defineView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.group_map_go_fragment, container, false);
    }

    @Override
    protected void go(MapView mapView) {
        GroupMapNotGoFragment groupMapNotGoFragment = new GroupMapNotGoFragment();
        groupMapNotGoFragment.setActuallView(mapView.getMapCenter(), mapView.getZoomLevel());
        getFragmentManager().beginTransaction()
                .replace(R.id.group_container, groupMapNotGoFragment)
                .addToBackStack(null)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

}