package com.example.sourav.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        //creating an arrayList of Song object
        ArrayList<Song> songs = new ArrayList<>();
        //now, we need to create Song object and add them to arrayList songs
        songs.add(new Song("Friends in Low Places", "Garth Brooks"));
        songs.add(new Song("Body Like a Back Road", "Sam Hunt"));
        songs.add(new Song("Cry Pretty", "Carrie Underwood"));
        songs.add(new Song("Heaven", "Kane Brown"));
        songs.add(new Song("Songs About Rain", "Gary Allen"));
        songs.add(new Song("What Ifs", "Kane Brown"));
        songs.add(new Song("Small Town Boy", "Dustin Lynch"));
        songs.add(new Song("The Fighter", "Keith Urban"));
        songs.add(new Song("Singles You Up", "Jordan Davis"));
        songs.add(new Song("You Look Good", "Lady Antebellum"));
        songs.add(new Song("Hide the Wine", "Carly Pearce"));
        songs.add(new Song("Every Little Thing", "Carly Pearce"));
        songs.add(new Song("Better Man", "Little Big Town"));
        songs.add(new Song("Kiss Somebody", "Morgan Evans"));

        //create new songsAdapter
        SongsAdapter songsAdapter = new SongsAdapter(this, songs);
        //attach this songsAdapter to ListView
        ListView listView = findViewById(R.id.country_list);
        listView.setAdapter(songsAdapter);
    }
}
