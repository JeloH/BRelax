package com.mehrahangthreefree.com;



 

import java.io.IOException;

 
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
 

public class Classfunct {

	
	public static int ij=0;
	public static int Alarm_buttin_run=0;
	
	public static int number_h=0;
	public static int Count_hadith=0;
	public static String Nfolder="style1";
	public static String status_play="play";

	public static String status_hiden_button="hidden";

	
	public static int count_alarm=0; 
	
	public static int numer_gif_pic=3; 
	
	public static String NameFont="IranNastaliq";		 

	public static String NamePicBackPages="";
	public static String AddressTxtHadith="";
	
	public static String NamePicBackLetter="style1";
	
	public static String[] letter_hadis_page_address_Array = {
	   
	"txt/0/0.txt",
	"txt/0/1.txt", 
	"txt/0/2.txt", 
	"txt/0/3.txt", 
	"txt/0/4.txt", 
	"txt/0/5.txt", 
	"txt/0/6.txt", 
	"txt/0/7.txt", 
	"txt/0/8.txt", 
	"txt/0/9.txt", 
	"txt/0/10.txt", 
	"txt/0/11.txt", 
	"txt/0/12.txt", 
	"txt/0/13.txt", 
	"txt/0/14.txt", 
	"txt/0/15.txt", 
	"txt/0/16.txt", 
	"txt/0/17.txt", 
	"txt/0/18.txt", 
	"txt/0/19.txt", 
	"txt/0/20.txt", 
	"txt/0/21.txt",
	
	
	"txt/1/0.txt",
	"txt/1/1.txt", 
	"txt/1/2.txt", 
	"txt/1/3.txt", 
	"txt/1/4.txt", 
	"txt/1/5.txt", 
	"txt/1/6.txt", 
	"txt/1/7.txt", 
	"txt/1/8.txt", 
	"txt/1/9.txt", 
	"txt/1/10.txt", 
	"txt/1/11.txt", 
	"txt/1/12.txt", 
	"txt/1/13.txt", 
	"txt/1/14.txt", 
	"txt/1/15.txt", 
	"txt/1/16.txt", 
	"txt/1/17.txt", 
	"txt/1/18.txt", 
	
	

	"txt/2/0.txt",
	"txt/2/1.txt", 
	"txt/2/2.txt", 
	"txt/2/3.txt", 
	"txt/2/4.txt", 
	"txt/2/5.txt", 
	"txt/2/6.txt", 
	"txt/2/7.txt", 
	"txt/2/8.txt", 
	"txt/2/9.txt",
	
	

	"txt/3/0.txt",
	"txt/3/1.txt", 
	"txt/3/2.txt", 
	"txt/3/3.txt", 
	"txt/3/4.txt", 
	"txt/3/5.txt", 
	"txt/3/6.txt", 
	"txt/3/7.txt", 
	"txt/3/8.txt", 
	"txt/3/9.txt",
	"txt/3/10.txt",
	
	 
	"txt/4/0.txt",
	"txt/4/1.txt", 
	"txt/4/2.txt", 
	"txt/4/3.txt", 
	"txt/4/4.txt", 
	"txt/4/5.txt", 
	
	 
	"txt/5/0.txt",
	"txt/5/1.txt", 
	"txt/5/2.txt", 
	"txt/5/3.txt", 
	

	"txt/6/0.txt",
	"txt/6/1.txt", 
	"txt/6/2.txt", 
	"txt/6/3.txt", 
	"txt/6/4.txt", 
	"txt/6/5.txt", 
	"txt/6/6.txt", 
	"txt/6/7.txt", 
	"txt/6/8.txt", 
	"txt/6/9.txt",
	"txt/6/10.txt",
	
	"txt/7/0.txt",
	"txt/7/1.txt", 
	"txt/7/2.txt", 
	"txt/7/3.txt", 
	"txt/7/4.txt", 
	"txt/7/5.txt", 
	"txt/7/6.txt", 
	"txt/7/7.txt", 
	"txt/7/8.txt", 
	

	"txt/8/0.txt",
	"txt/8/1.txt", 
	"txt/8/2.txt", 
	"txt/8/3.txt", 
	"txt/8/4.txt", 
	"txt/8/5.txt", 
	"txt/8/6.txt", 
	"txt/8/7.txt", 
	"txt/8/8.txt", 
	

	"txt/9/0.txt",
	"txt/9/1.txt", 
	"txt/9/2.txt", 
	"txt/9/3.txt", 
	"txt/9/4.txt", 
	"txt/9/5.txt", 
	"txt/9/6.txt", 
	"txt/9/7.txt", 
	"txt/9/8.txt", 
	"txt/9/9.txt", 
	"txt/9/10.txt", 
	"txt/9/11.txt", 
	"txt/9/12.txt", 
	
	"txt/10/0.txt",
	"txt/10/1.txt", 
	"txt/10/2.txt", 
	"txt/10/3.txt", 
	"txt/10/4.txt", 
	"txt/10/5.txt", 
	"txt/10/6.txt", 
	"txt/10/7.txt" ,
	
	

	"txt/11/0.txt",
	"txt/11/1.txt", 
	"txt/11/2.txt", 
	"txt/11/3.txt", 
	"txt/11/4.txt", 
	"txt/11/5.txt", 
	"txt/11/6.txt", 
	"txt/11/7.txt", 
	"txt/11/8.txt" ,
	"txt/11/9.txt" ,
	"txt/11/10.txt" ,
	"txt/11/11.txt" ,
	"txt/11/12.txt" ,
	"txt/11/13.txt" ,
	
	


	"txt/12/0.txt",
	"txt/12/1.txt", 
	"txt/12/2.txt", 
	"txt/12/3.txt", 
	"txt/12/4.txt", 
	"txt/12/5.txt", 
	"txt/12/6.txt", 
	"txt/12/7.txt", 
	"txt/12/8.txt" ,
	"txt/12/9.txt" ,
	"txt/12/10.txt" ,
	"txt/12/11.txt" ,
 


	"txt/13/0.txt",
	"txt/13/1.txt", 
	"txt/13/2.txt", 
	"txt/13/3.txt", 
	"txt/13/4.txt", 
	"txt/13/5.txt", 
	"txt/13/6.txt", 
	"txt/13/7.txt", 
	"txt/13/8.txt" ,
	"txt/13/9.txt" ,
	"txt/13/10.txt" ,
	"txt/13/11.txt" ,
	"txt/13/12.txt" ,
	"txt/13/13.txt" ,
	"txt/13/14.txt",
	"txt/13/15.txt", 
	"txt/13/16.txt", 
	"txt/13/17.txt", 
	"txt/13/18.txt", 
	"txt/13/19.txt", 
	"txt/13/20.txt", 
	"txt/13/21.txt", 
	"txt/13/22.txt" ,
	"txt/13/23.txt" ,
	"txt/13/24.txt" ,
	"txt/13/25.txt" ,
	"txt/13/26.txt" ,
	"txt/13/27.txt" ,
	"txt/13/28.txt",
	"txt/13/29.txt", 


	"txt/14/0.txt",
	"txt/14/1.txt", 
	"txt/14/2.txt", 
	"txt/14/3.txt", 
	"txt/14/4.txt", 
	"txt/14/5.txt", 
	"txt/14/6.txt", 
	"txt/14/7.txt", 
	"txt/14/8.txt" ,
	"txt/14/9.txt" ,
	"txt/14/10.txt" ,
	"txt/14/11.txt" ,
	"txt/14/12.txt" ,
	"txt/14/13.txt" ,
	"txt/14/14.txt",
	"txt/14/15.txt", 
	"txt/14/16.txt", 
	"txt/14/17.txt", 
	"txt/14/18.txt", 
	"txt/14/19.txt", 
	"txt/14/20.txt", 
	
	

	"txt/15/0.txt",
	"txt/15/1.txt", 
	"txt/15/2.txt", 
	"txt/15/3.txt", 
	"txt/15/4.txt", 
	"txt/15/5.txt", 
	"txt/15/6.txt", 
	"txt/15/7.txt", 
	"txt/15/8.txt" ,
	"txt/15/9.txt" ,
	"txt/15/10.txt" ,
	"txt/15/11.txt" ,
	"txt/15/12.txt" ,
	"txt/15/13.txt" ,
 

	"txt/16/0.txt",
	"txt/16/1.txt", 
	"txt/16/2.txt", 
	"txt/16/3.txt", 
	"txt/16/4.txt", 
	"txt/16/5.txt", 
	"txt/16/6.txt", 
	"txt/16/7.txt", 
	"txt/16/8.txt" ,
	"txt/16/9.txt" ,
	"txt/16/10.txt" ,
	"txt/16/11.txt" ,
	"txt/16/12.txt" ,
	"txt/16/13.txt" ,
	"txt/16/14.txt",
	"txt/16/15.txt", 
	"txt/16/16.txt", 
	"txt/16/17.txt", 
	"txt/16/18.txt", 
	"txt/16/19.txt", 
	"txt/16/20.txt", 
	"txt/16/21.txt", 
	"txt/16/22.txt", 
	"txt/16/23.txt", 
	"txt/16/24.txt", 
	"txt/16/25.txt", 
	"txt/16/26.txt", 
	"txt/16/27.txt", 
	 

	"txt/17/0.txt",
	"txt/17/1.txt", 
	"txt/17/2.txt", 
	"txt/17/3.txt", 
	"txt/17/4.txt", 
	"txt/17/5.txt", 
	"txt/17/6.txt", 
	"txt/17/7.txt", 
	"txt/17/8.txt" ,
	"txt/17/9.txt" ,
	"txt/17/10.txt" ,
	"txt/17/11.txt" ,
	"txt/17/12.txt" ,
	"txt/17/13.txt" ,
	"txt/17/14.txt",
	"txt/17/15.txt", 
	"txt/17/16.txt", 
	"txt/17/17.txt", 
	"txt/17/18.txt", 
	"txt/17/19.txt", 
	"txt/17/20.txt", 
	"txt/17/21.txt", 
	"txt/17/22.txt", 
 

	"txt/18/0.txt",
	"txt/18/1.txt", 
	"txt/18/2.txt", 
	"txt/18/3.txt", 
	"txt/18/4.txt", 
	"txt/18/5.txt", 
	"txt/18/6.txt", 
	"txt/18/7.txt", 
	"txt/18/8.txt" ,
	"txt/18/9.txt" ,
	"txt/18/10.txt" ,
	"txt/18/11.txt" ,
	"txt/18/12.txt" ,
	"txt/18/13.txt" ,
	"txt/18/14.txt",
	"txt/18/15.txt", 
	"txt/18/16.txt", 
	"txt/18/17.txt", 
	"txt/18/18.txt", 
	"txt/18/19.txt", 
	"txt/18/20.txt", 
	"txt/18/21.txt", 
	"txt/18/22.txt", 
	"txt/18/23.txt", 
	"txt/18/24.txt", 
	 
	

	"txt/19/0.txt",
	"txt/19/1.txt", 
	"txt/19/2.txt", 
	"txt/19/3.txt", 
	"txt/19/4.txt", 
	"txt/19/5.txt", 
	"txt/19/6.txt", 
	"txt/19/7.txt", 
	"txt/19/8.txt" ,
	"txt/19/9.txt" ,
	"txt/19/10.txt" ,
	"txt/19/11.txt" ,
	"txt/19/12.txt" ,
	"txt/19/13.txt" ,
	"txt/19/14.txt",
	"txt/19/15.txt", 
	"txt/19/16.txt", 
	"txt/19/17.txt", 
	"txt/19/18.txt", 
	"txt/19/19.txt", 
	"txt/19/20.txt", 
	"txt/19/21.txt", 
	"txt/19/22.txt", 
 
	 

	"txt/20/0.txt",
	"txt/20/1.txt", 
	"txt/20/2.txt", 
	"txt/20/3.txt", 
	"txt/20/4.txt", 
	"txt/20/5.txt", 
	"txt/20/6.txt", 
	"txt/20/7.txt", 
	"txt/20/8.txt" ,
	"txt/20/9.txt" ,
	"txt/20/10.txt" ,
	"txt/20/11.txt" ,
	"txt/20/12.txt" ,
	"txt/20/13.txt" ,
	"txt/20/14.txt",
	"txt/20/15.txt", 
	"txt/20/16.txt", 
	"txt/20/17.txt", 
	"txt/20/18.txt", 
	"txt/20/19.txt", 
	"txt/20/20.txt", 
	"txt/20/21.txt", 
	"txt/20/22.txt", 
	"txt/20/23.txt", 
	"txt/20/24.txt", 
	 
	 
	

	"txt/21/0.txt",
	"txt/21/1.txt", 
	"txt/21/2.txt", 
	"txt/21/3.txt", 
	"txt/21/4.txt", 
	"txt/21/5.txt", 
	"txt/21/6.txt", 
	"txt/21/7.txt", 
	"txt/21/8.txt" ,
	"txt/21/9.txt" ,
 

	"txt/22/0.txt",
	"txt/22/1.txt", 
	"txt/22/2.txt", 
	"txt/22/3.txt", 
	"txt/22/4.txt", 
	"txt/22/5.txt", 
	"txt/22/6.txt", 
	"txt/22/7.txt", 
	"txt/22/8.txt" ,
	"txt/22/9.txt" ,
	"txt/22/10.txt" ,
	"txt/22/11.txt" ,
	"txt/22/12.txt" ,
 

	"txt/23/0.txt",
	"txt/23/1.txt", 
	"txt/23/2.txt", 
	"txt/23/3.txt", 
	"txt/23/4.txt", 
	"txt/23/5.txt", 
	"txt/23/6.txt", 
	"txt/23/7.txt", 
	"txt/23/8.txt" ,
	"txt/23/9.txt" ,
	"txt/23/10.txt" ,
	"txt/23/11.txt" ,
	"txt/23/12.txt" ,
	"txt/23/13.txt" ,
	"txt/23/14.txt",
	"txt/23/15.txt", 
	"txt/23/16.txt", 
	"txt/23/17.txt", 
	"txt/23/18.txt", 
	"txt/23/19.txt", 
	"txt/23/20.txt", 
	"txt/23/21.txt", 
	"txt/23/22.txt", 
	"txt/23/23.txt", 
 
	 
	"txt/00/0.txt",
	"txt/00/1.txt", 
	"txt/00/2.txt", 
	"txt/00/3.txt", 
	"txt/00/4.txt", 
	"txt/00/5.txt", 
	"txt/00/6.txt", 
	"txt/00/7.txt", 
	"txt/00/8.txt" ,
	"txt/00/9.txt" ,
	"txt/00/10.txt" ,
	"txt/00/11.txt" ,
	"txt/00/12.txt" ,
	"txt/00/13.txt" ,
	"txt/00/14.txt",
	"txt/00/15.txt", 
	"txt/00/16.txt", 
	"txt/00/17.txt", 
	"txt/00/18.txt", 
	"txt/00/19.txt", 
	"txt/00/20.txt", 
	"txt/00/21.txt", 
	"txt/00/22.txt" ,
	"txt/00/23.txt" ,
	"txt/00/24.txt" ,
	"txt/00/25.txt" ,
	"txt/00/26.txt" ,
	"txt/00/27.txt" ,
	"txt/00/28.txt",
	"txt/00/29.txt", 
	"txt/00/30.txt", 
	"txt/00/31.txt", 
	"txt/00/32.txt" ,
	"txt/00/33.txt" ,
	"txt/00/34.txt" ,
	"txt/00/35.txt" ,
	"txt/00/36.txt" ,
	"txt/00/37.txt" ,
	"txt/00/38.txt",
	"txt/00/39.txt", 
	
	
	};
	
 
	 
