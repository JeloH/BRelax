package com.mehrahangthreefree.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;


public class AbutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_abut);
		
		TextView tv = (TextView)findViewById(R.id.txt1);
		tv.setText(Html.fromHtml(getText()));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	//	getMenuInflater().inflate(R.menu.about, menu);
		return true;
	}
	
	
	
	
	
	private String getText() {
		StringBuilder sb =new StringBuilder(300);
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					getAssets().open("About.txt")));
			String l;
			while((l = br.readLine()) != null) {
				sb.append(l);
			}			
		} catch (IOException e) {
			sb.append("-----");
		}
		


		
		return sb.toString();
	}

	

}

