package com.example.androidgoapp.androidgoapp.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidgoapp.androidgoapp.R;

import org.osmdroid.api.IGeoPoint;
import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

/**
 * Created by Schokomonsterchen on 13.01.2017.
 */

public class GroupMapFragmentGo extends Fragment implements View.OnClickListener {

    private MapView mapView;
    private double latitude = 0;
    private double longitude = 0;
    private int zoom = 0;
    private int groupID;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.group_map_fragment_go, container, false);

        OpenStreetMapTileProviderConstants.setUserAgentValue(android.support.v7.appcompat.BuildConfig.APPLICATION_ID);
        //Configuration.getInstance().load(this, PreferenceManager.getDefaultSharedPreferences(this));

        mapView = (MapView) view.findViewById(R.id.map);
        mapView.setTileSource(TileSourceFactory.MAPNIK);
        mapView.setMultiTouchControls(true);
        IMapController controller = mapView.getController();
        if(zoom == 0) {
            controller.setZoom(15);
        } else {
            controller.setZoom(zoom);
        }
        if(latitude == 0 && longitude == 0) {
            controller.setCenter(getActuallPosition());
        } else {
            controller.setCenter(new GeoPoint(latitude, longitude));
        }

        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);

        view.findViewById(R.id.groupname_button).setOnClickListener(this);
        if(admin()) {
            view.findViewById(R.id.appointment_button).setOnClickListener(this);
        }
        view.findViewById(R.id.go_button).setOnClickListener(this);

        return view;
    }

    /**
     * identify the actuall GeoPoint
     * @return actuall GeoPoint of the client
     */
    private GeoPoint getActuallPosition() {
        //TODO: vom GPS den Standpunkt ermitteln
        return new GeoPoint(49.013941, 8.404409);
    }


    /**
     * handles the clicks from the buttons
     * @param view describes the view of the fragment
     */
    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (R.id.groupname_button == id) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.group_container, new GroupMembersFragment())
                    .addToBackStack(null)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
        } else if (R.id.appointment_button == id) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.group_container, new GroupAppointmentFragment())
                    .addToBackStack(null)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
        } else if (R.id.go_button == id) {
            GroupMapFragment groupMapFragment = new GroupMapFragment();
            groupMapFragment.setActuallView(mapView.getMapCenter(), mapView.getZoomLevel());
            getFragmentManager().beginTransaction()
                    .replace(R.id.group_container, groupMapFragment)
                    .addToBackStack(null)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
        }
    }


    private void defineGroup() {
        //TODO: GroupID aus der Data-Base laden
        //TODO: String "Mustergruppe" verändern
    }

    private boolean admin() {
        //TODO: überprüfen, ob dieser Client admin ist
        return true;
    }

    private boolean go() {
        //TODO: überprüfen, ob go gedrückt ist
        return true;
    }

    public void setActuallView(IGeoPoint geoPoint, int newZoom) {
        latitude = geoPoint.getLatitude();
        longitude = geoPoint.getLongitude();
        zoom = newZoom;
    }

}