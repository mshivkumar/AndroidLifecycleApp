package com.example.firstandroidapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxOne, checkBoxTwo;
    RadioButton radiobuttonOne, radioButtonTwo;
    RadioGroup radioGroupOne;
    Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CHECKBOX
        checkBoxOne = findViewById(R.id.checkbox_one);
        checkBoxTwo = findViewById(R.id.checkbox_two);
        checkButton = findViewById(R.id.check_button);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBoxOne.isChecked()) {
                    Toast.makeText(MainActivity.this, "CheckBox One Checked", Toast.LENGTH_SHORT).show();
                }
                if(checkBoxTwo.isChecked()) {
                    Toast.makeText(MainActivity.this, "CheckBox Two Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //RADIOBUTTON

        radiobuttonOne = findViewById(R.id.radio_button_one);
        radioButtonTwo = findViewById(R.id.radio_button_two);
        radioGroupOne = findViewById(R.id.radio_group_one);

        radioGroupOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                Toast.makeText(MainActivity.this, "Selected " + radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        radiobuttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Radio Button One Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        radioButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Radio Button Two Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

}