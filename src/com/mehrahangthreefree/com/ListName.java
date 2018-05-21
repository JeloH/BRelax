
package com.mehrahangthreefree.com;


 
import com.hmdahadisclassify.util.Dynamics;


 
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Test activity to display the list view
 */
public class ListName extends Activity {

    /** Id for the toggle rotation menu item */
    private static final int TOGGLE_ROTATION_MENU_ITEM = 0;

    /** Id for the toggle lighting menu item */
    private static final int TOGGLE_LIGHTING_MENU_ITEM = 1;

    static Typeface myTypeface;
    
    /** The list view */
    private MyListView mListView;

    /**
     * Small class that represents a contact
     */
    private static class Contact {

        /** Name of the contact */
        String mName;

        /** Phone number of the contact */
        String mNumber;

        /**
         * Constructor
         * 
         * @param name The name
         * @param number The number
         */
        public Contact(final String name, final String number) {
            mName = name;
            mNumber = number;
        }

    }

    
    
    
    
    public void config_listitemHad(){
   	 
    	
   	 if (Classfunct.number_h == 0) {
   	 
   		Classfunct.Count_hadith=30;
   		Classfunct.Nfolder="txt/0/";
  		 
   	 

     	
   		
   	 } 

   	 
   	
   }
    
    
    public void alertOneButton() {

    	 new AlertDialog.Builder(ListName.this)
         .setTitle("دریافت نسخه ی اصلی")
         .setMessage("برای دریافت نسخه ی اصلی این نرم افزار دکمه تایید را کلیک کنید")
         //.setIcon(R.drawable.ninja)
         .setPositiveButton("تایید",
                 new DialogInterface.OnClickListener() {
                  //   @TargetApi(11)
                     public void onClick(DialogInterface dialog, int id) {
                       //  showToast("Thank you! You're awesome too!");
                       //  dialog.cancel();
                         
                         Intent webPageIntent = new Intent(Intent.ACTION_VIEW);
                     	webPageIntent.setData(Uri.parse("https://cafebazaar.ir/app/com.mehrahangthree.com/?l=fa"));

                     	try { 
                     	          startActivity(webPageIntent);
                     	} catch (ActivityNotFoundException ex) { 
                     	// can do something about the exception. 
                     	}
                     	
                     	
                     }
                 })
         .setNegativeButton("خیر", new DialogInterface.OnClickListener() {
         //    @TargetApi(11)
             public void onClick(DialogInterface dialog, int id) {
      //           showToast("Mike is not awesome for you. :(");
                 dialog.cancel();
             }
         }).show();
    	 
    	 


    }

    
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
  
    
        config_listitemHad();

        final ArrayList<Contact> contacts = createContactList(Classfunct.Count_hadith);
        final MyAdapter adapter = new MyAdapter(this, contacts);

        mListView = (MyListView)findViewById(R.id.my_list);
        mListView.setAdapter(adapter);

        mListView.setDynamics(new SimpleDynamics(0.9f, 0.6f));

        
   	 if (Classfunct.NamePicBackPages =="style1") {
   	   	 
   	 // mListView.setBackgroundResource(R.drawable.fffr54_v5);
    	
   	 } else if (Classfunct.NamePicBackPages =="style2") {
   	   	 
   	  mListView.setBackgroundResource(R.drawable.fffr54_v3);
    	
   	 } else if (Classfunct.NamePicBackPages =="style3") {
   	   	 
   	  mListView.setBackgroundResource(R.drawable.fffr54_v8);
    	
   	 } 
        
     myTypeface = Typeface.createFromAsset(getAssets(), "Far_Casablanca.ttf");
        
