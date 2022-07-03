package com.example.test113;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.Random;

public class SquareBuild {
    private int y;
    private int x;
    private Random randoms;
    public SquareBuild() {
        randoms=new Random();
    }
    public int GetX(){return this.x;}
    public int GetY(){return this.y;}
    public void draw(Canvas canvas, Paint paint) {
        this.x= randoms.nextInt(canvas.getWidth());
        this.y= randoms.nextInt(canvas.getHeight());
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(x,y,x+100,y+100,paint);
    }
}
