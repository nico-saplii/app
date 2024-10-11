package com.example.app;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.app.databinding.ActivityMaps2Binding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMaps2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng fruitschillan = new LatLng(-36.61347660399475, -72.10320131159915);
        LatLng fruitsconcepcion = new LatLng(-36.82154852894865,  -73.05712907783007);
        LatLng fruitssancarlos= new LatLng(-36.421911561462615, -71.95466013539084);
        LatLng fruitsquillon = new LatLng(-36.7421867290705, -72.47299282997427);



        mMap.addMarker(new MarkerOptions().position(fruitschillan).title("fruits chillan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fruitschillan));


        mMap.addMarker(new MarkerOptions().position(fruitsconcepcion).title("fruits Conce"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fruitsconcepcion));

        mMap.addMarker(new MarkerOptions().position(fruitssancarlos).title("fruits San carlos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fruitssancarlos));


        mMap.addMarker(new MarkerOptions().position(fruitsquillon).title("fruits Quillon"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fruitsquillon));
    }


    }


