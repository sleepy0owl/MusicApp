package com.example.sourav.musicapp;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);
        //setting up button
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //creating an arrayList of Song object
        ArrayList<Song> songs = new ArrayList<>();
        //now, we need to create Song object and add them to arrayList songs
        songs.add(new Song("Hey Jude", "The Beatles"));
        songs.add(new Song("Smell Like Teen Spirit", "Nirvana"));
        songs.add(new Song("Stairway to Heaven", "Led Zeppelin"));
        songs.add(new Song("Free Bird", "Lynyrd Synyrd"));
        songs.add(new Song("Bohemian Rhapsody", "Queen"));
        songs.add(new Song("Kashmir", "Led Zeppelin"));
        songs.add(new Song("Layla", "Derek & the Dominos"));
        songs.add(new Song("All Along the WatchTower", "Jimi Hendrix"));
        songs.add(new Song("We Will Rock You", "Queen"));
        songs.add(new Song("Comfortably Numb", "Pink Floyd"));
        songs.add(new Song("Wish You Were Here", "Pink Floyd"));
        songs.add(new Song("Smoke On The Water", "Deep Purple"));
        songs.add(new Song("Soldier of Fortune", "Deep Purple"));
        songs.add(new Song("Another Brick in The Wall", "Pink Floyd"));

        //create new songsAdapter
        SongsAdapter songsAdapter = new SongsAdapter(this, songs);
        //attach this songsAdapter to ListView
        ListView listView = findViewById(R.id.rock_list);
        listView.setAdapter(songsAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
