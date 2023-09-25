package com.example.rotateanimationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {

        //Animation animation= AnimationUtils.loadAnimation(this,R.anim.rotate);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.fade_in);
        ImageView imageView=findViewById(R.id.img1);
        //imageView.setAnimation(animation);
        imageView.startAnimation(animation);

    }
}