package com.sda.trestian.radiomusicdatabase.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sda.trestian.radiomusicdatabase.exception.InvalidArtistNameException;
import com.sda.trestian.radiomusicdatabase.exception.InvalidSongException;
import com.sda.trestian.radiomusicdatabase.exception.InvalidSongMinutesException;
import com.sda.trestian.radiomusicdatabase.exception.InvalidSongNameException;
import com.sda.trestian.radiomusicdatabase.exception.InvalidSongSecondsException;
import com.sda.trestian.radiomusicdatabase.model.Song;
import com.sda.trestian.radiomusicdatabase.processor.ConsoleSongProcessor;
import com.sda.trestian.radiomusicdatabase.processor.FileSongProcessor;
import com.sda.trestian.radiomusicdatabase.processor.IProcessor;
import com.sda.trestian.radiomusicdatabase.utils.FileUtils;
import com.sda.trestian.radiomusicdatabase.utils.InputUtils;
import com.sda.trestian.radiomusicdatabase.validator.SongValidator;

public class MainRadio {

	public static void main(String[] args) throws IOException {

		// Read number of songs --> int
		//int numberOfSongs = InputUtils.readNumberOfSongs();
		//int numberOfSongs = FileUtils.readNumberOfSongsFromFile();
		IProcessor songProcessor;// new FileSongProcessor();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert process type file/console :");
		String type = scan.nextLine();
		if (type.equals("file")) {
			songProcessor = new FileSongProcessor();
		} else if (type.equals("console")) {
			songProcessor = new ConsoleSongProcessor();
		} else {
			System.out.println("error");
			return;
		}
		int numberOfSongs = songProcessor.readNumberOfSongs();
				
		List<Song> songs = new ArrayList<>();
		System.out.println("Insert " +numberOfSongs + " songs");
		// repeat numberOfSongs times to read a Song
		
		for (int i =0; i< numberOfSongs; i++) {
			//read a song
			String songDetails = FileUtils.readSongFromFile(i);
								 InputUtils.readSong();
			// ABBA;abadaba;3:44
			String[] detailsArray = songDetails.split("[;:]");
			int minutes = Integer.parseInt(detailsArray[2]);
			int seconds = Integer.parseInt(detailsArray[3]);
			Song song = new Song(detailsArray[0], detailsArray[1],
					minutes, seconds);
			try {
				SongValidator.validateSong(song);
				System.out.println("Song added");
				songs.add(song);
			} catch(InvalidSongException e) {
				System.out.println(e.getMessage());
			} 
			// validate the song
		}

		// print number of songs added
		System.out.println("Songs added: "+ songs.size());
		
		// print total length of playlist
		
		int totalLengthHours = 0;
		int totalLengthMinutes = 0;
		int totalLengthSeconds = 0;
		
		for (Song song : songs) {
			totalLengthSeconds += song.getSeconds();
			totalLengthMinutes += song.getMinutes();
		}
		
		if (totalLengthSeconds > 59) {
			totalLengthMinutes += totalLengthSeconds / 60 ;
			totalLengthSeconds = totalLengthSeconds % 60;	
		}
		
		if (totalLengthMinutes > 59) {
			totalLengthHours += totalLengthMinutes /60;
			totalLengthMinutes = totalLengthMinutes % 60;
		}

		System.out.println("Playlist length : "+ totalLengthHours +"h " + totalLengthMinutes +
				"m " +totalLengthSeconds + "s ");
	}
}
