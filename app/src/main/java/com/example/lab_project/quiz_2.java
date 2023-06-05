package com.example.lab_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class quiz_2 extends AppCompatActivity {

    RadioGroup myRadioGroup2;
    int q2marks=0;
    int q1mark,allmark;
    public  static String toTalMarks="Data from Main Activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);


        myRadioGroup2=findViewById(R.id.ques2RadioGroupID);
        Intent mygetIntent=getIntent();
        q1mark=mygetIntent.getIntExtra(NewsActivity.ques1Marks,0);
    }

    public void nextFunction2(View view) {

        if(myRadioGroup2.getCheckedRadioButtonId()==R.id.ques2RadioBtn2ID){
            q2marks=5;
        }
        allmark=q1mark+q2marks;
        Intent myIntent= new Intent(quiz_2.this,quiz_3.class);

        myIntent.putExtra(toTalMarks,allmark);
        startActivity(myIntent);
    }
}
