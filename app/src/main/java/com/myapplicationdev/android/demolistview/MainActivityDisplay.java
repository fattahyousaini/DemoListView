package com.myapplicationdev.android.demolistview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityDisplay extends AppCompatActivity {
    TextView tvFoodDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_display);


        Intent intent = getIntent();
        String text =  intent.getStringExtra(Intent.EXTRA_TEXT);
        tvFoodDisplay = findViewById(R.id.tvFoodDisplay);
        tvFoodDisplay.setText(text);

    }
}
