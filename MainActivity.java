package com.example.peen.workshop_bmr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    protected void onRadioButtonClicked(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        //Declare 2 button variable
        Button male_btn = (Button)findViewById(R.id.radioButton);
        Button female_btn = (Button)findViewById(R.id.radioButton2);
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.radioButton2:
                if (checked)
                    Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
                    break;
        }
    }





}
