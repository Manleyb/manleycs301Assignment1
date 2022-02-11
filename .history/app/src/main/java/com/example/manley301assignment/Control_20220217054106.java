package com.example.manley301assignment;

import java.util.*;

import android.graphics.Color;
import android.view.*;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/*
Author: Bryce Manley
Date: 2020-02-10
Summary:
this is the Control class. Pleae note that there is no Model class, other classes like the 
circle class and some parts of the view and control class took its place.
This class is responsible for the touch events and the seekbar changes.
It updates the text, and changes the RGB values, I would say it was the most difficult part of the assignment.




*/

public class Control implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {


//initilized alot of varables and objects, Tried to keep most things private and I think that I could keep more stuff private,
//but I  think that the seekbars are something that sould be able to be acceses publically.
    private PaintView SurfaceView;
    public SeekBar red;
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
    private String TviewString = "";


    //pretty simple constructor, but important for passing in values
    public Control(PaintView aView, TextView tView, SeekBar red, SeekBar green, SeekBar blue) {

        SurfaceView = aView;
        this.tView = tView;
        this.red = red;
        this.green = green;
        this.blue = blue;

    }

//I would say this is pretty elegent code, just find what seekpar is being changes and then change the corrisponding coler val
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

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
        //this is important to update the text rgb valus
        tView.setText("Red: " + redVal + " Green: " + greenVal + " Blue: " + blueVal);

// the next two lines are very important invalidate so that we redraw and then circle.setcolor so that the circle is updated
        SurfaceView.invalidate();

        circle.setColor(RGBval);

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
        x = (int) motionEvent.getX();
        y = (int) motionEvent.getY();
        // int numcircles = SurfaceView.getCount();

        for (int i = 0; i < SurfaceView.getCount(); i++) {
            
            if (SurfaceView.getCircles(i).containsPoint(x, y)) {
                circle = SurfaceView.getCircles(i);
                RGBval = circle.getColor();

                redVal = Color.red(RGBval);
                greenVal = Color.green(RGBval);
                blueVal = Color.blue(RGBval);

                red.setProgress(redVal);
                green.setProgress(greenVal);
                blue.setProgress(blueVal);

                TviewString = "Red: " + redVal + " Green: " + greenVal + " Blue: " + blueVal;
                tView.setText("Red: " + redVal + " Green: " + greenVal + " Blue: " + blueVal);

                SurfaceView.invalidate();

            }

            // we found a circle setting it to local variable and heading out

        }

        return false;
    }

    // getter and setter for Tview String
    public String getTviewString() {
        return TviewString;
    }

    public void setTviewString(String tviewString) {
        this.TviewString = tviewString;
    }

    private void seekbarHandles() {

    }

}
