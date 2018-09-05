package com.example.sourav.musicapp;

public class Song {
    private String mSongName;
    private String mSongArtist;

    /**
     * public constructor to create song object containing song name, artist & album name as
     * properties
     */
    public Song(String songName, String songArtist){
        mSongName = songName;
        mSongArtist = songArtist;
    }

    /**
     * public get method to get the song name
     * @return song name
     */
    public String getSongName(){
        return mSongName;
    }

    /**
     * public method to get name of the song artist NOTE: in case of the song is from a band
     * the band name is returned
     * @return song artist
     */
    public String getmSongArtist(){
        return mSongArtist;
    }

}
