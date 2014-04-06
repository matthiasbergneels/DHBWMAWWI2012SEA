package com.example.vorlesung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class StartActivity extends Activity {
	
	private static final String LOG_TAG = "STARTACTIVITY";
	
	public static final String KEY_DATA = "DATEN";

	
	// Starting Activity
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.start_activity);
		
		Log.d(LOG_TAG, "onCreate()");
		
	}
	
	@Override
	protected void onStart() {
		Log.d(LOG_TAG, "onStart()");
		
		super.onStart();
	}
	
	@Override
	protected void onRestart() {
		Log.d(LOG_TAG, "onRestart()");
		
		super.onRestart();
	}
	
	@Override
	protected void onResume() {
		Log.d(LOG_TAG, "onResume()");
		
		super.onResume();
	}
	
	
	// Active Mode of Activity
	public void onClick(View view){
		Log.d(LOG_TAG, "onClick() " + view.getId());
		
		Intent i;
		
		switch(view.getId()){
		case R.id.btn_start_activity_to_navigation:
			i = new Intent(getApplicationContext(), NavigationActivity.class);
			
			i.putExtra(KEY_DATA, "Hier stehen alle Daten:");
			
			startActivity(i);
			
			break;
		case R.id.btn_start_activity_to_layouts:
			i = new Intent(getApplicationContext(), LayoutBspActivity.class);
			
			startActivity(i);
			
			break;
		case R.id.btn_start_to_broadcast:
			i = new Intent(getApplicationContext(), BroadcastActivity.class);
			
			startActivity(i);	
			
			break;
		}
		
	}
	
	
	
	// Leaving Activity
	@Override
	protected void onPause() {
		Log.d(LOG_TAG, "onPause()");
		
		super.onPause();
	}
	
	
	@Override
	protected void onStop() {
		Log.d(LOG_TAG, "onStop()");
		
		super.onStop();
	}
	
	
	@Override
	protected void onDestroy() {
		Log.d(LOG_TAG, "onDestroy()");
		
		super.onDestroy();
	}
}
