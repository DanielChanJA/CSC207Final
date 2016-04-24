package com.danielchan.august2015question2;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class Song {

    private String artist;
    private String songTitle;

    private int songLength;
    private int yearOfSong;
    private String genre;
    private boolean isIndie = false;
    private String lyrics;


    public static class Builder {

        private String artist;
        private String songTitle;

        private int songLength;
        private int yearOfSong;
        private String genre;
        private boolean isIndie = false;
        private String lyrics;

        public Builder(String a, String s) {
            artist = a;
            songTitle = s;
        }

        public Builder addSongLength(int length) {
            this.songLength = length;
            return this;
        }

        public Builder addYearOfSong(int year) {
            this.yearOfSong = year;
            return this;
        }

        public Builder addGenre(String g) {
            this.genre = g;
            return this;
        }

        public Builder checkIndie(boolean is) {
            this.isIndie = is;
            return this;
        }

        public Builder addLyrics(String lyrics) {
            this.lyrics = lyrics;
            return this;
        }

        public Song build() {
            return new Song(this);
        }

    }

    private Song(Builder builder) {
        artist = builder.artist;
        songTitle = builder.songTitle;

        songLength = builder.songLength;
        yearOfSong = builder.yearOfSong;

        genre = builder.genre;
        isIndie = builder.isIndie;
        lyrics = builder.lyrics;

    }


    public String getArtist() {
        return this.artist;
    }

    public String getSongTitle() {
        return this.songTitle;
    }

    public int getYearofSong() {
        return this.yearOfSong;
    }

    public int getSongLength() {
        return this.songLength;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getLyrics() {
        return this.lyrics;
    }

    public boolean getIndie() {
        return this.isIndie;
    }



}
