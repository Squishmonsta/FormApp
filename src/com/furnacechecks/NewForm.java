package com.furnacechecks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewForm extends Activity {
	
	private Button msaveButton;
	private EditText mIndoorMakeAnswerText;
	private EditText mFormTitle;
	
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
				
				//Example of getting and setting form data
				String formTitleString = "";
				mFormTitle = (EditText) findViewById(R.id.FormTitle);
				formTitleString = mFormTitle.getText().toString();
				formTitleString+="Jason";
				mFormTitle.setText(formTitleString);
				
				
				
				
				
			}
		});
		
	}
	
	

}
