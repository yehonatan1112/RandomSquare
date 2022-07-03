package com.example.test113;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private LayoutFrames LayoutFrames;
    private FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutFrames= new LayoutFrames(this);
        frameLayout = findViewById(R.id.frm);
        frameLayout.addView(LayoutFrames);
    }
}