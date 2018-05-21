package com.mehrahangthreefree.com;

 


import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
 
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

@SuppressLint("NewApi")
public class Main_runpage_Activity extends Activity {

	// Debug tag, for logging
	static final String TAG = "";

	// SKUs for our products: the premium upgrade (non-consumable)
	static final String SKU_PREMIUM = "";

	// Does the user have the premium upgrade?
	boolean mIsPremium = false;

	// (arbitrary) request code for the purchase flow
	 
	
	LinearLayout mListView;
	 Typeface myTypeface;
 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_runpage_);
		

		

      //  mListView = (LinearLayout)findViewById(R.id.parent_l2);
		
		 
     //   if (Classfunct.NamePicBackPages =="style1") {
	   	   	 
  	 //  	  mListView.setBackgroundResource(R.drawable.fffr54_v3);
  	    	
  	 //  	 } else if (Classfunct.NamePicBackPages =="style2") {
  	   	   	 
  	  // 	  mListView.setBackgroundResource(R.drawable.fffr54_v5);
  	    	
  	   //	 } else if (Classfunct.NamePicBackPages =="style3") {
  	   	   	 
  	   //	  mListView.setBackgroundResource(R.drawable.fffr54_v777);
  	    	
  	   //	  } 
		
  	//   else if (Classfunct.NamePicBackPages =="style4") {
	   	   	 
   	   //	  mListView.setBackgroundResource(R.drawable.fffr54_v888);
   	  // 	 } 
 		
	
        
        
		//TextView showtxt = (TextView) findViewById(R.id.textView1);
		//	showtxt.setText(Classfunct.number_h + " ----" + Classfunct.Nfolder  + "---"+ Classfunct.Count_hadith);
			
			
	    //  TextView tv = (TextView)findViewById(R.id.textView1);
	      //  tv.setText(text1);
	          myTypeface = Typeface.createFromAsset(getAssets(),"Far_Casablanca.ttf");
		  // 1. Mj_Shafigh 2_0.ttf  , Mj_Saadi Bold_0.TTF,Far_Digital_Arabia.ttf
		
		
		 
		//username_et = (EditText) findViewById(R.id.user_name_et);
		Button b = (Button)findViewById(R.id.game_list_button);
		  b.setTypeface(myTypeface);
		  
		b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//String username = username_et.getText().toString();
				
				
				
				Classfunct.number_h = 0;
				Intent intent = new Intent(Main_runpage_Activity.this, ListName.class);
			//	intent.putExtra(BoardActivity.USER_NAME_ID, username_et.getText().toString());
				startActivity(intent);	
				//storeUserName(username);
			}
		});
		
		
		Button b3 = (Button)findViewById(R.id.button1);
		  b3.setTypeface(myTypeface);
		b3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg1) {
				Intent intent = new Intent(Main_runpage_Activity.this, AbutActivity.class);
				//intent.putExtra(BoardActivity.USER_NAME_ID, username_et.getText().toString());
				startActivity(intent);
				//storeUserName(username);
			}
		});
		


		
		
		
		Button b55 = (Button)findViewById(R.id.setting_list_button_backGr);
		  b55.setTypeface(myTypeface);
		b55.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg1) {
				Intent intent = new Intent(Main_runpage_Activity.this, SetBakActivity.class);
				//intent.putExtra(BoardActivity.USER_NAME_ID, username_et.getText().toString());
				startActivity(intent);
				//storeUserName(username);
			}
		});
		
	 
		Button b93 = (Button)findViewById(R.id.button2);
		  b93.setTypeface(myTypeface);
		b93.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg1) {

			  //  finishAffinity();
			      finish();
				
			}
		});
		
	 
	 
		
		
		
		
		
		
	}




}



















 