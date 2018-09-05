package com.example.sourav.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FolkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folk);

        //creating an arrayList of Song object
        ArrayList<Song> songs = new ArrayList<>();
        //now, we need to create Song object and add them to arrayList songs
        songs.add(new Song("Mr. Tambourine Man", "Bob Dylan"));
        songs.add(new Song("Blowin' in the Wind", "Bob Dylan"));
        songs.add(new Song("Suzanne", "Leonard Cohen"));
        songs.add(new Song("The Boxer", "Simon & Garfunkel"));
        songs.add(new Song("American Tune", "Simon & Garfunkel"));
        songs.add(new Song("Hobo's Lullaby", "Woody Guthrie"));
        songs.add(new Song("No Man's Land", "June Tabor"));
        songs.add(new Song("Our Town", "Iris DeMent"));
        songs.add(new Song("Tennessee Stud", "Johnny Cash"));
        songs.add(new Song("Like Rolling Stone", "Bob Dylan"));
        songs.add(new Song("Take Me Home, Country Roads", "John Denver"));
        songs.add(new Song("The Long Black Veil", "Johnny Cash"));
        songs.add(new Song("Shake Sugaree", "Elizabeth Cotten"));
        songs.add(new Song("Hello in There", "John Prine"));

        //create new songsAdapter
        SongsAdapter songsAdapter = new SongsAdapter(this, songs);
        //attach this songsAdapter to ListView
        ListView listView = findViewById(R.id.folk_list);
        listView.setAdapter(songsAdapter);
    }
}
