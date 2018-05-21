package com.mehrahangthreefree.com;



import android.os.Bundle;
 
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
 
import android.view.Menu;
import android.widget.Button;
import android.widget.LinearLayout;

  
 
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;



public class SetBakActivity extends Activity {


LinearLayout mListView;

Typeface myTypeface;
 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selctbackg_them);
		
		
		
		  myTypeface = Typeface.createFromAsset(getAssets(),"Far_Casablanca.ttf");
		  
		  
        mListView = (LinearLayout)findViewById(R.id.parent1_b);
        
		
        if (Classfunct.NamePicBackPages =="style1") {
	   	   	 
  	   	  mListView.setBackgroundResource(R.drawable.ggg0000);
  	    	
  	   	 } else if (Classfunct.NamePicBackPages =="style2") {
  	   	   	 
  	   	  mListView.setBackgroundResource(R.drawable.fffr54_v3);
  	    	
  	   	 } else if (Classfunct.NamePicBackPages =="style3") {
  	   	   	 
  	   	  mListView.setBackgroundResource(R.drawable.fffr54_v777);
  	    	
  	   	 } 
		
  	   else if (Classfunct.NamePicBackPages =="style4") {
	   	   	 
   	   	  mListView.setBackgroundResource(R.drawable.fffr54_v888);
   	   	 } 
 		
 		
		
		
		
		


		Button b1 = (Button)findViewById(R.id.bstyle1_list_button);
		  b1.setTypeface(myTypeface);
		b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg3) {
				
				//MainMenuActivity.this.finish();
				Classfunct.NamePicBackPages="style1";
				Classfunct.NamePicBackLetter="style1";
				
				
				Toast.makeText(SetBakActivity.this, "تنظیمات برای سبک یک به عنوان پیش زمینه انجام شد", Toast.LENGTH_SHORT).show();
						
			 
				
				
			//	Intent intent = new Intent(SettiActivity.this, MainMenuActivity.class);
				//intent.putExtra(BoardActivity.USER_NAME_ID, username_et.getText().toString());
			//	startActivity(intent);
			
				//intent.putExtra(BoardActivity.USER_NAME_ID, username_et.getText().toString());
				//startActivity(intent);
				//storeUserName(username);
			}
		});
		
		
		

		Button b2 = (Button)findViewById(R.id.bstyle3_list_button);
		  b2.setTypeface(myTypeface);
		b2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg3) {
				
				//MainMenuActivity.this.finish();
				Classfunct.NamePicBackPages="style2";
				Classfunct.NamePicBackLetter="style2";
				
				Toast.makeText(SetBakActivity.this, "تنظیمات برای سبک سه به عنوان پیش زمینه انجام شد", Toast.LENGTH_SHORT).show();
						
			//	Intent intent = new Intent(SettiActivity.this, MainMenuActivity.class);
				//intent.putExtra(BoardActivity.USER_NAME_ID, username_et.getText().toString());
				//startActivity(intent);
			 
				//intent.putExtra(BoardActivity.USER_NAME_ID, username_et.getText().toString());
				//startActivity(intent);
				//storeUserName(username);
			}
		});
		
		
 
		 
		
		
		
		
		
		
	}

 

}






