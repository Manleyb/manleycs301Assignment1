package com.example.manley301assignment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.SurfaceView;
import android.view.WindowManager;
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
  // public CustomCircle circle;
  private CustomCircle circle1;
  private CustomCircle circle2;
  private CustomCircle circle3;
  private CustomCircle circle4;
  private CustomCircle circle5;
  private int numCircles;
  private CustomCircle[] circles;
  private int count;

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

    DisplayMetrics displayMetrics = new DisplayMetrics();
    // context.getWindowManager().getMetrics(displayMetrics);
    ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

    // ((Activity) getContext()).getWindowManager()
    // .getDefaultDisplay()
    // .getMetrics(displayMetrics);
    int height = displayMetrics.heightPixels;
    int width = displayMetrics.widthPixels;
    int total = (height * width);
    circles = new CustomCircle[total / 2];
    // https://stackoverflow.com/questions/5280367/android-generate-random-color-on-click
    count = 0;
    for (int i = 0; i < total / 2; i++) {
      Random rnd = new Random();
      int intColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

      int randx = rnd.nextInt(1) + width;
      int randy = rnd.nextInt(1) + height;

      circles[i] = new CustomCircle("circle" + i, intColor, randx, randy, i);

      count++;

      setWillNotDraw(false);

      // aModel = new Model(); // model used by whole program
    }
    setCount(count);
  }

  public PaintView(Context context) {
    super(context);

  }

  @Override
  public void onDraw(Canvas canvas) {
    for (int i = 0; i < getCount(); i++){
      getCircles(i).d

  }

  // getter and setter for circles array
  public CustomCircle getCircles(int index) {
    return circles[index];

  }

  public void setCircles(CustomCircle[] circles) {
    this.circles = circles;

  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getCount() {
    return count;
  }

}