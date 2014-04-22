package com.furnacechecks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewForm extends Activity {
	
	private Button msaveButton;
	private EditText mIndoorMakeAnswerText;
	
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
				
				//extract data test - This currently crashes app
				String dataExtracted = "";
				mIndoorMakeAnswerText = (EditText) findViewById(R.id.IndoorMake);
				dataExtracted = mIndoorMakeAnswerText.getText().toString();
				///*THIS LINE CRASHES IT*/dataExtracted = (String) mIndoorMakeAnswerText.getText();
				dataExtracted+="Jason";
				mIndoorMakeAnswerText.setText(dataExtracted);
				
				
				
			}
		});
		
	}
	
	

}
