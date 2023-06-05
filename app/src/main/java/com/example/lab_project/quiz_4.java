package com.example.lab_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class quiz_4 extends AppCompatActivity {

    RadioGroup myRadioGroup2;
    int q2marks=0;
    int q1mark,allmark;
    public  static String toTalMarks="Data from Main Activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);

        myRadioGroup2=findViewById(R.id.ques4RadioGroupID);
        Intent mygetIntent=getIntent();
        q1mark=mygetIntent.getIntExtra(quiz_3.toTalMarks,0);
    }

    public void nextFunction4(View view) {

        if(myRadioGroup2.getCheckedRadioButtonId()==R.id.ques4RadioBtn3ID1){
            q2marks=5;
        }
        allmark=q1mark+q2marks;
        Intent myIntent= new Intent(quiz_4.this,quiz_5.class);

        myIntent.putExtra(toTalMarks,allmark);
        startActivity(myIntent);



    }
}