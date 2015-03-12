package edu.csusb.libraryspace;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Font path
        String fontPath = "fonts/dosis-regular.ttf";
        // text view label
        TextView txtHeaderText = (TextView) findViewById(R.id.headerText);
        TextView txtGroupText = (TextView) findViewById(R.id.groupButton);
        TextView txtIndividualText = (TextView) findViewById(R.id.individualButton);
        TextView txtMultimediaText = (TextView) findViewById(R.id.multimediaButton);
        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(),fontPath);
        // Applying font
        txtHeaderText.setTypeface(tf);
        txtGroupText.setTypeface(tf);
        txtIndividualText.setTypeface(tf);
        txtMultimediaText.setTypeface(tf);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /**
     * OnClick function for groupButton. Opens GroupActivity.
     */
    public void groupButtonOnClick(View view)
    {
        Intent myIntent = new Intent(MainActivity.this, GroupActivity.class);
        MainActivity.this.startActivity(myIntent);
    }
}
