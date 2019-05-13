package com.sda.OnlineRadio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Instert your new song according to the pattern :artist,song,minutes,seconds");
		int numberOfSongs = Integer.parseInt(scanner.nextLine());
		String[] songs = new String[numberOfSongs];

		for (int i = 0; i < numberOfSongs; i++) {

			songs[i] = scanner.nextLine();
		}
		for (int i = 0; i < numberOfSongs; i++) {
			String[] songData = songs[i].split(";");
			String artist = songData[0];
			String title = songData[1];
			String lenght = songData[2];
			String[] songDuration = lenght.split(":");
			int lenghtMin = Integer.parseInt(songDuration[0]);
			int lenghtSec = Integer.parseInt(songDuration[1]);
			System.out.println(artist + " " + title + " " + lenght + " ");
			System.out.println(artist);

		}
	}

}
