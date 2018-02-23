package com.example.android.playme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the ARTIST category
        TextView artistTextView = (TextView) findViewById(R.id.artist_textView);

        // Set a click listener on the View
        artistTextView.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view){
                Intent artistIntent = new Intent(MainActivity.this, Artist.class);
                startActivity(artistIntent);
            }
        });

        // Find the View that shows the ALBUM category
        TextView albumTextView = (TextView) findViewById(R.id.album_textView);

        // Set a click listener on the View
        albumTextView.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view){
                Intent albumIntent = new Intent(MainActivity.this, Album.class);
                startActivity(albumIntent);
            }
        });

        // Find the View that shows the PURCHASE category
        TextView purchaseTextView = (TextView) findViewById(R.id.purchase_textView);

        // Set a click listener on the View
        purchaseTextView.setOnClickListener(new View.OnClickListener(){

            // The code in this method will be executed when the numbers view is clicked on.
            @Override
            public void onClick(View view){
                Intent purchaseIntent = new Intent(MainActivity.this, PurchaseActivity.class);
                startActivity(purchaseIntent);
            }
        });
    }
}
