package com.soar.cityapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import com.soar.cityapp.adapter.InformationAdapter;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//绑定Layout里面的ListView  
        ListView informationList = (ListView) findViewById(R.id.ListInformation);  
        informationList.setAdapter(new InformationAdapter(this));  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
