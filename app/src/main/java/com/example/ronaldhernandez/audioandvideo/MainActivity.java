package com.example.ronaldhernandez.audioandvideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video = (VideoView)findViewById(R.id.videoView);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.videodemo);

        video.start();
    }
}
