package com.mehrahangthreefree.com;



import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;


public class SplashWelActivity extends Activity {
    
	
	private final int SPLASH_DISPLAY_LENGTH = 2000;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_wel);
		 
	        /* New Handler to start the Menu-Activity 
	         * and close this Splash-Screen after some seconds.*/
	        new Handler().postDelayed(new Runnable(){
	            @Override
	            public void run() {
	                /* Create an Intent that will start the Menu-Activity. */
	                Intent mainIntent = new Intent(SplashWelActivity.this,Main_runpage_Activity.class);
	                SplashWelActivity.this.startActivity(mainIntent);
	                SplashWelActivity.this.finish();
	            }
	        }, SPLASH_DISPLAY_LENGTH);
	        
	}

 

}













