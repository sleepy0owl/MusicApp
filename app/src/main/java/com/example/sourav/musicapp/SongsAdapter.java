package com.example.sourav.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Song> {

    /**
     * public constructor to create songsAdapter
     * here we are using super class ArrayAdapter's constructor method
     */
    public SongsAdapter(Activity context, ArrayList<Song> songs){
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //get the current song object
        Song currentSong = getItem(position);

        View listItemView = convertView;

        //if the child views in ListView is null initially
        //then inflate views
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_list, parent, false);
        }

        //get the textView from listItemView and set text to it
        TextView songName = listItemView.findViewById(R.id.song_name);
        songName.setText(currentSong.getSongName());

        TextView songArtist = listItemView.findViewById(R.id.song_artist);
        songArtist.setText(currentSong.getmSongArtist());

        return listItemView;
    }
}
