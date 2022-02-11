package com.example.manley301assignment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.widget.SeekBar;

import java.util.Random;
//be sure to include credits

public class PaintView extends SurfaceView {
  // just found out that the reason for my never ending bugs is that I named my
  // class view
  // System.end.mySuffering(); I feel like there should be a warning or somthing
  // for that
  // I will add it to the list of 10+ hour coding bug fixes

  // // implements OnClickListener, OnTouchListener,
  // SeekBar.OnSeekBarChangeListener
  public CustomCircle circle0;
  private CustomCircle circle1;
  private CustomCircle circle2;
  private CustomCircle circle3;
  private CustomCircle circle4;
  private CustomCircle circle5;
  private int numCircles;
  private CustomCircle[] circles ;

  // private Model aModel;

  // public View(CustomCircle circle0, CustomCircle circle1, CustomCircle circle2,
  // CustomCircle circle3, CustomCircle circle4, CustomCircle circle5) {
  // this.circle6 = circle0;
  //
  // this.circle1 = circle1;
  // this.circle2 = circle2;
  // this.circle3 = circle3;
  // this.circle4 = circle4;
  // this.circle5 = circle5;
  // }`

  // public Model getColoringModel() {
  // return aModel;
  // }
  //
  // public void setModel(Model coloringModel){
  // sharedModel = coloringModel;
  // }

  public PaintView(Context context, AttributeSet attrs) {
    super(context, attrs);
    setWillNotDraw(false);
      circles = new CustomCircle[100];
     // https://stackoverflow.com/questions/5280367/android-generate-random-color-on-click
for (int i = 0; i <100; i++){
  Random rnd = new Random();
int intColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));   
      circles [i] = new CustomCircle("circle"+i,intColor , i, i, i*i);

    setWillNotDraw(false);

    // aModel = new Model(); // model used by whole program

  }

  public PaintView(Context context) {
    super(context);
  }

  @Override
  public void onDraw(Canvas canvas) {
    // circle0.drawMe(canvas);

 
    
  }

 // getter and setter for circles array
  public CustomCircle[] getCircles(int index) {
  return circles;
  }

  public void setCircles(CustomCircle[] circles) {
  this.circles = circles;
  
  }

 

}
