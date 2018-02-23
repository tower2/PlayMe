package com.example.android.playme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class PlayMePlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_me_player);


        TextView textView = (TextView) findViewById(R.id.display_artist_album);


        // Display Toast for skip forward and back buttons
        Button backSkip = (Button) findViewById(R.id.back_skip);

        // Set a click listener on the View
        backSkip.setOnClickListener(new View.OnClickListener() {

            String musicFunction = "Back Skip function would play music.";

            @Override
            public void onClick(View view) {
                displayToast(musicFunction);
            }
        });

        Button forwardSkip = (Button) findViewById(R.id.forward_skip);

        // Set a click listener on the View
        forwardSkip.setOnClickListener(new View.OnClickListener() {

            String musicFunction = "Forward Skip function would play music.";

            @Override
            public void onClick(View view) {
                displayToast(musicFunction);
            }
        });

        // Find the View that shows the BACK TO LIBRARY category
        Button play = (Button) findViewById(R.id.play);

        // Set a click listener on the View
        play.setOnClickListener(new View.OnClickListener() {

            String musicFunction = "Play function would play music.";

            @Override
            public void onClick(View view) {
                displayToast(musicFunction);
            }
        });

        // Find the View that shows the BACK TO LIBRARY category
        TextView backToLibrary = (TextView) findViewById(R.id.back_to_library);

        // Set a click listener on the View
        backToLibrary.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view) {
                Intent backToLibraryIntent = new Intent(PlayMePlayer.this, MainActivity.class);
                startActivity(backToLibraryIntent);
            }
        });

    }

    // Displays the Toast message on Button press
    public void displayToast(String musicFunction){
        Toast toast = Toast.makeText(this, musicFunction, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER,0,0);
        toast.show();
    }
}
