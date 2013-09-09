package com.example.myapplication;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CreateOpeningSongList();

        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner foodSpinner = (Spinner) findViewById(R.id.food_spinner);
                Spinner waterSpinner = (Spinner) findViewById(R.id.food_spinner);
                Spinner sleepSpinner = (Spinner) findViewById(R.id.food_spinner);
                EditText exerciseTextView = (EditText) findViewById(R.id.exercise_editText);

                String message = new MessageCreator().CreateMessage(foodSpinner.getSelectedItem().toString(), waterSpinner.getSelectedItem().toString(), sleepSpinner.getSelectedItem().toString(), exerciseTextView.getText().toString() );

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("status", message);
                clipboard.setPrimaryClip(clip);
            }
        });
     }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    public void CreateOpeningSongList(){
        ArrayAdapter<CharSequence> list = ArrayAdapter.createFromResource(this,R.array.WorkoutStatus,android.R.layout.simple_spinner_item);
        SetSpinner(R.id.food_spinner, list);
        SetSpinner(R.id.water_spinner, list);
        SetSpinner(R.id.sleep_spinner, list);

    }

    public void SetSpinner(int spinnerID, ArrayAdapter<CharSequence> list  ){
        Spinner spinner = (Spinner) findViewById(spinnerID);
        spinner.setAdapter(list);
    }



    
}
