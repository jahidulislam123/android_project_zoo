package com.example.lab_project;


import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class GamesActivity extends AppCompatActivity {

    private Button[] buttons;
    private VideoView winVideo;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        buttons = new Button[9];
        buttons[0] = findViewById(R.id.btn1ID);
        buttons[1] = findViewById(R.id.btn2ID);
        buttons[2] = findViewById(R.id.btn3ID);
        buttons[3] = findViewById(R.id.btn4ID);
        buttons[4] = findViewById(R.id.btn5ID);
        buttons[5] = findViewById(R.id.btn6ID);
        buttons[6] = findViewById(R.id.btn7ID);
        buttons[7] = findViewById(R.id.btn8ID);
        buttons[8] = findViewById(R.id.btn9ID);

        winVideo = findViewById(R.id.winVideo);
        winVideo.setVisibility(View.GONE);
    }

    public void setValue(View view) {
        Button button = (Button) view;
        if (clickCount % 2 == 0) {
            button.setText("0");
        } else {
            button.setText("X");
        }
        clickCount++;

        if (checkWinCondition()) {
            Toast.makeText(this, "You have won!", Toast.LENGTH_SHORT).show();
            winVideo.setVisibility(View.VISIBLE);
            playWinVideo();
        } else if (clickCount == 9) {
            Toast.makeText(this, "Game over - Draw", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean checkWinCondition() {
        // Check rows
        for (int i = 0; i <= 6; i += 3) {
            if (buttons[i].getText().equals(buttons[i + 1].getText())
                    && buttons[i + 1].getText().equals(buttons[i + 2].getText())
                    && !buttons[i].getText().equals("")) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (buttons[i].getText().equals(buttons[i + 3].getText())
                    && buttons[i + 3].getText().equals(buttons[i + 6].getText())
                    && !buttons[i].getText().equals("")) {
                return true;
            }
        }

        // Check diagonals
        if (buttons[0].getText().equals(buttons[4].getText())
                && buttons[4].getText().equals(buttons[8].getText())
                && !buttons[0].getText().equals("")) {
            return true;
        }
        if (buttons[2].getText().equals(buttons[4].getText())
                && buttons[4].getText().equals(buttons[6].getText())
                && !buttons[2].getText().equals("")) {
            return true;
        }

        return false;
    }

    private void playWinVideo() {
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.myvideo);
        winVideo.setVideoURI(videoUri);
        winVideo.start();
    }
}
