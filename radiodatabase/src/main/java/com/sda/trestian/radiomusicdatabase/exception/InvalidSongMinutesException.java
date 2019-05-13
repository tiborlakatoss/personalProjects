package com.sda.trestian.radiomusicdatabase.exception;

public class InvalidSongMinutesException extends InvalidSongLengthException{

	public InvalidSongMinutesException() {
		super();
	}
	
	public InvalidSongMinutesException(String message) {
		super(message);
	}
}
