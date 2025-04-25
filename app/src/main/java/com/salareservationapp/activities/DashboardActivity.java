package com.salareservationapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.salareservationapp.R;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button reserveRoomButton = findViewById(R.id.reserveRoomButton);
        reserveRoomButton.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, RoomReservationActivity.class);
            startActivity(intent);
        });
        
        Button profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, ProfileActivity.class);
            startActivity(intent);
        });
    }
}