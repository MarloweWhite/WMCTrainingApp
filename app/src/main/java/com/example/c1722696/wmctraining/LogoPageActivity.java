package com.example.c1722696.wmctraining;


import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by c1722696 on 4/11/2018.
 */

public class LogoPageActivity extends AppCompatActivity {




    Timer timer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_logo);


        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(LogoPageActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);

    }


}
