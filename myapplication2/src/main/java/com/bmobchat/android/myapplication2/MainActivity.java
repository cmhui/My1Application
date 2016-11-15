package com.bmobchat.android.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = "MainActivity other";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		int taskId = getTaskId();
		Log.i(TAG, "onCreate=="+taskId);
	}



	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		Log.i(TAG, "onNewIntent");
	}

	@Override
	protected void onStart() {
		super.onStart();


		Intent intent = getIntent();
		String values = intent.getStringExtra("key");
		Log.i(TAG, "onStart--"+values);
		Intent intent1 = new Intent();
		setResult(200, intent1);
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i(TAG, "onResume");
	}
}
