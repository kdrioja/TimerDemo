package com.example.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         This is one way we can do a timer


        // handler allows us to do some timing functions
        final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Hey it's us", "A second has passed by");

                handler.postDelayed(this, 1000); //refers to time in ms
            }
        };

        handler.post(run);
         */

        /**
         Prefered way of instructor on how to do a timer
         */
        new CountDownTimer(10000, 1000) {

            public void onTick(long msUntilDone) {
                Log.i("Seconds left", String.valueOf(msUntilDone / 1000));
            }

            public void onFinish() {
                Log.i("We're done", "No more countdown");
            }
        }.start();
    }
}
