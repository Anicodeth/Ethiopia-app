package com.example.ethiopia;

// PlaceDetailsActivity.java

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class PlaceDetailsActivity extends AppCompatActivity {
    private PlaceRepository placeRepository = new PlaceRepository();
    private Button redirect;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);

        redirect = findViewById(R.id.redirect);
        title = findViewById(R.id.place);
        String placeName = getIntent().getStringExtra("name");
        Place currentPlace = placeRepository.getPlaceByName(placeName);

        redirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = currentPlace.getWikipediaLink();
                Intent toPage = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(toPage);
            }
        });

        TextView textViewPlaceName = findViewById(R.id.details);
        textViewPlaceName.setText(currentPlace.getDescription());
        title.setText(currentPlace.getName());

        ImageView placePhoto = findViewById(R.id.placeImage);
        placePhoto.setImageResource(currentPlace.getImageResourceId());

        ImageView destinationOne = findViewById(R.id.des1);
        destinationOne.setImageResource(currentPlace.getDesImageOne());

        ImageView destinationTwo = findViewById(R.id.des2);
        destinationTwo.setImageResource(currentPlace.getDesImageTwo());

        ImageView destinationThree = findViewById(R.id.des3);
        destinationThree.setImageResource(currentPlace.getDesImageThree());
    }
}
