package com.example.android_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.android_view.BounceBall.BounceBallView;
import com.example.android_view.qq.QQMenu;
import com.example.android_view.sanjiao.MyVideoView;

public class MainActivity extends AppCompatActivity {

    BounceBallView bbv;
    MyVideoView myVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //小球
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

//三角
        myVideoView = (MyVideoView) findViewById(R.id.myloadview);
        myVideoView.startTranglesAnimation();

//qq底部导航栏能拖动
        final QQMenu QQMenu = (QQMenu) findViewById(R.id.avater_container);
        QQMenu.setImgages(R.drawable.skin_tab_icon_conversation_normal
                , R.drawable.skin_tab_icon_conversation_selected
                , R.drawable.rvq, R.drawable.rvr);
        QQMenu.setOnMenuClickListener(new QQMenu.OnMenuClickListener() {
            @Override
            public void onItemClick(View view) {
                Toast.makeText(MainActivity.this, "Click "+ QQMenu.isHasClick(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
