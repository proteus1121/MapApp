package com.example.myapplication.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;

public class MapFragment extends Fragment implements OnMapReadyCallback {

    public MapFragment() {
        super(R.layout.fragment_map);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng location = new LatLng(-34, 151);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 10));

        // Custom polygon layer
        PolygonOptions polygonOptions = new PolygonOptions()
                .add(new LatLng(-34, 151), new LatLng(-35, 152), new LatLng(-33.5, 150))
                .strokeColor(0xFF00FF00) // Green border
                .fillColor(0x5500FF00);  // Semi-transparent fill

        googleMap.addPolygon(polygonOptions);
    }
}
