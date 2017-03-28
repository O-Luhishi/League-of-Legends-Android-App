package com.zonosnetworks.zonos_net;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class EventLocation extends MainActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_location);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        double currentLatitude = 51.503192;
        double currentLongitude = 0.003144;

        // Add a marker in Sydney and move the camera
        LatLng london = new LatLng(currentLatitude, currentLongitude);
        mMap.addMarker(new MarkerOptions().position(london).title("Marker At The 02 Arena, London"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(london));



        LatLng latLng = new LatLng(currentLatitude, currentLongitude);


        float zoomLevel = (float) 15.0; //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));



    }
}
