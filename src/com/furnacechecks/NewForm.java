package com.furnacechecks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewForm extends Activity {
	
	private Button msaveButton;
	private TextView mIndoorMakeAnswerText;
	
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
				String dataExtracted;
				mIndoorMakeAnswerText = (TextView) findViewById(R.id.IndoorMake);
				/*THIS LINE CRASHES IT*/dataExtracted = (String) mIndoorMakeAnswerText.getText();
				dataExtracted+="Jason";
				System.out.println(dataExtracted);
				mIndoorMakeAnswerText.setText(dataExtracted);
				
				
				
			}
		});
		
	}
	
	

}
