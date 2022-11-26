package com.example.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView titleTextView;
    Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        titleTextView = findViewById(R.id.title_text_view);
        shareButton = findViewById(R.id.share_btn);
        double luckyNumber = 0;

        Intent i = getIntent();
        String name = i.getStringExtra("name");

        luckyNumber = Math.random();

        titleTextView.setText(name + " lucky number is " + luckyNumber);

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_SUBJECT, name);
                i.putExtra(Intent.EXTRA_TEXT, 200);

                startActivity(Intent.createChooser(i, "Choose a platform"));
            }
        });
    }
}