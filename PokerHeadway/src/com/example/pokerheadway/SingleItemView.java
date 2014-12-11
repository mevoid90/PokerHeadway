package com.example.pokerheadway;
 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
 
public class SingleItemView extends Activity {
	// Declare Variables
	TextView txtName,txtMain;
	String name;
	String text;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from singleitemview.xml
		setContentView(R.layout.singleitemview);
 
		// Retrieve data from MainActivity on item click event
		Intent i = getIntent();
 
		// Get the name
		name = i.getStringExtra("name");
		text=i.getStringExtra("text");
 
		// Locate the TextView in singleitemview.xml
		txtMain = (TextView) findViewById(R.id.name);
		txtName = (TextView) findViewById(R.id.namelabel);
		// Load the text into the TextView
		txtName.setText(name);
		txtMain.setText(text);
 
	}
}
