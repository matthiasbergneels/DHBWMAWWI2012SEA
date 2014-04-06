package com.example.vorlesung;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NavigationActivity extends Activity {

	private static final int REQUEST_CODE = 1000;
	public static final String KEY_QUESTION = "KEY_QUESTION";
	private static final String LOG_TAG = "NAVIGATIONACTIVITY";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_navigation);
		
		Log.d(LOG_TAG, getIntent().getExtras().getString(StartActivity.KEY_DATA));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.navigation, menu);
		return true;
	}
	
	public void onClick(View view){
		
		Intent i = new Intent(getApplicationContext(),
							QuestionActivity.class);
		
		EditText txt = (EditText)findViewById(R.id.txt_question);
		
		String question = txt.getText().toString();
		
		i.putExtra(KEY_QUESTION, question);
		
		startActivityForResult(i, REQUEST_CODE);
	}
	
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		if(requestCode == REQUEST_CODE){
			
			if(resultCode == RESULT_CANCELED){
				Toast.makeText(getApplicationContext(), "Keine Antwort!", Toast.LENGTH_LONG).show();
			}else if(resultCode == RESULT_OK){
				Toast.makeText(getApplicationContext(), "Antwort " + data.getExtras().getString(QuestionActivity.KEY_ANSWER)
			, Toast.LENGTH_LONG).show();
			}
			
		}
		
		
		super.onActivityResult(requestCode, resultCode, data);
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
	
	
	// Active Mode
	
	
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


