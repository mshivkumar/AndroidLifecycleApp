package com.example.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondaryActivity extends AppCompatActivity {

    TextView titleTextView;
    TextView subtitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        titleTextView = findViewById(R.id.secondary_activity_title);
        subtitleTextView = findViewById(R.id.secondary_activity_subtitle);

        Intent i = getIntent();
        String receivedData = i.getStringExtra("data");
        subtitleTextView.setText(receivedData);
    }
}