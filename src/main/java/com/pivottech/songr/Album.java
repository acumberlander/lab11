package com.pivottech.songr;

public class Album {
    public String title;
    public String imageUrl ;
    public String artist ;
    public int songCount ;
    public int length ;

    Album(String _title, String _artist, int _songCount, int _length, String _imageUrl) {
        title = _title;
        imageUrl = _imageUrl;
        artist = _artist;
        songCount = _songCount;
        length = _length;
    }
}
