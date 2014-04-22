package com.furnacechecks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewForm extends Activity {
	
	private Button saveButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_newform);
		
		saveButton = (Button) findViewById(R.id.saveButton);
		saveButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//save actions
				
			}
		});
		
	}
	
	

}
