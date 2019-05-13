package com.sda.trestian.radiomusicdatabase.exception;

public class InvalidArtistNameException extends InvalidSongException{

	public InvalidArtistNameException() {
		super();
	}
	
	public InvalidArtistNameException(String message) {
		super(message);
	}
}
