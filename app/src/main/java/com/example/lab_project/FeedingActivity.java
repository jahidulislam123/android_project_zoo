package com.example.lab_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FeedingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeding);
    }

    public void rabbitPage(View view) {
        Intent intent = new Intent(FeedingActivity.this, Rubbitbuy.class);
        startActivity(intent);
    }

    public void parrotPage(View view) {
        Intent intent = new Intent(FeedingActivity.this, Parrotbuy.class);
        startActivity(intent);
    }

    public void dogPage(View view) {
        Intent intent = new Intent(FeedingActivity.this, Dogbuy.class);
        startActivity(intent);
    }

    public void catpage(View view) {
        Intent intent = new Intent(FeedingActivity.this, Catsbuy.class);
        startActivity(intent);
    }
}