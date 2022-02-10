package com.example.manley301assignment;

import java.util.*;
import android.*;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;


public class Control implements View.OnClickListener, View.OnTouchListener,
SeekBar.OnSeekBarChangeListener{

//model and view

public Model sharedModel;
public SurfaceView View;
private SeekBar red;
    private SeekBar blue;
    private SeekBar green;


//public coloringController(coloringView createdColoringView){  //ctor
//
//sharedView = createdColoringView;
//sharedModel = sharedView.getColoringModel();
//
//
//
//}

    public Control (SurfaceView colorView, TextView tView, SeekBar red, SeekBar green, SeekBar blue){
        View = colorView;
        this.View = View;
        this.red=red;
        this.green =green;
        this.blue=blue;


        
        



    }

@Override
public void onClick(View view) {   
//determin if click if touching circle and print the red green and blue values 
//of the circle that was clicked. then change seekbar values to the circle's 
//rgb values. If the seekbar value is changed then the circle RBB values will
//change as well.

//if clicking 

if(view.getCircle0)


}



@Override
public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

}

@Override
public void onStartTrackingTouch(SeekBar seekBar) {

}

@Override
public void onStopTrackingTouch(SeekBar seekBar) {

}

@Override
public boolean onTouch(View view, MotionEvent motionEvent) {
int x = (int)motionEvent.getX();
int y = (int)motionEvent.getY();


//tell the View that it needs to redraw itself
//drawing.invalidate();



return true;
}

}

