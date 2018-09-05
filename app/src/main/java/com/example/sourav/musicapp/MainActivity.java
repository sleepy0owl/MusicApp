package com.example.sourav.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * setting onClickListener method to every textView
         * and override onClick method
         * here onClick method will send explicit intent to other activity
         */
        //get the textView using its id
        TextView rockTextView = findViewById(R.id.rock);
        //setOnClickListener method to this textView
        //setOnClickListener takes an onClickListener object
        rockTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RockActivity.class);
                //start activity
                startActivity(intent);
            }
        });

        TextView bluesTextView = findViewById(R.id.blues);
        bluesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BluesActivity.class);
                startActivity(intent);
            }
        });

        TextView jazzTextView = findViewById(R.id.jazz);
        jazzTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(intent);
            }
        });

        TextView folkTextView = findViewById(R.id.folk);
        folkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FolkActivity.class);
                startActivity(intent);
            }
        });

        TextView countryTextView = findViewById(R.id.country);
        countryTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CountryActivity.class);
                startActivity(intent);
            }
        });

        TextView popTextView = findViewById(R.id.pop);
        popTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PopActivity.class);
                startActivity(intent);
            }
        });
    }
}
