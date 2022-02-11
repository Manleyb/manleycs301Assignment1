package com.example.manley301assignment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.widget.SeekBar;
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
  // private CustomCircle[] circles ;

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
    circle0 = new CustomCircle("circle0", Color.CYAN, 600, 600, 100);

    setWillNotDraw(false);

    // aModel = new Model(); // model used by whole program

  }

  public PaintView(Context context) {
    super(context);
  }

  @Override
  public void onDraw(Canvas canvas) {
    // circle0.drawMe(canvas);

    // circles = new CustomCircle[6];
    // circles [0] = new CustomCircle("circle0", Color.CYAN, 600, 600, 100);

    // circle0.drawMe(canvas);'

    // setCircle(circle0);

    circle0 = new CustomCircle("circle1", Color.RED, 100, 100, 100);
    circle0.drawMe(canvas);

    circle1 = new CustomCircle("circle2", Color.GREEN, 200, 200, 100);
    circle1.drawMe(canvas);

    circle2 = new CustomCircle("circle2", Color.BLUE, 200, 200, 100);
    circle2.drawMe(canvas);

    circle3 = new CustomCircle("circle3", Color.GREEN, 300, 300, 100);
    circle3.drawMe(canvas);

    circle4 = new CustomCircle("circle4", Color.YELLOW, 400, 400, 100);
    circle4.drawMe(canvas);

    circle5 = new CustomCircle("circle5", Color.MAGENTA, 500, 500, 100);
    circle5.drawMe(canvas);
  }

  // getter and setter for circles array
  // public CustomCircle[] getCircles(int index) {
  // return circles[];
  // }

  // public void setCircles(CustomCircle[] circles) {
  // this.circles = circles;
  // }
  //

  // public CustomCircle getCircle0() {
  // return this.circle0;
  // }

  // public int aTest(){
  // return 0;
  // }
  // public CustomCircle getCircle1() {
  // return circle1;
  // }
  //
  // public CustomCircle getCircle2() {
  // return circle2;
  // }
  //
  // public CustomCircle getCircle3() {
  // return circle3;
  // }
  //
  // public CustomCircle getCircle4() {
  // return circle4;
  // }
  //
  // public CustomCircle getCircle5() {
  // return circle5;
  // }
  //
  // public void setCircle0(CustomCircle circle0) {
  // this.circle0 = circle0;
  // }

  // @Override
  // public void onClick(View button) {
  // return false;
  // }
  //
  // @Override
  // public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
  //
  // }

}
