package com.furnacechecks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity{
	
	private Button mNewFormButton;
	private Button mViewFormsButton;
	
	
	@Override
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mNewFormButton = (Button) findViewById(R.id.newFormButton);
		
		mNewFormButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Switch Activities to activity_newform and NewForm.java
				startActivity(new Intent(getApplicationContext(), NewForm.class));
			}
		});
		
		mViewFormsButton = (Button) findViewById(R.id.viewFormsButton);
		mViewFormsButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Switch Activities to activity_viewforms and ViewForms.java
				startActivity(new Intent(getApplicationContext(), ViewForms.class));
			}
		});
		
	}

}
