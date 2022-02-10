package com.example.manley301assignment;

import java.util.*;
import android.*;
import android.view.MotionEvent;
import android.view.View; 
import android.widget.SeekBar;


public class Control implements View.OnClickListener, View.OnTouchListener,
SeekBar.OnSeekBarChangeListener{

//model and view

public Model sharedModel;
public View sharedView;

//public coloringController(coloringView createdColoringView){  //ctor
//
//sharedView = createdColoringView;
//sharedModel = sharedView.getColoringModel();
//
//
//
//}

@Override
public void onClick(View button) {    //onclick method for "blow out" button.

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

