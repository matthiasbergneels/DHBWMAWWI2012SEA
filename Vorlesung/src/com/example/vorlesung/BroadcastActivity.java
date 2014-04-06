package com.example.vorlesung;

import android.os.Bundle;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class BroadcastActivity extends Activity {

	
	private static final String SEND_BROADCAST = "com.example.vorlesung.intent.INFORMATION";
	private BroadcastReceiver mReceiver = new BroadcastReceiver() {
		
		@Override
		public void onReceive(Context c, Intent i) {
			
			if(i.getAction() == Intent.ACTION_BATTERY_LOW){
				Toast.makeText(getApplicationContext(), "Battery changed", Toast.LENGTH_LONG).show();
			}else if(i.getAction() == SEND_BROADCAST){
				Toast.makeText(getApplicationContext(), "Du bist informiert!", Toast.LENGTH_LONG).show();
			}
		}
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_broadcast);
		// Show the Up button in the action bar.
		setupActionBar();
		
		
	}
	
	@Override
	protected void onResume() {
		IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_LOW);
		
		filter.addAction(SEND_BROADCAST);
		
		getApplicationContext().registerReceiver(mReceiver, filter);
		
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		
		getApplicationContext().unregisterReceiver(mReceiver);
		
		
		super.onPause();
	}
	

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}
	
	public void onClick(View view){
		
		Intent i = new Intent(SEND_BROADCAST);
		
		sendBroadcast(i);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.broadcast, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
