package com.example.asus.playvideoexample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView=(VideoView)findViewById(R.id.videoview);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        String UrlPath="android.resource://"+getPackageName()+"/"+R.raw.color_switch;
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(Uri.parse(UrlPath));
        videoView.start();
    }
}
