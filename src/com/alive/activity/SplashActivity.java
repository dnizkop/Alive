package com.alive.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.alive.R;


public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	/*
		 * хак для того чтобы убрать меню с 3 точками
		*/  
    	getApplicationInfo().targetSdkVersion = 14;
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        
        Thread background = new Thread() {
            public void run() {
                 
                try {                   
                    sleep(2*1000);
                    Intent i=new Intent(getBaseContext(),Main_Activity.class);
                    startActivity(i);
                    finish();
                     
                } catch (Exception e) {
                 
                }
            }
        };
         
        // start thread
        background.start();
    }
}
