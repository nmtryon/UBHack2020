package com.example.ubhack2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button mButton;
    EditText mEdit;
    TextView mText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] arraySpinner = new String[] {
                "Ratings", "Tags", "Ingredients"
        };
        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        mButton = findViewById(R.id.enter);
        mButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                mEdit = findViewById(R.id.editText);
                mText = findViewById(R.id.textView2);
                mText.setText(mEdit.getText());

            }
        });

    }






}
