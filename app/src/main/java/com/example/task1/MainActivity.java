package com.example.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread s = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(i);
                    finish();
                }
                catch (Exception e) {

                }
            }
        };
        s.start();
    }
}
