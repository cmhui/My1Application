package com.bmobchat.android.my1application;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class StandardActivity extends AppCompatActivity {

	private static final String TAG = "StandardActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_standard);

		Handler handler = new Handler();
		handler.postDelayed();
		Log.i(TAG, "=====onCreate"+getTaskId());
	}

	public void standradJump(View view){
		Intent intent = new Intent("android.intent.action.ok");
		intent.addCategory("android.intent.category.LAUNCHER");
//		startActivity(intent);
		intent.putExtra("key", "value");
		startActivityForResult(intent, 100, null);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Log.i(TAG, "onActivityResult");
	}

	public void standrad2Jump(View view){
		Intent intent = new Intent("android.intent.action.ok");
		intent.addCategory("android.intent.category.LAUNCHER");
		startActivity(intent);
	}

	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		Log.i(TAG, "onNewIntent");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.i(TAG, "onStart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i(TAG, "onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i(TAG, "onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i(TAG, "onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "onDesroy");
	}
}
