package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.example.myapplication.fragments.MapFragment;
import com.example.myapplication.fragments.TextFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load MapFragment by default
        loadFragment(new MapFragment());

        findViewById(R.id.button_map).setOnClickListener(v -> loadFragment(new MapFragment()));
        findViewById(R.id.button_text).setOnClickListener(v -> loadFragment(new TextFragment()));
        //        viewPager = findViewById(R.id.viewPager);
        //
        //        // Set up the adapter for the ViewPager2
        //        viewPagerAdapter = new ViewPagerAdapter(this);
        //        viewPager.setAdapter(viewPagerAdapter);
    }

    // Helper method to load fragments
    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}