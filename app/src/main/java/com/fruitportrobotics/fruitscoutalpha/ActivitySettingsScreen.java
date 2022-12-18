package com.fruitportrobotics.fruitscoutalpha;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;


public class ActivitySettingsScreen extends ActivityTitleScreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_screen);

        Button addQuestionButton = findViewById(R.id.addQuestionButton);

        addQuestionButton.setOnClickListener(view -> {

            // Gets Layout Inflater and inflates the view
            LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View questionCreationPopupView = inflater.inflate(R.layout.questioncreation_popup_window, null);

            // Creating the Popupwindow
            int width = RelativeLayout.LayoutParams.WRAP_CONTENT;
            int height = RelativeLayout.LayoutParams.WRAP_CONTENT;
            final PopupWindow popupWindow = new PopupWindow(questionCreationPopupView, width, height, true);
            // Shows popup screen
            popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

            questionCreationPopupView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    popupWindow.dismiss();
                    return true;
                }
            });
        });
    }
    // Switch Activity Method (Creates a switchActiveIntent Intent and starts the activity referenced )
//    public void switchActivity(Class switchTo, boolean finish) {
//        Intent switchActivityIntent = new Intent(this, switchTo);
//        startActivity(switchActivityIntent);
//
//        if (finish) {
//            this.finish();
//        }
//    }
}