package com.example.sourav.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        //creating an arrayList of Song object
        ArrayList<Song> songs = new ArrayList<>();
        //now, we need to create Song object and add them to arrayList songs
        songs.add(new Song("One More Night", "Maroon 5"));
        songs.add(new Song("Shape of You", "Ed Sheeran"));
        songs.add(new Song("Girls Like You", "Maroon 5"));
        songs.add(new Song("Wake Me Up", "Avicii"));
        songs.add(new Song("One Kiss", " Dua Lipa"));
        songs.add(new Song("Billie Jean", "Michael Jackson"));
        songs.add(new Song("Can't Stop The Feeling!", "Justin Timberlake"));
        songs.add(new Song("In My Feelings", "Drake"));
        songs.add(new Song("Say Something", "Justin Timberlake"));
        songs.add(new Song("Done For Me", "Charlie Puth"));
        songs.add(new Song("Attention", "Charlie Puth"));
        songs.add(new Song("Let Her Go", "Passenger"));
        songs.add(new Song("Counting Stars", "One Republic"));
        songs.add(new Song("24k Magic", "Bruno Mars"));

        //create new songsAdapter
        SongsAdapter songsAdapter = new SongsAdapter(this, songs);
        //attach this songsAdapter to ListView
        ListView listView = findViewById(R.id.pop_list);
        listView.setAdapter(songsAdapter);
    }
}
