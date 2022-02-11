package com.example.manley301assignment;

import java.util.*;
import android.view.*;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;


public class Control implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener{

//        implements View.OnClickListener, View.OnTouchListener,
//        SeekBar.OnSeekBarChangeListener{

//model and view

public Model sharedModel;
private PaintView SurfaceView;
private SeekBar red;
private TextView tView;
    private SeekBar blue;
    private SeekBar green;
    private CustomCircle circle ;







//public coloringController(coloringView createdColoringView){  //ctor
//
//sharedView = createdColoringView;
//sharedModel = sharedView.getColoringModel();
//
//
//
//}

    public Control (PaintView aView, TextView tView, SeekBar red, SeekBar green, SeekBar blue){
        //this.SurfaceView = SurfaceView;

        SurfaceView = aView ;
        this.tView = tView;
        this.red=red;
        this.green =green;
        this.blue=blue;


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
private int a;
@Override
public boolean onTouch(View view, MotionEvent motionEvent) {
int x = (int)motionEvent.getX();
int y = (int)motionEvent.getY();
int numcircles = SurfaceView.getNumCircles();

for (int i = 0; i < numcircles; i++){
    if(SurfaceView.circles[i].contains(x,y)){

        circle = SurfaceView.circles[i];
        break;

        //we found a circle setting it to local variable and heading out

    }



    if (SurfaceView.getCircle0().containsPoint(x,y)){

    }





if (sView.getC.containsPoint(x,y)){

}



a = SurfaceView.atest();


if (circle.containsPoint(x,y)){

//    circle.setColor(Color.RED);
//    red.setProgress(circle.getRed());
//    green.setProgress(circle.getGreen());
//    blue.setProgress(circle.getBlue());
    circle = sView.getCircle1();
} else {
    circle = aView.getCircle1();
}
    if (circle.containsPoint(x,y)){
//    circle.setColor(Color.GREEN);
//    red.setProgress(circle.getRed());
//    green.setProgress(circle.getGreen());
//    blue.setProgress(circle.getBlue());
}
circle = SurfaceView.getCircle2();
if (circle.containsPoint(x,y)){
//    circle.setColor(Color.BLUE);
//    red.setProgress(circle.getRed());
//    green.setProgress(circle.getGreen());
//    blue.setProgress(circle.getBlue());
}
circle = SurfaceView.getCircle3();
if (circle.containsPoint(x,y)){
//    circle.setColor(Color.YELLOW);
//    red.setProgress(circle.getRed());
//    green.setProgress(circle.getGreen());
//    blue.setProgress(circle.getBlue());
}
circle = SurfaceView.getCircle4();
if (circle.containsPoint(x,y)){
//    circle.setColor(Color.MAGENTA);
//    red.setProgress(circle.getRed());
//    green.setProgress(circle.getGreen());
//    blue.setProgress(circle.getBlue());
}
circle = SurfaceView.getCircle5();
if (circle.containsPoint(x,y)){
//    circle.setColor(Color.CYAN);
//    red.setProgress(circle.getRed());
//    green.setProgress(circle.getGreen());
//    blue.setProgress(circle.getBlue());
}
return false;
}



}

