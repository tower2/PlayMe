package com.example.android.playme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.name;

public class Album extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);



        // Find the View that shows the ARTIST category
        TextView americanTragedy = (TextView) findViewById(R.id.american_tragedy);

        // Set a click listener on the View
        americanTragedy.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view) {

                Intent americanTragedyIntent = new Intent(Album.this, PlayMePlayer.class);
                startActivity(americanTragedyIntent);
            }
        });

        // Find the View that shows the ALBUM category
        TextView hard = (TextView) findViewById(R.id.hard);

        // Set a click listener on the View
        hard.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view) {
                Intent hardIntent = new Intent(Album.this, PlayMePlayer.class);
                startActivity(hardIntent);
            }
        });

        // Find the View that shows the ALBUM category
        TextView sinner = (TextView) findViewById(R.id.sinner);

        // Set a click listener on the View
        sinner.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view) {
                Intent sinnerIntent = new Intent(Album.this, PlayMePlayer.class);
                startActivity(sinnerIntent);
            }
        });


        // Find the View that shows the ALBUM category
        TextView unknownAlbum = (TextView) findViewById(R.id.unknown_album);

        // Set a click listener on the View
        unknownAlbum.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view) {
                Intent unknownAlbumIntent = new Intent(Album.this, PlayMePlayer.class);
                startActivity(unknownAlbumIntent);
            }
        });

        // Find the View that shows the ALBUM category
        TextView backToLibrary = (TextView) findViewById(R.id.back_to_library);

        // Set a click listener on the View
        backToLibrary.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view) {
                Intent backToLibraryIntent = new Intent(Album.this, MainActivity.class);
                startActivity(backToLibraryIntent);
            }
        });
    }

}




