package com.furnacechecks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;

public class ViewForms extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_viewforms);
		
		//TODO: Open resource folder where forms are kept and display list of available forms
		
		String formId = "blah"; //Need to access the onclick variable to extract the correct form
		
		try {
		    BufferedReader inputReader = new BufferedReader(new InputStreamReader(
		            openFileInput(formId + ".xml")));
		    String inputString;
		    StringBuffer stringBuffer = new StringBuffer();                
		    while ((inputString = inputReader.readLine()) != null) {
		        stringBuffer.append(inputString + "\n");
		    }
			lblTextViewOne.setText(stringBuffer.toString());
		} catch (IOException e) {
		    e.printStackTrace();
		}
		}
	}
