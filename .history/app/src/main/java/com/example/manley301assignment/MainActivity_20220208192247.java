package com.example.manley301assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    coloringController Controller;
//    coloringModel Model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        View drawview = findViewById(R.id.seekBar3)
        TextView tview = (TextView) findViewById(R.id.textView);
        View drawView =findViewById(R.id.surfaceView);

       // tview.setText("Hello World");
        View seekBar = findViewById(R.id.seekBar);
        View seekBar2 = findViewById(R.id.seekBar2);
        View seekBar3 = findViewById(R.id.seekBar3);

Control viewControl = new Control();





//        seekBar = (SeekBar) findViewById(R.id.seekBar);
//        seekBar.setOnSeekBarChangeListener(this);
//         seekBar1 = (SeekBar) findViewById(R.id.seekBar);
//        seekBar1.setOnSeekBarChangeListener(this);
//         seekBar2 = (SeekBar) findViewById(R.id.seekBar);
//        seekBar2.setOnSeekBarChangeListener(this);
//
//
//        View aView = findViewById(R.id. //the shared coloring View
//       Controller = new Control(View);

        //create a coloringController object to listen to my touch events
//        coloringController colControl = new coloringController(sharedColoringView);
//        sharedColoringView.setOnTouchListener(colControl); //is this correct? What do i attach the listener to.
    }
}