package com.example.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CreateOpeningSongList();
     }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void CreateOpeningSongList(){
        Spinner spinner = (Spinner) findViewById(R.id.openingsong_spinner);
        ArrayAdapter<CharSequence> list = ArrayAdapter.createFromResource(this,R.array.openingSongs,android.R.layout.simple_spinner_item);
       spinner.setAdapter(list);
    }
    
}