package com.furnacechecks;

import java.io.FileOutputStream;
import java.io.IOException;

import android.app.Activity;
import android.content.Context;
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
				
				//Example of getting and setting form data
				String formTitleString = "";
				mFormTitle = (EditText) findViewById(R.id.FormTitle);
				formTitleString = mFormTitle.getText().toString();
				Long tsLong = System.currentTimeMillis()/1000;
				String ts = tsLong.toString();
				formTitleString += formTitleString + ts;
				mFormTitle.setText(formTitleString);
				
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
				String GasPresure = getResources().getString(R.string.GasPresure);
				String GP = getResources().getString(R.string.GP);
				String FilterSize = getResources().getString(R.string.FilterSize);
				String Length = getResources().getString(R.string.Length);
				String Width = getResources().getString(R.string.Width);
				String Height = getResources().getString(R.string.Height);
				
				
				/*save actions:
				 * 	 1)extract data //DONE
				 *   2)save to XML doc *Baseline code added*
				 *   3) display some screen?
				 */
				//2
				
				
				String xmlFile = "<form> <title>"+mFormTitle+"</title> <file> <IU>"+IndoorUnit+"</IU> <Make>"+Make+"</Make> <Model"+Model+"</Model> " +
						"<SerialNum>"+SerialNumber+"</SerialNum> <OU>"+OutdoorUnit+"</OU> <CORead>"+COReading+"</CORead> <Air>"+SupplyAir+
						"</Air> <FluGas>"+FluGasses+"</FluGas> <TempRise>"+TemperatureRise+"</TempRise> <InRise>"+IndoorRise+"</InRise> <OutRise>"+
						OutdoorRise+"</OutRise> <Operating>"+OperatingRange+"</Operating> <High>"+High+"</High> <Low>"+Low+"</Low> " +
						"<GasPresure>"+GasPresure+"</GasPresure> <GP>"+GP+"</GP> <FilterSize>"+FilterSize+"</FilterSize> <Length>"+Length
						+"</Length> <Width>"+Width+"</Width> <Height>"+Height+"</Heigth> </file> </form>";
				try {
					FileOutputStream fos = openFileOutput(mFormTitle + ".xml",
					        Context.MODE_APPEND | Context.MODE_WORLD_READABLE); //only a security warning. It's fine
					fos.write(xmlFile.getBytes());
					fos.close();
				
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	

}
