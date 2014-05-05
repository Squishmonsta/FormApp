package com.furnacechecks;

import java.io.FileOutputStream;
import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewForm extends Activity {
	
	private Button msaveButton;
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
				
				
				String formTitleString = "";
				//Gets form title entered by user
				mFormTitle = (EditText) findViewById(R.id.FormTitle);
				formTitleString = mFormTitle.getText().toString();
				Long tsLong = System.currentTimeMillis()/1000;
				String ts = tsLong.toString();
				//appends time stamp to title (unique every 1 second)
				formTitleString += ts;
				mFormTitle.setText(formTitleString);
				String xmlFileName = formTitleString + ".xml";
				
				String IndoorUnit = getResources().getString(R.string.IndoorUnit);
				String Make = getResources().getString(R.string.Make);
				String Model = getResources().getString(R.string.Model);
				String SerialNumber = getResources().getString(R.string.SerialNumber);
				String OutdoorUnit = getResources().getString(R.string.OutdoorUnit);
				String COReading = getResources().getString(R.string.COReading);
				String SupplyAir = getResources().getString(R.string.SupplyAir);
				String FluGasses = getResources().getString(R.string.FluGasses);
				String TemperatureRise = getResources().getString(R.string.TemperatureRise);
				String IndoorRise = getResources().getString(R.string.IndoorRise);
				String OutdoorRise = getResources().getString(R.string.OutdoorRise);
				String OperatingRange = getResources().getString(R.string.OperatingRange);
				String High = getResources().getString(R.string.High);
				String Low = getResources().getString(R.string.Low);
				String GasPresure = getResources().getString(R.string.GasPressure);
				String GP = getResources().getString(R.string.GP);
				String FilterSize = getResources().getString(R.string.FilterSize);
				String Length = getResources().getString(R.string.Length);
				String Width = getResources().getString(R.string.Width);
				String Height = getResources().getString(R.string.Height);
				
				EditText EindoorMake = (EditText)findViewById(R.id.IndoorMake);
				String indoorMake = EindoorMake.getText().toString();
				
				EditText EindoorModel = (EditText)findViewById(R.id.IndoorModel);
				String indoorModel = EindoorModel.getText().toString();
				
				EditText EindoorSerial = (EditText)findViewById(R.id.IndoorSerial);
				String indoorSerial = EindoorSerial.getText().toString();
				
				EditText EoutdoorMake = (EditText)findViewById(R.id.OutdoorMake);
				String outdoorMake = EoutdoorMake.getText().toString();
				
				EditText EoutdoorModel = (EditText)findViewById(R.id.OutdoorModel);
				String outdoorModel = EoutdoorModel.getText().toString();
				
				EditText EoutdoorSerial = (EditText)findViewById(R.id.OutdoorSerial);
				String outdoorSerial = EoutdoorSerial.getText().toString();
				
				EditText EsupplyAir = (EditText)findViewById(R.id.SupplyAir);
				String supplyAir = EsupplyAir.getText().toString();
				
				EditText EfluGasses = (EditText)findViewById(R.id.FluGasses);
				String fluGasses = EfluGasses.getText().toString();
				
				EditText EindoorTempRise = (EditText)findViewById(R.id.IndoorTempRise);
				String indoorTempRise = EindoorTempRise.getText().toString();
				
				EditText EoutdoorTempRise = (EditText)findViewById(R.id.OutdoorTempRise);
				String outdoorTempRise = EoutdoorTempRise.getText().toString();
				
				EditText EindoorHigh = (EditText)findViewById(R.id.IndoorHigh);
				String indoorHigh = EindoorHigh.getText().toString();
				
				EditText EindoorLow = (EditText)findViewById(R.id.IndoorLow);
				String indoorLow = EindoorLow.getText().toString();
				
				EditText EoutdoorHigh = (EditText)findViewById(R.id.OutdoorHigh);
				String outdoorHigh = EoutdoorHigh.getText().toString();
				
				EditText EoutdoorLow = (EditText)findViewById(R.id.OutdoorLow);
				String outdoorLow = EoutdoorLow.getText().toString();
				
				EditText EgasPressure = (EditText)findViewById(R.id.GasPressure);
				String gasPressure = EgasPressure.getText().toString();
				
				EditText EfilterLength = (EditText)findViewById(R.id.FilterLength);
				String filterLength = EfilterLength.getText().toString();
				
				EditText EfilterWidth = (EditText)findViewById(R.id.FilterWidth);
				String filterWidth = EfilterWidth.getText().toString();
				
				EditText EfilterHeight = (EditText)findViewById(R.id.FilterHeight);
				String filterHeight = EfilterHeight.getText().toString();
				
				
				
				
				
				
				
				/*save actions:
				 * 	 1)extract data
				 *   2)save to XML doc
				 *   3) display some screen?
				 */
				//2
				
				
				String xmlFile = "<form> <title>"+formTitleString+"</title> \n"
						+ "<indoorMake>"+indoorMake+"</indoorMake> <indoorModel>"+indoorModel+"</indoorModel> " +
						"<indoorSerial>"+indoorSerial+"</indoorSerial> \n"
						+ "<outdoorMake>"+outdoorMake+"</outdoorMake> <outdoorModel>"+outdoorModel+"</outdoorModel> " +
						"<outdoorSerial>"+outdoorSerial+"</outdoorSerial> \n"
						+"<supplyAir>"+supplyAir +"</supplyAir><fluGasses>"+fluGasses+"</fluGasses>\n"
						+ "</indoorTempRise>"+indoorTempRise+"</indoorTempRise> <outdoorTempRise>"+
						outdoorTempRise+"</outdoorTempRise>\n"
						+ "<indoorHigh>"+indoorHigh+"</indoorHigh> <indoorLow>"+indoorLow+"</indoorLow> " +
						"<outdoorHigh>"+outdoorHigh+"</outdoorHigh> <outdoorLow>"+outdoorLow+"</outdoorLow> \n"
						+"<gasPressure>"+gasPressure+"</gasPressure>\n"
						+ "<filterLength>"+filterLength+"</filterLength> <filterWidth>"+filterWidth+"</filterWidth>"
						+ "<filterHeight>"+filterHeight+"</filterHeight> </form>";
				
				try {
					//File created under /data/data/[package name]/files/
					FileOutputStream outputStream = openFileOutput(xmlFileName,
					        Context.MODE_APPEND | Context.MODE_WORLD_READABLE); //only a security warning. It's fine
					outputStream.write(xmlFile.getBytes());
					outputStream.flush();
					outputStream.close();
				
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				//3 - Go back to main screen (avoids appending on two timestamps)
				startActivity(new Intent(getApplicationContext(), MainActivity.class));
				
				
			}
		});
		
	}
	
	

}
