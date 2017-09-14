package com.example.android_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android_view.BounceBall.BounceBallView;
import com.example.android_view.sanjiao.MyVideoView;

public class MainActivity extends AppCompatActivity {

    BounceBallView bbv;
    MyVideoView myVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bbv = (BounceBallView) findViewById(R.id.bbv1);
        bbv.config()
                .ballCount(15)
                .bounceCount(3)
                .ballDelay(220)
                .duration(3300)
                .radius(15)
                .isPhysicMode(true)
                .isRamdomPath(true)
                .isRandomColor(true)
                .isRandomRadius(true)
                .apply();
        bbv.start();


        myVideoView = (MyVideoView) findViewById(R.id.myloadview);
        myVideoView.startTranglesAnimation();
    }
}
