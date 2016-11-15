package com.bmobchat.android.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = "MainActivity3";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.i(TAG, "onCreate--"+getTaskId());
	}

	public void standradJump(View view){
		Intent intent = new Intent("android.intent.action.ok");
		intent.addCategory("android.intent.category.LAUNCHER");
		startActivity(intent);
	}

	public void standrad2Jump(View view){
		Intent intent = new Intent("android.intent.action.ok");
		intent.addCategory("android.intent.category.LAUNCHER");
		startActivity(intent);
	}

}
