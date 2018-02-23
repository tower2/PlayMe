package com.example.android.playme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Artist extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

// Find the View that shows the BOB MARLEY category
        TextView bobMarley = (TextView) findViewById(R.id.bob_marley);

        // Set a click listener on the View
        bobMarley.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view){
                Intent bobMarleyIntent = new Intent(Artist.this, PlayMePlayer.class);
                startActivity(bobMarleyIntent);
            }
        });

        // Find the View that shows the DROWNING POOL category
        TextView drowningPool = (TextView) findViewById(R.id.drowning_pool);

        // Set a click listener on the View
        drowningPool.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view){
                Intent drowningPoolIntent = new Intent(Artist.this, PlayMePlayer.class);
                startActivity(drowningPoolIntent);
            }
        });

        // Find the View that shows the HOLLYWOOD UNDEAD category
        TextView hollywoodUndead = (TextView) findViewById(R.id.hollywood_undead);

        // Set a click listener on the View
        hollywoodUndead.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view){
                Intent hollywoodUndeadIntent = new Intent(Artist.this, PlayMePlayer.class);
                startActivity(hollywoodUndeadIntent);
            }
        });

        // Find the View that shows the JAGGED EDGE category
        TextView jaggedEdge = (TextView) findViewById(R.id.jagged_edge);

        // Set a click listener on the View
        jaggedEdge.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view){
                Intent jaggedEdgeIntent = new Intent(Artist.this, PlayMePlayer.class);
                startActivity(jaggedEdgeIntent);
            }
        });

        // Find the View that shows the BACK TO LIBRARY category
        TextView backToLibrary = (TextView) findViewById(R.id.back_to_library);

        // Set a click listener on the View
        backToLibrary.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view){
                Intent backToLibraryIntent = new Intent(Artist.this, MainActivity.class);
                startActivity(backToLibraryIntent);
            }
        });
    }
}
