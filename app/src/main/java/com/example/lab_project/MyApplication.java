package com.example.lab_project;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseApp.initializeApp(this);
        // Enable Firebase offline persistence (optional but recommended)
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
