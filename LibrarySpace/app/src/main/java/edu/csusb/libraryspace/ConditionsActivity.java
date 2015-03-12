package edu.csusb.libraryspace;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ConditionsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
   
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditions);
        
        // Font path
        String fontPath = "fonts/dosis-regular.ttf";
        // text view label
        TextView txtConditionsHeaderText = (TextView) findViewById(R.id.conditionsHeaderText);
        TextView txtBodyText = (TextView) findViewById(R.id.bodyText);
        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(),fontPath);
        // Applying font
        txtConditionsHeaderText.setTypeface(tf);
        txtBodyText.setTypeface(tf);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_conditions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
