package com.example.lab_project;

// MainActivity.java
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class VisitActivity extends AppCompatActivity {

     EditText nameEditText, emailEditText, phoneEditText, ageEditText, hoursEditText ,roleEditText;
     Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit);

    }

    public void processes(View view) {

        roleEditText=findViewById(R.id.roleEditText);
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        ageEditText = findViewById(R.id.ageEditText);
        hoursEditText = findViewById(R.id.hoursEditText);

        String role = roleEditText.getText().toString().trim();
        String name = nameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String phone = phoneEditText.getText().toString().trim();
        int age = Integer.parseInt(ageEditText.getText().toString().trim());
        int hours = Integer.parseInt(hoursEditText.getText().toString().trim());

        collectdata collect = new collectdata(name,email,phone,age,hours);
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference root = db.getReference("users");
        root.child(role).setValue(collect);




        nameEditText.setText("");
        emailEditText.setText("");
        phoneEditText.setText("");
        ageEditText.setText("");
        hoursEditText.setText("");


        Toast.makeText(getApplicationContext(), "data saved successfully", Toast.LENGTH_SHORT).show();

    }
}
