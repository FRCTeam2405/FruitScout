package com.fruitportrobotics.fruitscoutalpha;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class ActivitySettingsScreen extends ActivityTitleScreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_screen);
    }
}