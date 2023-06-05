package com.example.lab_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class NewsActivity extends AppCompatActivity {

    RadioGroup myRadioGroup;
    int marks=0;
    public  static String ques1Marks="Data from Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        myRadioGroup=findViewById(R.id.ques1RadioGroupID);
    }

    public void nextFunction(View view) {
        if(myRadioGroup.getCheckedRadioButtonId()==R.id.ques1RadioBtn1ID){
            marks=5;
        }
        Intent myIntent= new Intent(NewsActivity.this,quiz_2.class);
        myIntent.putExtra(ques1Marks,marks);
        startActivity(myIntent);
    }
}