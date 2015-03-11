package edu.csusb.libraryspace;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ConditionsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        TextView txt = (TextView) findViewById(R.id.conditionsHeaderText);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Dosis.ttf");
        txt.setTypeface(font);

        TextView txt = (TextView) findViewById(R.id.bodyText);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Dosis.ttf");
        txt.setTypeface(font);
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditions);
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
