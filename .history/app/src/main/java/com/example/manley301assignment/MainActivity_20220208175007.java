package com.example.manley301assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tview = (TextView) findViewById(R.id.textView);
        tview.setText("Hello World");
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);
        

        View aView = findViewById(R.id. //the shared coloring View

       sharedController = new coloringController(sharedColoringView);

        //create a coloringController object to listen to my touch events
        coloringController colControl = new coloringController(sharedColoringView);
        sharedColoringView.setOnTouchListener(colControl); //is this correct? What do i attach the listener to.
    }
}