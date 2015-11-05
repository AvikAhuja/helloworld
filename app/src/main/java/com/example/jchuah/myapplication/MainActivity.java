package com.example.jchuah.myapplication;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static String tag= "com.example.jchuah.myapplication.MainActivity";

    Bundle sendBundle = new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onNextClick(View source){
        //Toast.makeText(this,"Houdy", Toast.LENGTH_LONG ).show();
        Log.i(tag, "launching Color Activity");
        Intent colorActivityIntent = new Intent(this, ColorActivity.class);
        EditText e = (EditText)findViewById(R.id.UserName);
        sendBundle.putString("name", e.getText(). toString());

        colorActivityIntent.putExtra("groceries", sendBundle);

        startActivity(colorActivityIntent); //#lb
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
