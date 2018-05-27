package com.nomaa.quizzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitButton(View view){
        int numRight = 0;

        CheckBox q1_1 = (CheckBox) findViewById(R.id.q1_1);
        CheckBox q1_2 = (CheckBox) findViewById(R.id.q1_2);
        CheckBox q1_3 = (CheckBox) findViewById(R.id.q1_3);

        RadioButton q2 = (RadioButton) findViewById(R.id.q2_right);
        RadioButton q3 = (RadioButton) findViewById(R.id.q3_right);
        RadioButton q4 = (RadioButton) findViewById(R.id.q4_right);

        EditText q5 = (EditText) findViewById(R.id.free_response);

        if(q1_1.isChecked() && q1_2.isChecked() && q1_3.isChecked())
            numRight++;

        if(q2.isChecked())
            numRight++;

        if(q3.isChecked())
            numRight++;

        if(q4.isChecked())
            numRight++;

        if(q5.getText().toString().equals("United States of America")) {
            numRight++;
        }

        Toast toast = Toast.makeText(getApplicationContext(), "Correct: " + numRight + "/5", Toast.LENGTH_SHORT);
        toast.show();
    }
}
