package com.example.sourav.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BluesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blues);

        //creating an arrayList of Song object
        ArrayList<Song> songs = new ArrayList<>();
        //now, we need to create Song object and add them to arrayList songs
        songs.add(new Song("The Thrill is Gone", "B.B. King"));
        songs.add(new Song("I Can't Quit You", "John Lee Hooker"));
        songs.add(new Song("Crossroads", "Cream"));
        songs.add(new Song("Sunshine of Your Love", "Cream"));
        songs.add(new Song("I'd Rather Go Blind", "Joe Bonamassa"));
        songs.add(new Song("It Hurts Me Too", "Eric Clapton"));
        songs.add(new Song("Sweet Little Angel", "B.B. King"));
        songs.add(new Song("Love in Vain", "The Rolling Stones"));
        songs.add(new Song("Little Wing", "Stevie Ray Vaughan"));
        songs.add(new Song("Since I've Been Loving you", "Led Zeppelin"));
        songs.add(new Song("Bell Bottom Blues", "Eric Clapton"));
        songs.add(new Song("Still Got the Blues", "Gary Moore"));
        songs.add(new Song("Smokestack Lightning", "Howlin' Wolf"));
        songs.add(new Song("Black Rose", "Eric Clapton"));

        //create new songsAdapter
        SongsAdapter songsAdapter = new SongsAdapter(this, songs);
        //attach this songsAdapter to ListView
        ListView listView = findViewById(R.id.blues_list);
        listView.setAdapter(songsAdapter);
    }
}
