package com.example.ethiopia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    Button anthem;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anthem = findViewById(R.id.anthem);

        // Initialize MediaPlayer with the anthem song
        mediaPlayer = MediaPlayer.create(this, R.raw.ethiopia_anthem1);

        anthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAnthem();
            }
        });
    }

    private void playAnthem() {
        if (mediaPlayer != null) {
            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.start();
                anthem.setText("Pause");
            } else {
                mediaPlayer.pause();
                anthem.setText("Play");
            }
        }
    }

    public void redirectToPlace(View view) {
        Intent redirectToDetail = new Intent(getApplicationContext(), PlaceDetailsActivity.class);
        String placeName = ((Button) view).getText().toString();
        redirectToDetail.putExtra("name", placeName);

        // Stop the anthem when navigating to the details activity
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            anthem.setText("Play");
        }

        startActivity(redirectToDetail);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Release the MediaPlayer resources
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
