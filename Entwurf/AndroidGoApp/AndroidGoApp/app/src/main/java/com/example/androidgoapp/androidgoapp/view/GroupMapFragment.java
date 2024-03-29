package com.example.androidgoapp.androidgoapp.view;

//<<<<<<< HEAD
//=======
import android.content.Intent;
import android.content.res.Configuration;
//>>>>>>> feature_navigationdrawer
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
//<<<<<<< HEAD
//=======
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
//>>>>>>> feature_navigationdrawer

import com.example.androidgoapp.androidgoapp.R;

import org.osmdroid.api.IGeoPoint;
import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

/**
 * Created by Schokomonsterchen on 10.01.2017.
 */

public class GroupMapFragment extends Fragment implements View.OnClickListener {

    //navigation drawer
    public final static String navigation = "Group navigation";


    private MapView mapView;
    private double latitude = 0;
    private double longitude = 0;
    private int zoom = 0;
    private int groupID;

    //for the navigation drawer
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    private String[] Groupname;
    private ArrayAdapter<String> mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = defineView(inflater, container);

        OpenStreetMapTileProviderConstants.setUserAgentValue(android.support.v7.appcompat.BuildConfig.APPLICATION_ID);
        //Configuration.getInstance().load(this, PreferenceManager.getDefaultSharedPreferences(this));

        mapView = (MapView) view.findViewById(R.id.map);
        mapView.setTileSource(TileSourceFactory.MAPNIK);
        mapView.setMultiTouchControls(true);

        IMapController controller = mapView.getController();
        if (zoom == 0) {
            controller.setZoom(15);
        } else {
            controller.setZoom(zoom);
        }
        if (latitude == 0 && longitude == 0) {
            controller.setCenter(getActuallPosition());
        } else {
            controller.setCenter(new GeoPoint(latitude, longitude));
        }
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);

        view.findViewById(R.id.groupname_button).setOnClickListener(this);
        if (admin()) {
            view.findViewById(R.id.appointment_button).setOnClickListener(this);
        }
        view.findViewById(R.id.go_button).setOnClickListener(this);

        // navigation drawer
        getActivity().getActionBar().setDisplayHomeAsUpEnabled(true);
        getActivity().getActionBar().setHomeButtonEnabled(true);

        mDrawerLayout = (DrawerLayout) this.getActivity().findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) this.getActivity().findViewById(R.id.left_drawer);
        // Set the adapter for the list view
        addDrawerItem();
        // Set the list's click listener
        mDrawerList.setOnItemClickListener(new GroupMapFragment.DrawerItemClickListener());

        mTitle = mDrawerTitle = getActivity().getTitle();
        mDrawerLayout = (DrawerLayout) this.getActivity().findViewById(R.id.drawer_layout);
        setDrawer();

        return view;
    }

//<<<<<<< HEAD

    protected View defineView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.group_map_not_go_fragment, container, false);
    }
//=======
    private void setDrawer(){
        mDrawerToggle = new ActionBarDrawerToggle(getActivity(), mDrawerLayout,
                R.string.drawer_open, R.string.drawer_close) {

            //Called when a drawer has settled in a completely closed state.
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getActivity().getActionBar().setTitle(mDrawerTitle);
                getActivity().invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            //Called when a drawer has settled in a completely open state.
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getActivity().getActionBar().setTitle(navigation);
                getActivity().invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        // Set the drawer toggle as the DrawerListener
        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.addDrawerListener(mDrawerToggle);
    }

    private void addDrawerItem(){
        //get groups where user is member or admin
        //TEST:
        String[] osArray = { "Gruppe 1", "Gruppe 2", "Gruppe 3", "Gruppe 4", "Gruppe 5" };

        //Groupname = getGroupname()

        //set the group name into the menu
        //TEST:
        Groupname = osArray;

        //setting adapter
        mAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, osArray);
        mDrawerList.setAdapter(mAdapter);
    }

    private String[] getGroupname(){
        //TODO: get group name i'm member or admin
        return null;
    }

    //navigation drawer
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }

    //navigation drawer
    // Swaps activities in the main content view
    private void selectItem(int position) {

        // Highlight the selected item, update the title, and close the drawer
        mDrawerList.setItemChecked(position, true);
        setTitle(Groupname[position]);
        mDrawerLayout.closeDrawer(mDrawerList);
        //TODO: wechsel gruppe auf der map

    }

    //navigation drawer
    private void setTitle(CharSequence title) {
        mTitle = title;
        getActivity().getActionBar().setTitle(mTitle);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* activity only?
    //for better syncing, menu becomes fluent
    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }
    */

    //for better syncing, menu becomes fluent
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    /**
     * identify the actuall GeoPoint
     *
     * @return actuall GeoPoint of the client
     */
    private GeoPoint getActuallPosition() {
        //TODO: vom GPS den Standpunkt ermitteln
        return new GeoPoint(49.013941, 8.404409);
//>>>>>>> feature_navigationdrawer
    }

    /**
     * handles the clicks from the buttons
     *
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
            go(mapView);
        }
    }

    protected void go(MapView mapView) {
    }

    private void defineGroup() {
        //TODO: GroupID aus der Data-Base laden
        //TODO: String "Mustergruppe" verändern
        //TODO: String "Mustertreffen" verändern
    }

    private boolean admin() {
        //TODO: überprüfen, ob dieser Client admin ist
        return true;
    }

    protected boolean goStatus() {
        //TODO: überprüfen, ob go gedrückt ist
        return false;
    }

    public void setActuallView(IGeoPoint geoPoint, int newZoom) {
        latitude = geoPoint.getLatitude();
        longitude = geoPoint.getLongitude();
        zoom = newZoom;
    }
}