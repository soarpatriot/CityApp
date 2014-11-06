package com.soar.cityapp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.view.Menu;
import android.widget.ListView;

import com.soar.cityapp.adapter.InformationAdapter;

public class MainActivity extends Activity implements OnRefreshListener {
      
	//SwipeRefreshLayout swipeLayout; 
	@Override  
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*swipeLayout = (SwipeRefreshLayout) findViewById(R.id.info_scroll);
        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorScheme(android.R.color.holo_blue_bright, 
        		android.R.color.holo_green_light, 
        		android.R.color.holo_orange_light, 
        		android.R.color.holo_red_light);*/
		//绑定Layout里面的ListView  
        ListView informationList = (ListView) findViewById(R.id.ListInformation);  
        informationList.setAdapter(new InformationAdapter(this));  
	}
    
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items @Override
		 getMenuInflater().inflate(R.menu.main, menu);
		 return true;
	}
	@Override
	public void onRefresh() {
	     // TODO Auto-generated method stub
	     /*new Handler().postDelayed(new Runnable() {
	         @Override public void run() {
	             swipeLayout.setRefreshing(false);
	         }
	     }, 5000);*/
    }

}