	static String f_str="";
	
	
	public static String sd(String str){
	
		
				
		for	(int i=0; i<32;i++){
			
	 
		
		if  (letter_hadis_page_address_Array[i]== str){
			
			    // "some string with -Click 2U - Files in it";
			 str = str.replace("txt/0/", " موضوغ اول ");
			 str = str.replace("txt/1/", " موضوغ دوم ");
		 	   
			 str = str.replace("0.txt", " حدیث اول ");
			 str = str.replace("1.txt", " حدیث دوم ");
			 str = str.replace("2.txt", " حدیث سوم ");
			 str = str.replace("3.txt", " حدیث چهارم ");
			 str = str.replace("4.txt", " حدیث پنجم ");
			 str = str.replace("5.txt", " حدیث ششم ");
			 str = str.replace("6.txt", " حدیث هفتم ");
			 str = str.replace("7.txt", " حدیث هشتم ");
			 str = str.replace("8.txt", " حدیث نهم ");
			 str = str.replace("9.txt", " حدیث دهم ");
			 f_str=str;
			 
		}	
		
	

 	}
 
	
		return Classfunct.f_str;
	}
	
	 
	
	
	
	
	
	public void startMediaPlay(AssetFileDescriptor afd) {
		
 
					try {

						
						MediaPlayer	audio_play = new MediaPlayer();
						audio_play.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
						afd.close();
											
						
						audio_play.prepare();
						audio_play.start();
			
						
						
					} catch (IOException e) {
						e.printStackTrace();
					}
					//isStarted = true;
	 
	}
	
}





 

 