package com.example.vorlesung;

import android.app.Activity;
import android.os.Bundle;

public class LayoutExample extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Bundle extras = getIntent().getExtras();
		
		String type = extras.getString(LayoutBspActivity.DATA_KEY);
		
		if(type.equals(LayoutBspActivity.LAYOUT_TYPE_LINEAR)){
			setContentView(R.layout.linear_layout);
		}else if(type.equals(LayoutBspActivity.LAYOUT_TYPE_TABLE)){
			setContentView(R.layout.table_layout);
		}else if(type.equals(LayoutBspActivity.LAYOUT_TYPE_RELATIV)){
			setContentView(R.layout.relativ_layout);
		}else if(type.equals(LayoutBspActivity.LAYOUT_TYPE_FRAME)){
			setContentView(R.layout.frame_layout);
		}else if(type.equals(LayoutBspActivity.LAYOUT_TYPE_ABSOLUT)){
			setContentView(R.layout.absolut_layout);
		}else{
			setContentView(R.layout.linear_layout);
		}
		
		
		
	}
}
