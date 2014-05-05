package com.furnacechecks;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ViewForms extends Activity {
	private TextView mViewOutput;
	private Button mTestButton;
	private String mOutput;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_viewforms);
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			
			DocumentBuilder builder = dbf.newDocumentBuilder();
			File formListFile = new File("formList.xml");
			//File formListFile = new File(getResources().getString(R.string.FormListFile));
			
			//The following line crashes it!! :(
			Document formListDoc = builder.parse(formListFile);
			/*
			formListDoc.normalize();
			NodeList formNodes = formListDoc.getElementsByTagName("form");
			int counter = 0;
			for(int i=0; i< formNodes.getLength(); i++){
				counter++;
			}
			
			mOutput = "Test"+counter;
			*/
			mOutput = "TEST";
			
			mViewOutput = (TextView) findViewById(R.id.viewOutputText);
			mTestButton = (Button) findViewById(R.id.testButton);
			mTestButton.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					mViewOutput.setText(mOutput);
					
				}
			});
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		//TODO: Open resource folder where forms are kept and display list of available forms
		
		String formId = "blah"; //TODO Need to access the onclick variable to extract the correct form
		String xml = "";
		/*
		try {
		    BufferedReader inputReader = new BufferedReader(new InputStreamReader(
		            openFileInput(formId + ".xml")));
		    String inputString;
		    StringBuffer stringBuffer = new StringBuffer();                
		    while ((inputString = inputReader.readLine()) != null) {
		        stringBuffer.append(inputString + "\n");
		    }
			xml = stringBuffer.toString();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		*/
		
		}
		
	}
