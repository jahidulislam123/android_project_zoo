package com.example.lab_project;



import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.io.IOException;

public class Fragment5 extends Fragment {

    private TextView animalNameTextView;
    private Button playAudioButton;
    private VideoView videoPlayer;

    public Fragment5() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_5, container, false);

        // Initialize views
        animalNameTextView = rootView.findViewById(R.id.animalName);
        playAudioButton = rootView.findViewById(R.id.playAudioButton);
        videoPlayer = rootView.findViewById(R.id.videoPlayer);

        // Set animal name
        animalNameTextView.setText("Animal Name");

        // Set click listener for audio button


// Inside your fragment class
        playAudioButton.setOnClickListener(new View.OnClickListener() {
            private MediaPlayer mediaPlayer;
            @Override
            public void onClick(View v) {
                if (mediaPlayer == null) {
                    // Create a new MediaPlayer instance
                    mediaPlayer = new MediaPlayer();

                    try {
                        // Get the URI of the raw resource file
                        Uri audioUri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.cows);

                        // Set the audio source from the URI
                        mediaPlayer.setDataSource(getActivity(), audioUri);

                        // Prepare the MediaPlayer asynchronously
                        mediaPlayer.prepareAsync();

                        // Set a listener for when the preparation is complete
                        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                            @Override
                            public void onPrepared(MediaPlayer mp) {
                                // Start audio playback
                                mediaPlayer.start();
                            }
                        });
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    if (mediaPlayer.isPlaying()) {
                        // If playing, stop the audio playback
                        mediaPlayer.stop();
                    }

                    // Release the MediaPlayer
                    mediaPlayer.release();
                    mediaPlayer = null;
                }
            }
        });





        // Set video URI and start playback
// Set video URI and start playback
        // Set video URI
        Uri videoUri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.penguin);
        videoPlayer.setVideoURI(videoUri);

// Add OnClickListener to start playback
        videoPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start video playback
                videoPlayer.start();
            }
        });



        return rootView;
    }

}
