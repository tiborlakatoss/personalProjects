package com.sda.trestian.radiomusicdatabase.processor;

import java.util.Scanner;

public class ConsoleSongProcessor implements IProcessor {

	@Override
	public int readNumberOfSongs() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert number: ");
		String numberOfSongsAsString = scanner.nextLine();
		try {
			int numberOfSongs = Integer.parseInt(numberOfSongsAsString);
			return numberOfSongs;
		} catch (NumberFormatException e) {
			return 0;
		}

	}

}
