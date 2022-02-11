package com.example.manley301assignment;

import java.util.*;

import android.graphics.Color;
import android.view.*;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class Control implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {

    // implements View.OnClickListener, View.OnTouchListener,
    // SeekBar.OnSeekBarChangeListener{

    // model and view

    private PaintView SurfaceView;
    private SeekBar red;
    private TextView tView;
    public SeekBar blue;
    public SeekBar green;
    public CustomCircle circle;
    private int RGBval;
    private int redVal;
    private int greenVal;
    private int blueVal;
    private int x;
    private int y;
    private String TviewString ="";
    public Control(PaintView aView, TextView tView, SeekBar red, SeekBar green, SeekBar blue) {
        // this.SurfaceView = SurfaceView;

        SurfaceView = aView;
        this.tView = tView;
        this.red = red;
        this.green = green;
        this.blue = blue;

    }

    // ass to not get confused:
    // seekbar=red
    // seekbar2=green
    // seekbar3=blue
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        // RGBval = RGBval.getColor();

        if (seekBar.getId() == R.id.seekBar) {

            redVal = seekBar.getProgress();

        }
        if (seekBar.getId() == R.id.seekBar2) {

            greenVal = seekBar.getProgress();
        }

        if (seekBar.getId() == R.id.seekBar3) {

            blueVal = seekBar.getProgress();
        }
        RGBval = Color.rgb(redVal, greenVal, blueVal);

        SurfaceView.invalidate();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    private int a;

@Override
public boolean onTouch(View view, MotionEvent motionEvent) {
x = (int)motionEvent.getX();
 y = (int)motionEvent.getY();
//int numcircles = SurfaceView.getCount();

for (int i = 0; i < SurfaceView.getCount(); i++){
    //
    if(SurfaceView.getCircles(i).containsPoint(x,y)){
        circle = SurfaceView.getCircles(i);
    RGBval = circle.getColor();

    redVal = Color.red(RGBval);
    greenVal = Color.green(RGBval);
    blueVal = Color.blue(RGBval);

    red.setProgress(redVal);
    green.setProgress(greenVal);
    blue.setProgress(blueVal);

    TviewString = "Red: " + redVal + " Green: " + greenVal + " Blue: " + blueVal;
    


SurfaceView.invalidate();

    }




        //we found a circle setting it to local variable and heading out

    }

  



 
return false;
}

  //getter and setter for Tview String 
  public String getTviewString() {
    return TviewString;
}

public void setTviewString(String tviewString) {
    this.TviewString = tviewString;
}

    private void seekbarHandles() {

    }

}
