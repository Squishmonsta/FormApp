package com.furnacechecks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewForm extends Activity {
	
	private Button msaveButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_newform);
		
		msaveButton = (Button) findViewById(R.id.saveButton);
		msaveButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				/*save actions:
				 * 	 1)extract data
				 *   2)save to XML doc
				 *   3) display some screen?
				 */
				
			}
		});
		
	}
	
	

}
