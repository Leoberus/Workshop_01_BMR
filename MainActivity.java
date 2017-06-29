package com.example.peen.workshop_bmr;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int gender = 0;
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
                    gender = 1;
                    break;
            case R.id.radioButton2:
                if (checked)
                    Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
                    gender = 2;
                    break;
        }
    }


    protected void calculateBMR(View v){

        double A=0,BMR=0,weight,height;
        int age,exercise;

        TextView tvage = (TextView)findViewById(R.id.editText2);
        age =  Integer.parseInt(tvage.getText().toString());

        TextView tvhieght = (TextView)findViewById(R.id.editText3);
        height =  Double.parseDouble(tvhieght.getText().toString());

        TextView tvweight = (TextView)findViewById(R.id.editText4);
        weight =  Double.parseDouble(tvweight.getText().toString());

        Spinner spinner_exercise = (Spinner) findViewById(R.id.spinner);
        exercise =  spinner_exercise.getSelectedItemPosition();

        if(gender == 1){
            A = (10*weight)+(6.25*height)+(5*age)+5;
        }else if(gender == 2){
            A = (10*weight)+(6.25*height)+(5*age)-161;
        }

        switch (exercise){
            case 0:
                BMR = 1.2*A;
                break;
            case 1:
                BMR = 1.375*A;
                break;
            case 2:
                BMR  =1.55 * A;
                break;
            case 3:
                BMR  = 1.725 * A;
                break;
            case 4:
                BMR = 1.9 * A;
                break;
        }

        TextView BMRtv = (TextView) findViewById(R.id.textView);
        BMRtv.setText("BMR is" + BMR +"  Calories");

    }




}
