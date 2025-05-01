package com.example.videolooptv;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;
    private List<Integer> videoResIds = new ArrayList<>(); // List to store video resource IDs
    private int currentVideoIndex = 0; // Track the current video index

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);

        // Load all .mp4 files from the raw folder
        loadVideoResIds();

        // Play the first video
        playVideo();
    }

    private void loadVideoResIds() {
        // Use reflection to get all video resource IDs from the raw folder
        Field[] fields = R.raw.class.getFields();
        for (Field field : fields) {
            try {
                int resId = field.getInt(null);
                videoResIds.add(resId);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private void playVideo() {
        if (videoResIds.isEmpty()) {
            return; // No videos to play
        }

        // Get the current video resource ID
        int videoResId = videoResIds.get(currentVideoIndex);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + videoResId);
        videoView.setVideoURI(videoUri);

        // Set up the listener to play the next video when the current one finishes
        videoView.setOnCompletionListener(mp -> {
            currentVideoIndex = (currentVideoIndex + 1) % videoResIds.size(); // Move to the next video
            playVideo(); // Play the next video
        });

        // Start the video
        videoView.start();
    }
}