        mListView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(final AdapterView<?> parent, final View view,
                    final int position, final long id) {
            	
             
            	
             	
             	if (id>=5){
            		
           	  //   Toast.makeText(ListName_sovti.this, "برای فعال سازی این بخش و دریافت نسخه ی اصلی دکمه ی یسییسیسیس را کلید کنید.", Toast.LENGTH_SHORT).show();
           
           	    alertOneButton() ;
           	    
           	}
           	
           	else if  (id<5)
           	{

    	    	Intent intent = new Intent(ListName.this, PageView.class);
				//intent.putExtra(BoardActivity.USER_NAME_ID, username_et.getText().toString());
				startActivity(intent);
				
            //    final String message = "On1111Click: "  + Classfunct.Count_hadith + "--" + contacts.get(position).mName;
             //   Toast.makeText(ListName.this, message, Toast.LENGTH_SHORT).show();
                
                Classfunct.number_h= position;
    		    
				
           	}
             	
            
              
              // config_listitemHad();
            }
        });

         
 
   
     //   throw new IllegalStateException("something went wrong");

      //  config_listitemHad();
        
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        menu.add(Menu.NONE, TOGGLE_ROTATION_MENU_ITEM, 0, "تغییر چرخش");
        menu.add(Menu.NONE, TOGGLE_LIGHTING_MENU_ITEM, 1, "روشنایی لیست");
        return true;
    }

    
 
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case TOGGLE_ROTATION_MENU_ITEM:
                mListView.enableRotation(!mListView.isRotationEnabled());
                return true;

            case TOGGLE_LIGHTING_MENU_ITEM:
                mListView.enableLight(!mListView.isLightEnabled());
                return true;

            default:
                return false;
        }
    }

    
	

	
    /**
     * Creates a list of fake contacts
     * 
     * @param size How many contacts to create
     * @return A list of fake contacts
     */
    private ArrayList<Contact> createContactList(final int size) {
    	
        final ArrayList<Contact> contacts = new ArrayList<Contact>();
        for (int i = 0; i < size; i++) {
            contacts.add(new Contact("حدیث اول" + i + Classfunct.number_h, " "
                    + (int)(1000000 + 9000000 * Math.random())));
        }
        return contacts;
    }

    /**
     * Adapter class to use for the list
     */
    private static class MyAdapter extends ArrayAdapter<Contact> {

        /** Re-usable contact image drawable */
        private final Drawable contactImage;

        /**
         * Constructor
         * 
         * @param context The context
         * @param contacts The list of contacts
         */
        public MyAdapter(final Context context, final ArrayList<Contact> contacts) {
            super(context, 0, contacts);
            contactImage = context.getResources().getDrawable(R.drawable.contact_image);
        }

        
       
        
        
        
        @Override
        public View getView(final int position, final View convertView, final ViewGroup parent) {
            View view = convertView;
            if (view == null) {
                view = LayoutInflater.from(getContext()).inflate(R.layout.list_item2, null);
            }



            final TextView name = (TextView)view.findViewById(R.id.contact_name);
         
		     name.setTypeface(myTypeface);
            
            if (position == 0) {
                name.setText("لالایی - شب آبی");
            } 
         
            else if (position == 1) {
                name.setText("لالایی - بنفش کمرنک");
            }
            else if (position == 2) {
                name.setText("آرام و آرامش ");
            }
            else if (position == 3) {
                name.setText("لبخند -جرنگ جرنگ");
            }
            else if (position == 4) {
                name.setText("جعبه موسیقی -آرامش  عزیز - یک");
            }
            else if (position == 5) {
                name.setText("جعبه موسیقی -آرامش  عزیز - دو");
            }
            else if (position == 6) {
                name.setText("جعبه موسیقی -آرامش  عزیز - سه ");
            }
            else if (position == 7) {
                name.setText("جعبه موسیقی -آرامش  عزیز - چهار");
            }
            else if (position == 8) {
                name.setText("جعبه موسیقی -آرامش  عزیز - پنجم ");
            }
            else if (position == 9) {
                name.setText("جعبه موسیقی -آرامش  عزیز - ششم");
            }
            else if (position == 10) {
                name.setText("جعبه موسیقی -آرامش  عزیز - هفتم ");
            }
            else if (position == 11) {
                name.setText("جعبه موسیقی -آرامش  عزیز - هشتم");
            }
            else if (position == 12) {
                name.setText("جعبه موسیقی -آرامش  عزیز - نهم");
            }
            else if (position == 13) {
                name.setText("جعبه موسیقی -آرامش  عزیز - دهم");
            }
            else if (position == 14) {
                name.setText("جعبه موسیقی -آرامش  عزیز - یازدهم");
            }
            else if (position == 15) {
                name.setText("جعبه موسیقی -آرامش  و لبخند - یک");
            }
            else if (position == 16) {
                name.setText("جعبه موسیقی -آرامش  و لبخند - دو");
            }
            else if (position == 17) {
                name.setText("جعبه موسیقی -آرامش  و لبخند - سه");
            }
            else if (position == 18) {
                name.setText("جعبه موسیقی -آرامش  و لبخند - چهار");
            }
            else if (position == 19) {
                name.setText("وقت خواب - لالایی - یک");
            }
            else if (position == 20) {
                name.setText("وقت خواب - لالایی - دو");
            }
           
            
            else if (position == 21) {
                name.setText("وقت خواب - لالایی - سه");
            }

            else if (position == 22) {
                name.setText("وقت خواب - لالایی - چهار");
            }
            
            else if (position == 23) {
                name.setText("وقت خواب - لالایی - پنجم");
            }
            

            else if (position == 24) {
                name.setText("آرام و آرامش - یک");
            }
            

            else if (position == 25) {
                name.setText("آرام و آرامش - دو");
            }
            

            else if (position == 26) {
                name.setText("آرام و آرامش - سه");
            }
            

            else if (position == 27) {
                name.setText(" نسیم مهربانی - یک");
            }
            

            else if (position == 28) {
                name.setText(" نسیم مهربانی- دو");
            }
            

            else if (position == 29) {
                name.setText(" نسیم مهربانی - سه");
            }
            
 
            
            
            
          

        //    final TextView number = (TextView)view.findViewById(R.id.contact_number);
          //  number.setText(getItem(position).mNumber);

            final ImageView photo = (ImageView)view.findViewById(R.id.contact_photo);
            photo.setImageDrawable(contactImage);

            return view;
        }
    }

    /**
     * A very simple dynamics implementation with spring-like behavior
     */
    class SimpleDynamics extends Dynamics {

        /** The friction factor */
        private float mFrictionFactor;

        /** The snap to factor */
        private float mSnapToFactor;

        /**
         * Creates a SimpleDynamics object
         * 
         * @param frictionFactor The friction factor. Should be between 0 and 1.
         *            A higher number means a slower dissipating speed.
         * @param snapToFactor The snap to factor. Should be between 0 and 1. A
         *            higher number means a stronger snap.
         */
        public SimpleDynamics(final float frictionFactor, final float snapToFactor) {
            mFrictionFactor = frictionFactor;
            mSnapToFactor = snapToFactor;
        }

        @Override
        protected void onUpdate(final int dt) {
            // update the velocity based on how far we are from the snap point
            mVelocity += getDistanceToLimit() * mSnapToFactor;

            // then update the position based on the current velocity
            mPosition += mVelocity * dt / 1000;

            // and finally, apply some friction to slow it down
            mVelocity *= mFrictionFactor;
        }
    }
}

 