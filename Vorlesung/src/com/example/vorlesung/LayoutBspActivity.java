package com.example.vorlesung;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;

public class LayoutBspActivity extends Activity {

	public static final String LAYOUT_TYPE_TABLE = "TABLE";
	public static final String LAYOUT_TYPE_LINEAR = "LINEAR";
	public static final String LAYOUT_TYPE_RELATIV = "RELATIV";
	public static final String LAYOUT_TYPE_FRAME = "FRAME";
	public static final String LAYOUT_TYPE_ABSOLUT = "ABSOLUT";
	public static final String DATA_KEY = "LAYOUT_TYP";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_layout_bsp);
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.layout_bsp, menu);
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
	
	public void onClick(View view) {
		
		Intent i = new Intent(this, LayoutExample.class);
		
		switch(view.getId()){
		case R.id.btn_layouts_to_linear:
			i.putExtra(DATA_KEY, LAYOUT_TYPE_LINEAR);
			break;
		
		case R.id.btn_layouts_to_table:
			i.putExtra(DATA_KEY, LAYOUT_TYPE_TABLE);
			break;
			
		case R.id.btn_layouts_to_relativ:
			i.putExtra(DATA_KEY, LAYOUT_TYPE_RELATIV);
			break;
			
		case R.id.btn_layouts_to_frame:
			i.putExtra(DATA_KEY, LAYOUT_TYPE_FRAME);
			break;
			
		case R.id.btn_layouts_to_absolut:
			i.putExtra(DATA_KEY, LAYOUT_TYPE_ABSOLUT);
			break;
			
		default:
			i.putExtra(DATA_KEY, LAYOUT_TYPE_LINEAR);
			break;
		}
		
		
		startActivity(i);
		

	}

}
