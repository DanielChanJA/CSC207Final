package com.danielchan.august2015question2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class SongTest {

    @Test public void testBuilderPatternInSong() {
        String artist = "Norman Blake";
        String songTitle = "You are my sunshine";
        int songLength = 264;
        int yearOfSong = 2000;

        Song song =
            new Song.Builder(artist, songTitle).addSongLength(songLength)
                .addYearOfSong(yearOfSong).build();

        assertTrue(song.getArtist().equals(artist) && song.getSongTitle()
            .equals(songTitle) && song.getSongLength() == songLength
            && song.getYearofSong() == yearOfSong);
    }


}
