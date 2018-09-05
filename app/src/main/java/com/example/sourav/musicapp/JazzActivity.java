package com.example.sourav.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);

        //creating an arrayList of Song object
        ArrayList<Song> songs = new ArrayList<>();
        //now, we need to create Song object and add them to arrayList songs
        songs.add(new Song("Blue in Green", "Miles Davis"));
        songs.add(new Song("All Blues", "Miles Davis"));
        songs.add(new Song("Fly Me to the Moon", "Frank Sinatra"));
        songs.add(new Song("Autumn Leaves", "Eric Clapton"));
        songs.add(new Song("What a Wonderful World", "L. Armstrong"));
        songs.add(new Song("In the Mood", "Glenn Miller"));
        songs.add(new Song("Sing Sing Sing", "Benny Goodman"));
        songs.add(new Song("So What", "Miles Davis"));
        songs.add(new Song("Body and Soul", "Billie Holiday"));
        songs.add(new Song("Moonlight Serenade", "Glenn Miller"));
        songs.add(new Song("Flamenco Sketches", "Miles Davis"));
        songs.add(new Song("The Man I Love", "Billie Holiday"));
        songs.add(new Song("I've Got You Under My Skin", "Frank Sinatra"));
        songs.add(new Song("Blue Skies", "Ella Fitzgerald"));

        //create new songsAdapter
        SongsAdapter songsAdapter = new SongsAdapter(this, songs);
        //attach this songsAdapter to ListView
        ListView listView = findViewById(R.id.jazz_list);
        listView.setAdapter(songsAdapter);
    }
}
