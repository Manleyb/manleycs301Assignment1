package com.example.manley301assignment;

public class View {

    public CustomCircle circle1;
    public CustomCircle circle2;
    public CustomCircle circle3;
    public CustomCircle circle4;
    public CustomCircle circle5;
    public CustomCircle circle6;

    public View(CustomCircle circle1, CustomCircle circle2, CustomCircle circle3, CustomCircle circle4,
            CustomCircle circle5, CustomCircle circle6) {
        this.circle1 = circle1;
        this.circle2 = circle2;
        this.circle3 = circle3;
        this.circle4 = circle4;
        this.circle5 = circle5;
        this.circle6 = circle6;
    }

    @Override
    public void onClick(View button) {

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

}
