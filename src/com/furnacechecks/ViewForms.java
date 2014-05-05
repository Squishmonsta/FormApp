package com.furnacechecks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;

//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;

//import org.w3c.dom.Document;
//import org.w3c.dom.NodeList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

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
		
		//DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			/*
			DocumentBuilder builder = dbf.newDocumentBuilder();
			//File formListFile = new File("formList.xml");
			File formListFile = new File(getResources().getString(R.string.FormListFile));
			
			//The following line crashes it!! :(
			Document formListDoc = builder.parse(formListFile);
			
			formListDoc.normalize();
			NodeList formNodes = formListDoc.getElementsByTagName("form");
			
			int counter = 0;
			for(int i=0; i< formNodes.getLength(); i++){
				counter++;
			}
			*/
			File formListFile = new File(getResources().getString(R.string.FormListFile));
			
			//converts the xml files to a one line string
			BufferedReader br = new BufferedReader(new FileReader(formListFile));
			String line;
			StringBuilder sb = new StringBuilder();
			while((line=br.readLine())!= null){
			    sb.append(line.trim());
			}
			//XMLparser only need to check for <form> and </form>
			XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
	         factory.setNamespaceAware(true);
	         XmlPullParser xpp = factory.newPullParser();

	         xpp.setInput(new StringReader(line));
	         int eventType = xpp.getEventType();
	         int counter = 0;
	         while (eventType != XmlPullParser.END_DOCUMENT) {
	          if(eventType == XmlPullParser.START_TAG) {
	        	  if (xpp.getAttributeName(eventType).equalsIgnoreCase("form")) {
		              counter++;
	        	  }
	          }
	          eventType = xpp.next();
	         }
	         br.close();
			
			mOutput = "Test"+counter;
			//mOutput = "TEST";
			
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
		
		//String formId = "blah"; //TODO Need to access the onclick variable to extract the correct form
		//String xml = "";
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
