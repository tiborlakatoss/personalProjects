package com.sda.trestian.radiomusicdatabase.utils;

import java.util.Scanner;

public class InputUtils {

	public static int readNumberOfSongs() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert number: ");
		String numberOfSongsAsString = scanner.nextLine();
		int numberOfSongs = Integer.parseInt(numberOfSongsAsString);
		
		return numberOfSongs;
	}
	// checkout move to different branch -b create branch 
	public static String readSong() {
		System.out.println("Insert song: ");
		Scanner scanner = new Scanner(System.in);
		String songDetails = scanner.nextLine();
		return songDetails;
	}
	
}
