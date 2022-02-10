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
    private CustomCircle circle ;
    private View view1;



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

// @Override
// public void onClick(View view) {
// //determin if click if touching circle and print the red green and blue values 
// //of the circle that was clicked. then change seekbar values to the circle's 
// //rgb values. If the seekbar value is changed then the circle RBB values will
// //change as well.

// //if clicking

//     CustomCircle circle;






// }



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
public boolean onTouch(View SurfaceView, MotionEvent motionEvent) {
int x = (int)motionEvent.getX();
int y = (int)motionEvent.getY();

circle = SurfaceView.getCircle0();
if (circle.containsPoint(x,y)){

//    circle.setColor(Color.RED);
//    red.setProgress(circle.getRed());
//    green.setProgress(circle.getGreen());
//    blue.setProgress(circle.getBlue());
}
circle = SurfaceView.getCircle1();
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

//tell the View that it needs to redraw itself
//drawing.invalidate();







//getter and setter for x and y click

//public int getX() {
//return x;
//}
//
//public int getY() {
//return y;
//}
//
//public void setX(int x) {
//this.x = x;
//}
//
//public void setY(int y) {
//this.y = y;
//}


}

