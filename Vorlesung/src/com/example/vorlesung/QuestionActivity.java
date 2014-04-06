package com.example.vorlesung;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class QuestionActivity extends Activity {

	public static final String KEY_ANSWER = "KEY_ANSWER";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question);
		
		TextView lbl = (TextView)findViewById(R.id.lbl_question);
		
		lbl.setText(getIntent().getExtras().getString(NavigationActivity.KEY_QUESTION));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.question, menu);
		return true;
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}
	
	public void onClick(View view){
		
		switch(view.getId()){
		case R.id.btn_answer:
			
			Intent i = new Intent();
			
			EditText txt = (EditText)findViewById(R.id.txt_answer);
			
			i.putExtra(KEY_ANSWER, txt.getText().toString());
			
			setResult(RESULT_OK, i);
			break;
			
		case R.id.btn_cancel:
			setResult(RESULT_CANCELED);
			break;
		}
		
		finish();
		
	}
	
	
	

}
