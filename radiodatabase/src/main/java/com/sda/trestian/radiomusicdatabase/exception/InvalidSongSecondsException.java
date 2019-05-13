package com.sda.trestian.radiomusicdatabase.exception;

public class InvalidSongSecondsException extends InvalidSongLengthException{

	public InvalidSongSecondsException() {
		super();
	}
	
	public InvalidSongSecondsException(String message) {
		super(message);
	}
}
