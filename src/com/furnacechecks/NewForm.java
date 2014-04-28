package com.furnacechecks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
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
				
				//Example of getting and setting form data
				String formTitleString = "";
				mFormTitle = (EditText) findViewById(R.id.FormTitle);
				formTitleString = mFormTitle.getText().toString();
				formTitleString+="Jason";
				mFormTitle.setText(formTitleString);
				
				/*save actions:
				 * 	 1)extract data
				 *   2)save to XML doc *Baseline code*
				 *   3) display some screen?
				 */
				//2
				String xmlFile = "<form> <title>" + mFormTitle + "</title> </form>";
				try {
					FileOutputStream fos = openFileOutput(mFormTitle + ".xml",
					        Context.MODE_APPEND | Context.MODE_WORLD_READABLE);
					fos.write(xmlFile.getBytes());
					fos.close();
					
					String storageState = Environment.getExternalStorageState();
				    if (storageState.equals(Environment.MEDIA_MOUNTED)) {
				        File file = new File(getExternalFilesDir(null),
				                "DayTwentyTwoFileTwo");
				        FileOutputStream fos2 = new FileOutputStream(file);
				        fos2.write(xmlFile.getBytes());
				        fos2.close();
				    }
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}
	
	

}
