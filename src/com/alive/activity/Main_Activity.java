package com.alive.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.alive.R;

public class Main_Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		/*
		 * хак для того чтобы убрать меню с 3 точками
		 */
		getApplicationInfo().targetSdkVersion = 14;

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button first_run_btn = (Button) findViewById(R.id.first_run_btn);

		first_run_btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getBaseContext(), ThreeScreen.class);
				startActivity(i);

			}
		});
	}

}
