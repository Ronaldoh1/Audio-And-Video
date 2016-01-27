package com.example.ronaldhernandez.audioandvideo;

import android.media.session.MediaController;
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
        //add controls to the video.

        android.widget.MediaController mediaController =  new android.widget.MediaController(this);

        //add controllers to the video.
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);
        video.start();
    }
}
