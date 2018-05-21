package com.mehrahangthreefree.com;


 


import java.io.IOException;


import android.media.MediaPlayer;
 
import android.os.Bundle;
import android.os.Environment;
import android.annotation.SuppressLint;
import android.app.Activity;
 
 
 
import android.webkit.WebView;
import android.widget.TextView;


 
import java.io.ByteArrayOutputStream;
 
import java.io.InputStream;
 
import java.util.Timer;
import java.util.TimerTask;


 
import android.app.ProgressDialog;
 
 
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
 
import android.media.AudioManager;
 
import android.os.AsyncTask;
 
import android.os.Handler;
import android.text.Html;
import android.view.GestureDetector;
import android.view.Gravity;
 
import android.view.View;
 
 
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.SeekBar;
 
import android.widget.Toast;

public class PageView extends Activity {
 
    
    

   	String filePath = Environment.getExternalStorageDirectory().getPath()+ "Music/intro.mp3";
   	MediaPlayer mediaPlayer;	 
   	public String strp="/audio/start.mp3";
     
   	int i=0;
	String position = "1";
	String name = "";
	String description = "";
	String audio = "start.mp3";
	String text = "";
	String iconfile = "";
	
	MediaPlayer  audio_play;

	ProgressDialog mProgressDialog;
	ScrollView Scrollview;
	LinearLayout OuterLayout;
	TextView headtxt; // for title
	MediaPlayer player;
	PopupWindow popUpPlay;
	LinearLayout layout;
	 LinearLayout   mListView;
	LayoutParams params;
	Button puPlayBtn;
	SeekBar seekbar;
	 Button bplay ;

	 int bt51_number = 0;
	 
	private boolean isStarted = true;
	public boolean isMuteSound = false;
	private int verticalScrollMax;
	private Timer scrollTimer = null;
	private TimerTask scrollerSchedule;
	private int scrollPos = 0;
	private long delay = 150;
	public double speed = 1.5;
	public float volume = 0.0f;
	
	WebView webview;
	
	private boolean isMoveingSeekBar = false;
	AudioManager am;
	private final Handler handler = new Handler();
     
