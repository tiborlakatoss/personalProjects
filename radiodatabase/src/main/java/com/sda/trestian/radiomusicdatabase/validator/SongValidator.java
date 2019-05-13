package com.sda.trestian.radiomusicdatabase.validator;

import com.sda.trestian.radiomusicdatabase.exception.InvalidArtistNameException;
import com.sda.trestian.radiomusicdatabase.exception.InvalidSongException;
import com.sda.trestian.radiomusicdatabase.exception.InvalidSongMinutesException;
import com.sda.trestian.radiomusicdatabase.exception.InvalidSongNameException;
import com.sda.trestian.radiomusicdatabase.exception.InvalidSongSecondsException;
import com.sda.trestian.radiomusicdatabase.model.Song;

public class SongValidator {

	
	public static boolean validateSong(Song song) throws InvalidSongException{
		// validate song artist length
		validateSongArtist(song.getArtist());
		// validate song name
		validateSongName(song.getName());
		// validate minutes
		validateSongMinutes(song.getMinutes());
		// validate seconds
		validateSongSeconds(song.getSeconds());
		return true;
	}
	
	private static boolean validateSongSeconds(int seconds) throws InvalidSongSecondsException{
		if (seconds < 0 || seconds > 59) {
			throw new InvalidSongSecondsException("Song seconds should be between 0 and 59");
		}
		return true;
	}
	
	private static boolean validateSongMinutes(int minutes) throws InvalidSongMinutesException{
		if (minutes < 0 || minutes > 14) {
			throw new InvalidSongMinutesException("Song minutes should be between 0 and 14");
		}
		return true;
	}

	private static boolean validateSongArtist(String artist) throws InvalidArtistNameException{
		if (artist.length() < 3 || artist.length() > 20) {
			throw new InvalidArtistNameException("Artist name should be between 3 and 20");
		}
		return true;
	}
	
	private static boolean validateSongName(String songName) throws InvalidSongNameException{
		if (songName.length() < 3 || songName.length() > 30) {
			throw new InvalidSongNameException("Song name length should be between 3 and 30");
		}
		return true;
	}
}
