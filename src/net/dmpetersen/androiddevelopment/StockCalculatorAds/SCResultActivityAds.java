package net.dmpetersen.androiddevelopment.StockCalculatorAds;

import com.tapfortap.TapForTap;

import android.os.Bundle;
//import com.google.ads.*;


public class SCResultActivityAds extends SCResultActivity{

	//private AdView adView;
	
	
	@Override public void onCreate(Bundle savedInstanceState) {
	
        super.onCreate(savedInstanceState);
        
        
        TapForTap.initialize(this, "50945fb4e31e9b80704a8ae774536ca0");
        
     // Look up the AdView as a resource and load a request.    
       // AdView adView = (AdView)this.findViewById(R.id.adView);    
       // adView.loadAd(new AdRequest());
        
        }  
    	

    	

    	@Override  public void onDestroy() {    
    		//if (adView != null) {      
    			//adView.destroy();    
    			//}    
    		
    		super.onDestroy();  
    		}
      
}

