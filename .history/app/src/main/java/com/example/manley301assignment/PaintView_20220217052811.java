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

/*
Author: Bryce Manley
Date: 2020-02-10
Summary: this is the view class for the application. It is responsible for drawing the circles and 
finding the size of the sreen. 


*/
public class PaintView extends SurfaceView {
  // just found out that the reason for my never ending bugs is that I named my
  // class view
  // System.end.mySuffering(); I feel like there should be a warning or somthing
  // for that
  // I will add it to the list of 10+ hour coding bug fixes

  private int numCircles;
  private CustomCircle[] circles;
  private int count;

  public PaintView(Context context, AttributeSet attrs) {
    super(context, attrs);
    // setWillNotDraw(false);

    /*
     * acknoledgement for finding window size in android:
     * https://stackoverflow.com/questions/9114436/how-to-get-screen-display-metrics
     * -in-application-class
     * 
     */

    // this is some complicated code that I found online to get the size of the
    // screen
    // what is important is the Display metrics class which allows me to find the
    // width and height of
    // the screen
    DisplayMetrics displayMetrics = new DisplayMetrics();
    ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

    // ((Activity) getContext()).getWindowManager()
    // .getDefaultDisplay()
    // .getMetrics(displayMetrics);
    int height = displayMetrics.heightPixels;
    int width = displayMetrics.widthPixels;
    int total = (width);
    /*
     * acknoledgement for generating random cumber and also color
     * //
     * https://stackoverflow.com/questions/5280367/android-generate-random-color-on-
     * click
     * I know that an example of this was also in the custom element class but I am
     * not what you
     * might call a smart cs student so I did not look there
     */
    setCount(0);
    circles = new CustomCircle[total];
    for (int i = 0; i < total; i++) {
      Random rnd = new Random();
      int intColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

      int randx = rnd.nextInt(width);
      int randy = rnd.nextInt(height);
      // minimum + rn.nextInt(maxValue - minvalue + 1)
      /*
       * similar to the above but acknoledgement for the color randomness
       * //https://stackoverflow.com/questions/363681/how-do-i-generate-random-
       * integers-within-a-specific-range-in-java?page=3&tab=oldest#tab-top
       * 
       */

      circles[i] = new CustomCircle("circle" + i, intColor, randx - 20, randy, randx / randy);

      setCircles(circles);

      count++;

      setWillNotDraw(false);

    }
    setCount(count);
  }

  public PaintView(Context context) {
    super(context);

  }

  @Override
  public void onDraw(Canvas canvas) {
    for (int i = 0; i < getCount(); i++) {
      getCircles(i).drawMe(canvas);

    }
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