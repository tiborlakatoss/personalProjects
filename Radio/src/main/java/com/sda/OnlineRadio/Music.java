package com.sda.OnlineRadio;

public class Music {

	private String artist;
	private String song;
	private int minutes;
	private int seconds;

	public Music() {
	}

	public Music(String artist, String song, int minutes, int seconds) {
		this.artist = artist;
		this.song = song;
		this.minutes = minutes;
		this.seconds = seconds;

	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
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

	@Override
	public String toString() {
		return "RadioDetails [artist=" + artist + ", song=" + song + ", minutes=" + minutes + ", seconds=" + seconds
				+ "]";
	}

}
