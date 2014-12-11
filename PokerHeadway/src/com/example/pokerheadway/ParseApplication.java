package com.example.pokerheadway;
 
import com.parse.Parse;
import com.parse.ParseACL;
 
import com.parse.ParseUser;
 
import android.app.Application;
 
public class ParseApplication extends Application 
{
 
	@Override
	public void onCreate() {
		super.onCreate();
 
		// Add your initialization code here
		 Parse.initialize(this, "JRHIYWvrSCrnqRXBBbCHQW0Q4A9V5wRoyAu6s9Kg", "6TtaLvP00rlaLN6juxT4vLyqBlVnavcnHae4LkXX");
 
		ParseUser.enableAutomaticUser();
	//	ParseACL defaultACL = new ParseACL();
 
		// If you would like all objects to be private by default, remove this line.
	//	defaultACL.setPublicReadAccess(true);
 
	//	ParseACL.setDefaultACL(defaultACL, true);
	}
 
}
