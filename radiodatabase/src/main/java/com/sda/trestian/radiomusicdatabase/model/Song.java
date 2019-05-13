package com.sda.trestian.radiomusicdatabase.model;

public class Song {

	private String artist;
	private String name;
	private int minutes;
	private int seconds;
	
	public Song(String artist, String name, int minutes, int seconds) {
		super();
		this.artist = artist;
		this.name = name;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	

}
