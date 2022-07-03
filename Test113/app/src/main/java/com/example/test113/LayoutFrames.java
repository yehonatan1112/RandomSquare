package com.example.test113;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;


public class LayoutFrames extends View {
    private Paint paint;
    public int count;
    Toast toast;
    SquareBuild square1;
    public LayoutFrames(Context context){
        super(context);
        paint =new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(12);
        square1=new SquareBuild();
        count =0;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            square1=new SquareBuild();
            invalidate();
        }
        return true;
    }
    @Override
    protected void onDraw(Canvas canvas) {
        square1.draw(canvas,paint);
        if(square1.GetX()+100>canvas.getWidth()||square1.GetY()+100>canvas.getHeight()){
            toast.makeText(getContext().getApplicationContext(), count+" Rects", Toast.LENGTH_SHORT).show();
            count=0;
        }
        else
            count++;
    }
}
