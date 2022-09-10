package com.fruitportrobotics.fruitscoutalpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_screen);

        // Creates button objects and attaches the ids
        Button startButton = (Button) findViewById(R.id.startButton);
        Button settingsButton = (Button) findViewById(R.id.settingsButton);
        // May be removed
        Button dataRetrivalButton = (Button) findViewById(R.id.retriveDataButton);
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);

        // Waits until the startButton is pressed and then preforms the code in the curly braces
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Switches to ActivityScoutingTypeSelection
                switchActivity(ActivityScoutingTypeSelection.class);
            }
        });
        // Waits until the button is pressed and then preforms the code in the curly braces
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Switches to ActivitySettingsScreen
                switchActivity(ActivitySettingsScreen.class);
            }
        });
        // Listens for the title to be clicked and then preforms code in the curly braces
        titleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Switches to ActivityCreditsScreen
                switchActivity(ActivityCreditsScreen.class);
            }
        });
        // May be removed, do not edit until certain
        dataRetrivalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    // Switch Activity Method (Creates a switchActiveIntent Intent and starts the activity referenced )
    public void switchActivity(Class switchTo) {
        Intent switchActivityIntent = new Intent(this, switchTo);
        startActivity(switchActivityIntent);
        // May cause problems
        this.finish();
    }
}