package com.alive.activity;

import com.example.alive.R;

import android.app.Activity;
import android.os.Bundle;

public class ThreeScreen extends Activity {

	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 	/*
		 * хак для того чтобы убрать меню с 3 точками
		*/  
	 	getApplicationInfo().targetSdkVersion = 14;
	 	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen11);
	 }
}
