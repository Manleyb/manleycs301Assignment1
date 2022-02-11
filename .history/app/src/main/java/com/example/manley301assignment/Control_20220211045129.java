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

    public Model sharedModel;
    private PaintView SurfaceView;
    private SeekBar red;
    private TextView tView;
    private SeekBar blue;
    private SeekBar green;
    private CustomCircle circle;
    private int RGBval;
    private int redVal;
    private int greenVal;
    private int blueVal;
    private int x;
    private int y;

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
int numcircles = SurfaceView.getNumCircles();

for (int i = 0; i < numcircles; i++){
    circle = SurfaceView.getCircles(i);
    if(SurfaceView.getCircles(i)

        circle = SurfaceView.circles[i];
        break;

        //we found a circle setting it to local variable and heading out

    }



 
return false;
}

    private void seekbarHandles() {

    }

}