	  private GestureDetector gestureDetector;

    
	@SuppressLint("NewApi")
	@Override
	public void onBackPressed() {
		 
		
		if (Classfunct.number_h<38){
	    	

			 if(Classfunct.status_play=="stop"){
				
				//onDestroy();//stop		
				bplay.setBackgroundResource(R.drawable.play_34333);
				audio_play.stop();
				Classfunct.status_play="play";
				 
			}
 
			
	
		}
		
		 
		 super.onBackPressed();
	
		
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		 
	
	setContentView(R.layout.activity_page_view);
	
//	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
	
	

//	startMediaPlay();
	
		// Get position to display
	 //	Intent getin = getIntent();

		this.position = "";
		this.name = "";
		this.description = "";
		this.audio = "start.mp3";
		this.text = "";
		this.iconfile ="";

		player = new MediaPlayer();
		
		//audio_play.reset();
		
		// Classfunct.numer_gif_pic=Classfunct.Count_hadith;
		 
		 
		
	 //	Scrollview = (ScrollView) findViewById(R.id.vertical_scrollview_id);
		   
	    if (Classfunct.NameFont=="style1" ){
	    	Classfunct.NameFont="Far_Dinar_Two_Medium";
	    			
	    }
	    else if (Classfunct.NameFont=="style2"){
	    	
	    	Classfunct.NameFont="Mj_Matin_0";
	    }
	    
         else if (Classfunct.NameFont=="style3"){
	    	
	    	Classfunct.NameFont="Mj_Shafigh 2_0";
	    }
 
          else if (Classfunct.NameFont=="style4"){
  	
         	Classfunct.NameFont="IranNastaliq";
            }
  
	    
	    
 

	    
		webview = (WebView) findViewById(R.id.webView1);

		// set image
	//	webview.loadUrl("file:///android_asset/gif.html");
		
	    
	    mListView = (LinearLayout)findViewById(R.id.parent_c2);
		
	    
	   	 if (Classfunct.number_h ==0) {
	   	   	 
	      	//  mListView.setBackgroundResource(R.drawable.a1);
	   		webview.loadUrl("file:///android_asset/gif0.html");
			
	  	  	  	
	   	 } else if (Classfunct.number_h ==1) {
	   	   	 
		   	//  mListView.setBackgroundResource(R.drawable.a2);
	   		webview.loadUrl("file:///android_asset/gif1.html");
			
	  	
		   	 } 

	     else if (Classfunct.number_h ==2) {
	   	   	 
	      	//  mListView.setBackgroundResource(R.drawable.a3);
	    		webview.loadUrl("file:///android_asset/gif2.html");
				
	  	  		
		   	 } 

	       else if (Classfunct.number_h ==3) {
			   	 
	         	//  mListView.setBackgroundResource(R.drawable.a4);
	    		webview.loadUrl("file:///android_asset/gif3.html");
				
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==4) {
			   	 
	         //	  mListView.setBackgroundResource(R.drawable.a5);
	    		webview.loadUrl("file:///android_asset/gif4.html");
				
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==5) {
			   	 
//	         	  mListView.setBackgroundResource(R.drawable.a6);
	         		webview.loadUrl("file:///android_asset/gif5.html");
	    			
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==6) {
			   	 
	         	//  mListView.setBackgroundResource(R.drawable.a7);
	    		webview.loadUrl("file:///android_asset/gif6.html");
				
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==7) {
			   	 
	         	  // mListView.setBackgroundResource(R.drawable.a8);
	         		webview.loadUrl("file:///android_asset/gif7.html");
	    			
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==8) {
			   	 
	         	 // mListView.setBackgroundResource(R.drawable.a9);
	    		webview.loadUrl("file:///android_asset/gif8.html");
				
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==9) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a10);
	         		webview.loadUrl("file:///android_asset/gif9.html");
	    			
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==10) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a11);
        		webview.loadUrl("file:///android_asset/gif10.html");

	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==11) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a12);
        		webview.loadUrl("file:///android_asset/gif11.html");

	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==12) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a13);
        		webview.loadUrl("file:///android_asset/gif12.html");

	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==13) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a14);
        		webview.loadUrl("file:///android_asset/gif13.html");

	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==14) {
			   	 
	    	   webview.loadUrl("file:///android_asset/gif14.html");
	    	   //mListView.setBackgroundResource(R.drawable.a15);
	      	  	    
	       } 
	   	 
	       else if (Classfunct.number_h ==15) {
			   	 
	         	//  mListView.setBackgroundResource(R.drawable.a16);
	    	   webview.loadUrl("file:///android_asset/gif15.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==16) {
			   	 
	         	//  mListView.setBackgroundResource(R.drawable.a17);
	    	   webview.loadUrl("file:///android_asset/gif16.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==17) {
			   	 
	    		//  mListView.setBackgroundResource(R.drawable.a17);
	    	   webview.loadUrl("file:///android_asset/gif17.html");
	    	      } 
	   	 
	       else if (Classfunct.number_h ==18) {
			   	 
	         	 // mListView.setBackgroundResource(R.drawable.a19);
	    	   webview.loadUrl("file:///android_asset/gif18.html");
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==19) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif19.html");
	    	   
	      	  	    } 
	   	 
	   	 
	   	 
	       else if (Classfunct.number_h ==20) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif20.html");
	    	   
	      	  	    } 
	   	 
	   	 
	       else if (Classfunct.number_h ==21) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif21.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==22) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif22.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==23) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif23.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==24) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif24.html");
	    	   
	      	  	    } 
	   	 
	   	 
	       else if (Classfunct.number_h ==25) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif25.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==26) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif26.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==27) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif27.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==28) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif28.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==29) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif29.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==30) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif30.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==31) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif31.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==32) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif32.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==33) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif33.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==34) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif34.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==35) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif35.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==36) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif36.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==37) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif37.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==38) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif38.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==39) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif39.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==40) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif19.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==41) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif19.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==42) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif19.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==43) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif19.html");
	    	   
	      	  	    } 
	   	 
	       else if (Classfunct.number_h ==44) {
			   	 
	         	  //mListView.setBackgroundResource(R.drawable.a20);
	    	   
	    	   webview.loadUrl("file:///android_asset/gif19.html");
	    	   
	      	  	    } 
	   	 
	  
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 

	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	    try {
	    	if (Classfunct.number_h<35 ){
	    	
		AssetFileDescriptor afd = getAssets().openFd( Classfunct.Nfolder + Classfunct.number_h  + ".mp3");
			audio_play = new MediaPlayer();
			audio_play.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
			afd.close();
	    	}
			
			
	       // InputStream is = getAssets().open( Classfunct.Nfolder   + Classfunct.number_h + ".txt");

	        // We guarantee that the available method returns the total
	        // size of the asset...  of course, this does mean that a single
	        // asset can't be more than 2 gigs.
	     //   int size = is.available();

	        // Read the entire asset into a local byte buffer.
	     //   byte[] buffer = new byte[size];
	     //   is.read(buffer);
	     //   is.close();

	        // Convert the buffer into a string.
	      //  String text1 = new String(buffer);

	        // Finally stick the string into the text view.
	        // Replace with whatever you need to have the text into.

	      //  TextView tv = (TextView)findViewById(R.id.textView1);
	      //  tv.setText(text1);
	      //  Typeface myTypeface = Typeface.createFromAsset(getAssets(),Classfunct.NameFont +".ttf");
		  //  tv.setTypeface(myTypeface);/// 1. Mj_Shafigh 2_0.ttf  , Mj_Saadi Bold_0.TTF,Far_Digital_Arabia.ttf
		    
	    } catch (IOException e) {
	        // Should never happen!
	        throw new RuntimeException(e);
	    }
	    
	   
	    
	    
		// AssetManager assetManager = getAssets();
		//    InputStream inputStream = null;
		//    try {
		 //     inputStream = assetManager.open("/0.txt");
		 //     String text = loadTextFile(inputStream);
		    //  textView.setText(text);
		  
		 //     TextView showtxt = (TextView) findViewById(R.id.textView1);
			//	showtxt.setText( text + Classfunct.number_h + " ----" + Classfunct.Nfolder  + "---"+ Classfunct.Count_hadith);
			 
	  
		
		
		//txt file
		//TextView showtxt = (TextView) findViewById(R.id.textView1);
	//	showtxt.setText(Classfunct.number_h + " ----" + Classfunct.Nfolder  + "---"+ Classfunct.Count_hadith);
		
	  


	        
	    


	      bplay = (Button)findViewById(R.id.button_play);
		bplay.setOnClickListener(new View.OnClickListener() {
 	 
			@Override
			public void onClick(View arg1) {

				 
				    	if (Classfunct.number_h <38){
 				 
					
					if (Classfunct.status_play=="play"){
						startMediaPlay();
						
						bplay.setBackgroundResource(R.drawable.stop_22_v2);

                //     for (int i=0;i<10;i++){
							
					//		startMediaPlay();
					//	 }
						
						 						
						Classfunct.status_play="stop";
						
						
					}
					
					else if(Classfunct.status_play=="stop"){
						
						//onDestroy();//stop		
						bplay.setBackgroundResource(R.drawable.pla_11_v2);
						audio_play.stop();
						Classfunct.status_play="play";
						 
					}
					
					
					

				
				    	}
			 
			}
		});
		
	 


		


		



		
 
	 
		

	    ImageButton bt41 = (ImageButton)findViewById(R.id.button_rp_1);
		bt41.setOnClickListener(new View.OnClickListener() {
			 
			@Override
			public void onClick(View arg1) {

				if(bt51_number>=0){
					
					if (bt51_number>=5){
						
						bt51_number=0;
					}
						
					bt51_number+=1;
				
				webview.loadUrl("file:///android_asset/sun/gif"+ bt51_number +".html");		
				} 
			 
			 
			}
		});
		
		
		
	 
		   ImageButton bt412 = (ImageButton)findViewById(R.id.button_rp_2);
			bt412.setOnClickListener(new View.OnClickListener() {
				 
				@Override
				public void onClick(View arg1) {

					if(bt51_number>=0){
						
						if (bt51_number>=5){
							
							bt51_number=0;
						}
							
						bt51_number+=1;
					
					webview.loadUrl("file:///android_asset/boy/gif"+ bt51_number +".html");		
					} 
				 
				 
				}
			});
			
			
			
			
			
			
			  ImageButton bt413 = (ImageButton)findViewById(R.id.button_rp_3);
				bt413.setOnClickListener(new View.OnClickListener() {
					 
					@Override
					public void onClick(View arg1) {

						if(bt51_number>=0){
							
							if (bt51_number>=9){
								
								bt51_number=0;
							}
								
							bt51_number+=1;
						
						webview.loadUrl("file:///android_asset/night/gif"+ bt51_number +".html");		
						} 
					 
					 
					}
				});
				
				
		
		
				  ImageButton bt414 = (ImageButton)findViewById(R.id.button_rp_4);
					bt414.setOnClickListener(new View.OnClickListener() {
						 
						@Override
						public void onClick(View arg1) {

							if(bt51_number>=0){
								
								if (bt51_number>=5){
									
									bt51_number=0;
								}
									
								bt51_number+=1;
							
							webview.loadUrl("file:///android_asset/cat_animal/gif"+ bt51_number +".html");		
							} 
						 
						 
						}
					});
					
					
					  ImageButton bt415 = (ImageButton)findViewById(R.id.button_rp_5);
						bt415.setOnClickListener(new View.OnClickListener() {
							 
							@Override
							public void onClick(View arg1) {

								if(bt51_number>=0){
									
									if (bt51_number>=5){
										
										bt51_number=0;
									}
										
									bt51_number+=1;
								
								webview.loadUrl("file:///android_asset/music_box/gif"+ bt51_number +".html");		
								} 
							 
							 
							}
						});
						
						

	//	Button bt52 = (Button)findViewById(R.id.button_rnd_pic);
	//	bt52.setOnClickListener(new View.OnClickListener() {
			 
 //	 Random r = new Random();

	    //	//  minimum number to generate as random number
	    //	 int minNumber = 3;

	    //	 //maximum number to generate as random number
	    //	  int maxNumber = 7;
	    //	  int randomNumber = r.nextInt((maxNumber-minNumber)+minNumber)+minNumber;
			
			//@Override
			//public void onClick(View arg1) {

			//	if(Classfunct.numer_gif_pic>=0){
					
			//		Classfunct.numer_gif_pic=randomNumber;
				 
			//		webview.loadUrl("file:///android_asset/gif"+ Classfunct.numer_gif_pic +".html");		
						    	 
			//	}
				
				
		//	}
	//	});
		
		
		
		
		//  Button bt1=(Button) findViewById(R.id.button1);
	      // bt1.setOnClickListener(new OnClickListener() {
				
			//	@Override
			//	public void onClick(View arg0) {
				 
					
					//volume = 0.95f;
				 
				 //  player.setVolume(volume, volume);
				   
				//	startMediaPlay();
					
					
				//	 Classfunct.Nfolder="";
		    	//	 Classfunct.number_h=0;
		    		 
			//	Intent next= new Intent( List1.this,List2.class);

			//	startActivity(next);
			//	}
		//	});
	       
	     //  bt1.setText(ClassFunc.nam2e);
	       
 
		
		
	}

	
	
	
		    public String loadTextFile(InputStream inputStream) throws IOException {
		        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
		        byte[] bytes = new byte[4096];
		        int len = 0;
		        while ((len = inputStream.read(bytes)) > 0)
		          byteStream.write(bytes, 0, len);
		        return new String(byteStream.toByteArray(), "UTF8");
		      }
		    
	
		    
		    
	
	
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
	//	handler.removeCallbacks(updatePositionRunnable);
		player.stop();
		player.reset();
		player.release();

		player = null;
	}

	/**
	 * Start play sound
	 */
	
	
	
	
	
	
	private void startMediaPlay() {
		
		// Play Media
		 
	
					try {

												
						
						audio_play.prepare();
						
						
						audio_play.start();
						audio_play.setLooping(true);
						
			
						
						
					} catch (IOException e) {
						e.printStackTrace();
					}
					isStarted = true;
			
	 
	}

	// update position of seekbar
	private void updatePosition() {
	//	handler.removeCallbacks(updatePositionRunnable);
		seekbar.setProgress(player.getCurrentPosition());
	//	handler.postDelayed(updatePositionRunnable, UPDATE_FREQUENCY);
	}

	/**
	 * Auto ScrollView
	 */
	public void getScrollMaxAmount() {
		int actualWidth = OuterLayout.getMeasuredHeight();
		verticalScrollMax = actualWidth;
	}

	public void startAutoScrolling() {
		if (scrollTimer == null) {
			scrollTimer = new Timer();
			final Runnable Timer_Tick = new Runnable() {
				public void run() {
					moveScrollView();
				}
			};

			if (scrollerSchedule != null) {
				scrollerSchedule.cancel();
				scrollerSchedule = null;
			}
			scrollerSchedule = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(Timer_Tick);
				}
			};

			scrollTimer.schedule(scrollerSchedule, 30, delay);
		}
	}

	public void moveScrollView() {
		scrollPos = (int) (Scrollview.getScrollY() + speed);
		if (scrollPos >= verticalScrollMax) {
			stopAutoScrolling();
			scrollPos = 0;
		}
		Scrollview.scrollTo(0, scrollPos);
	}

	public void stopAutoScrolling() {
		if (scrollTimer != null) {
			scrollTimer.cancel();
			scrollTimer = null;
		}
	}
	
	public void pauseAutoScrolling() {
		if(scrollTimer != null) {
			
		}
	}

	/**
	 * AsyncTask for load html text file
	 */
	public class LoadHtmlFileTask extends AsyncTask<String, String, String> {
		TextView showtxt = (TextView) findViewById(R.id.textView1);

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
		}

		@Override
		protected String doInBackground(String... params) {
			// Do your loading here
			AssetManager am = getApplicationContext().getAssets();
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			int i;

			try {
				InputStream is = am.open("text/" + text + ".html");
				int lenghtOfFile = is.available();

				long total = 0;
				i = is.read();
				while (i != -1) {
					total++;
					publishProgress("" + (int) ((total * 100) / lenghtOfFile));
					byteArrayOutputStream.write(i);
					i = is.read();
				}
				is.close();
			} catch (IOException ex) {
				Toast.makeText(
						getApplicationContext(),
						"Error exception:[" + text + "] [ " + ex.toString()
								+ " ]", Toast.LENGTH_LONG).show();
			}

			

			return byteArrayOutputStream.toString();
		}

		@Override
		protected void onPostExecute(String result) {
			showtxt.setText(Html.fromHtml(result));
			//showtxt.setText(result);
			mProgressDialog.dismiss();
			popUpPlay.showAtLocation(Scrollview, Gravity.CENTER, 0, 0);
			// popUpPlay.update(0,0,72,72);
		}

		@Override
		public void onProgressUpdate(String... args) {
			mProgressDialog.setProgress(Integer.parseInt(args[0]));

		}

	}

	// seek bar listener
	private SeekBar.OnSeekBarChangeListener seekBarChanged = new SeekBar.OnSeekBarChangeListener() {
		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			isMoveingSeekBar = false;
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			isMoveingSeekBar = true;
		}

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
			if (isMoveingSeekBar) {
				player.seekTo(progress);
			}
		}
	};

}// end play activity class










