package com.furnacechecks;

import java.io.FileInputStream;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import org.w3c.dom.Document;
//import org.w3c.dom.NodeList;

public class ViewForms extends Activity {
	private TextView mViewOutput;
	private Button mTestButton;
	private String mOutput="test";
	
	//This method based on code from Pankaj Kumar--------------------------------------------
	private static Document convertStringToDocument(String xmlStr) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder;  
        try 
        {  
            builder = factory.newDocumentBuilder();  
            Document xmlDoc = builder.parse( new InputSource( new StringReader( xmlStr ) ) );
            xmlDoc.normalize();
            return xmlDoc;
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        return null;
    }
	//----------------------------------------------------------------------------------
	
	
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_viewforms);
		
		
		try {
			
			//^^^^^^^^the first thing we have ever done to actually get the file^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
			
			FileInputStream xmlFileInputStream = openFileInput(getResources().getString(R.string.FormListFile));
			StringBuilder xmlStringBuilder = new StringBuilder();
			int ch;
			while((ch = xmlFileInputStream.read()) != -1){
			    xmlStringBuilder.append((char)ch);
			}
			String formListString =  xmlStringBuilder.toString();
			
			//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
			
			//getting a valid xml doc from the string
			Document xmlDoc = convertStringToDocument(formListString);
			NodeList formNodes = xmlDoc.getElementsByTagName("form");
			//int counter = formNodes.getLength();
			
			
			/*
			BufferedReader br = new BufferedReader(new FileReader(formListFile));
			String line;
			StringBuilder sb = new StringBuilder();
			while((line=br.readLine())!= null){
			    sb.append(line.trim());
			}
			*/
			//XMLparser only need to check for <form> and </form>
			//SOMETHING DOWN HERE CRASHES IT
			/*
			XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
			factory.setNamespaceAware(true);
	        XmlPullParser xpp = factory.newPullParser();

	        xpp.setInput(openFileInput(getResources().getString(R.string.FormListFile)), null);
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
	        */
			//mOutput = "Test"+counter;
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
