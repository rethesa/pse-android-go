package com.example.androidgoapp.androidgoapp.view;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidgoapp.androidgoapp.R;

import org.osmdroid.views.MapView;

/**
 * Created by Schokomonsterchen on 15.01.2017.
 */

public class GroupMapFragmentNotGo extends GroupMapFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    protected View defineView(LayoutInflater inflater, ViewGroup container) {
        View view;
        if (!goStatus()) {
            view = inflater.inflate(R.layout.group_map_fragment, container, false);
        } else {
            getFragmentManager().beginTransaction()
                    .replace(R.id.group_container, new GroupMapFragmentGo())
                    .addToBackStack(null)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
            view = inflater.inflate(R.layout.group_map_fragment_go, container, false);
        }
        return view;
    }

    @Override
    protected void go(MapView mapView) {
        GroupMapFragmentGo groupMapFragmentGo = new GroupMapFragmentGo();
        groupMapFragmentGo.setActuallView(mapView.getMapCenter(), mapView.getZoomLevel());
        getFragmentManager().beginTransaction()
                .replace(R.id.group_container, groupMapFragmentGo)
                .addToBackStack(null)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }
}
