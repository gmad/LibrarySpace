package edu.csusb.libraryspace;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class BookingActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        
        // Font path
        String fontPath = "fonts/dosis-regular.ttf";
        // text view label
        TextView txtBookingHeader = (TextView) findViewById(R.id.bookingHeader);
        TextView txtFullNameText = (TextView) findViewById(R.id.fullNameText);
        TextView txtEmailText = (TextView) findViewById(R.id.emailText);
        TextView txtReminderEmailText = (TextView) findViewById(R.id.reminderEmailText);
        TextView txtPublicLabelText = (TextView) findViewById(R.id.publicLabelText);
        TextView txtRequiredFieldsText = (TextView) findViewById(R.id.requiredFieldsText);
        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(),fontPath);
        // Applying font
        txtBookingHeader.setTypeface(tf);
        txtFullNameText.setTypeface(tf);
        txtEmailText.setTypeface(tf);
        txtReminderEmailText.setTypeface(tf);
        txtPublicLabelText.setTypeface(tf);
        txtRequiredFieldsText.setTypeface(tf);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_booking, menu);
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
