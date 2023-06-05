package com.example.lab_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newsFunction(View view) {
        Intent intent = new Intent(MainActivity.this, NewsActivity.class);
        startActivity(intent);
    }

    public void animalFunction(View view) {
        Intent intent = new Intent(MainActivity.this, AnimalActiviy.class);
        startActivity(intent);
    }

    public void feedingFunction(View view) {
        Intent intent = new Intent(MainActivity.this, FeedingActivity.class);
        startActivity(intent);
    }

    public void postFunction(View view) {
        Intent intent = new Intent(MainActivity.this, PostActivity.class);
        startActivity(intent);
    }

    public void gamesFunction(View view) {
        Intent intent = new Intent(MainActivity.this, GamesActivity.class);
        startActivity(intent);
    }

    public void visitFunction(View view) {

        Intent intent = new Intent(MainActivity.this, VisitActivity.class);
        startActivity(intent);
    }
}


