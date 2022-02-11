package com.example.manley301assignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

/*
Author: Bryce Manley
Date: 2020-02-10
Summary: This is the main activity for the application. It listnes for touch events and seekbar changes.
It initializes the seekbars and textviews, as well as tthe controler class Control
 


*/

public class MainActivity extends AppCompatActivity {
  // coloringController Controller;
  // coloringModel Model;
  public SeekBar red;

  public SeekBar green;
  public SeekBar blue;
  public TextView tview;
  Control initControl;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // View drawview = findViewById(R.id.seekBar3);
    TextView tview = (TextView) findViewById(R.id.textView);
    PaintView drawView = findViewById(R.id.surfaceView);
    // drawView is the object
    // need to pass refrence to object in constructor

    // tview.setText("Hello World");
    red = findViewById(R.id.seekBar);
    green = findViewById(R.id.seekBar2);
    blue = findViewById(R.id.seekBar3);
    tview = findViewById(R.id.textView);

    Control viewControl = new Control(drawView, tview, red, green, blue);


     PaintView Pview = findViewById(R.id.surfaceView);
     Pview.setOnTouchListener(viewControl);


     red.setOnSeekBarChangeListener(viewControl);
     green.setOnSeekBarChangeListener(viewControl);
     blue.setOnSeekBarChangeListener(viewControl);




    //
    //
    // View aView = findViewById(R.id. //the shared coloring View
    // Controller = new Control(View);

    // create a coloringController object to listen to my touch events
    // coloringController colControl = new coloringController(sharedColoringView);
    // sharedColoringView.setOnTouchListener(colControl); //is this correct? What do
    // i attach the listener to.
  }
}