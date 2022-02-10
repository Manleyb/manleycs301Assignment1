package com.example.manley301assignment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.widget.SeekBar;

public class View extends SurfaceView {
//implements OnClickListener, OnTouchListener, SeekBar.OnSeekBarChangeListener
    public CustomCircle circle1;
 
    public CustomCircle circle2;
    public CustomCircle circle3;
    public CustomCircle circle4;
    public CustomCircle circle5;
    public CustomCircle circle6;

//    public View(CustomCircle circle0, CustomCircle circle1, CustomCircle circle2, CustomCircle circle3, CustomCircle circle4, CustomCircle circle5) {
//        this.circle6 = circle0;
//
//        this.circle1 = circle1;
//        this.circle2 = circle2;
//        this.circle3 = circle3;
//        this.circle4 = circle4;
//        this.circle5 = circle5;
//    }

   public Model getColoringModel(){
       return Model;
   }
//
//    public void setModel(Model coloringModel){
//        sharedModel = coloringModel;
//    }



    public View(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);

        sharedModel = new Model(); //model used by whole program


    }
@Override
public void onDraw(Canvas canvas) {

    circle1 = new CustomCircle("circle0", Color.RED, 100, 100, 100);
    circle1.drawMe(canvas);

    circle2 = new CustomCircle("circle1",Color.BLUE, 200, 200, 100);
    circle2.drawMe(canvas);

    circle3 = new CustomCircle("circle2",Color.GREEN, 300, 300, 100);
    circle3.drawMe(canvas);

    circle4 = new CustomCircle("circle3",Color.YELLOW, 400, 400, 100);
    circle4.drawMe(canvas);

    circle5 = new CustomCircle("circle4",Color.MAGENTA, 500, 500, 100);
    circle5.drawMe(canvas);

    circle6 = new CustomCircle("circle25",Color.CYAN, 600, 600, 100);
    circle6.drawMe(canvas);





}
//    @Override
//    public void onClick(View button) {
//return false;
//    }
//
//    @Override
//    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//
//    }

}
