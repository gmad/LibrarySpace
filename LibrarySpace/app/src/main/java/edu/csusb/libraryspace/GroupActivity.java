package edu.csusb.libraryspace;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class GroupActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        
        // Font path
        String fontPath = "fonts/dosis-regular.ttf";
        // text view label
        TextView txtDividerText = (TextView) findViewById(R.id.divider);
        TextView txtRoomText = (TextView) findViewById(R.id.roomText);
        TextView txtHourText = (TextView) findViewById(R.id.hourText);
        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(),fontPath);
        // Applying font
        txtDividerText.setTypeface(tf);
        txtRoomText.setTypeface(tf);
        txtHourText.setTypeface(tf);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_group, menu);
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
