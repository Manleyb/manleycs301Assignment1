package com.example.manley301assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    coloringController Controller;
    coloringModel Model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tview = (TextView) findViewById(R.id.textView);
        tview.setText("Hello World");
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);
        SeekBar seekBar1 = (SeekBar) findViewById(R.id.seekBar);
        seekBar1.setOnSeekBarChangeListener(this);
        SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar);
        seekBar2.setOnSeekBarChangeListener(this);


        View aView = findViewById(R.id. //the shared coloring View
       Controller = new Control(View);

        //create a coloringController object to listen to my touch events
        coloringController colControl = new coloringController(sharedColoringView);
        sharedColoringView.setOnTouchListener(colControl); //is this correct? What do i attach the listener to.
    }
}