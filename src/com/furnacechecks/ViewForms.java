package com.furnacechecks;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import android.app.Activity;
import android.os.Bundle;

public class ViewForms extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_viewforms);
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder builder = dbf.newDocumentBuilder();
			File formListFile = new File(getResources().getString(R.string.FormListFile));
			Document formListDoc = builder.parse(formListFile);
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
