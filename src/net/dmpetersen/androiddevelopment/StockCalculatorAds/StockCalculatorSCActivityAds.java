package net.dmpetersen.androiddevelopment.StockCalculatorAds;

import android.os.Bundle;

//import com.google.ads.AdRequest;
//import com.google.ads.AdView;
//import com.google.ads.*;


//a15261d0931d619 



public class StockCalculatorSCActivityAds extends StockCalculatorSCActivity{

	//private AdView adView;
	
	
	@Override public void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);
        
        
       // TapForTap.initialize(this, "50945fb4e31e9b80704a8ae774536ca0");
        
        
        // Look up the AdView as a resource and load a request.    
       // adView = (AdView)this.findViewById(R.id.adView);    
       // adView.loadAd(new AdRequest());
        
        
        
        AppRater.app_launched(this);

        
        }  
	
	
	
	/*
	 * 
	 * 
	 * private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
private final long ONE_DAY = 24 * 60 * 60 * 1000;

@Override
protected void onCreate(Bundle state){
    SharedPreferences preferences = getPreferences(MODE_PRIVATE);
    String installDate = preferences.getString("InstallDate", null);
    if(installDate == null) {
        // First run, so save the current date
        SharedPreferences.Editor editor = preferences.edit();
        Date now = new Date();
        String dateString = formatter.format(now);
        editor.putString("InstallDate", dateString);
        // Commit the edits!
        editor.commit();
    }
    else {
        // This is not the 1st run, check install date
        Date before = (Date)formatter.parse(installDate);
        Date now = new Date();
        long diff = now.getTimeInMillis() - before.getTimeInMillis();
        long days = diff / ONE_DAY;
        if(days > 30) { // More than 30 days?
             // Expired !!!
        }
    }

    ...
}(non-Javadoc)
	 * @see android.app.Activity#onDestroy()
	 */
	
	
	

	@Override  public void onDestroy() {    
		//if (adView != null) {      
			//adView.destroy();    
			//}    
		
		super.onDestroy();  
		}
	}
		
		
		