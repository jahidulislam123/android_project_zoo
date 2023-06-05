

package com.example.lab_project;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PostActivity extends AppCompatActivity {

    private int likeCount = 0; // Variable to track the like count
    private TextView likeButton; // TextView for the like button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        // Find the like button TextView in the layout
        likeButton = findViewById(R.id.commentButton1);

        // Set an onClickListener for the like button
        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeCount++; // Increase the like count

                // Update the text of the like button with the new count
                likeButton.setText("Like " + likeCount);
            }
        });
    }
}
