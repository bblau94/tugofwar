package com.tugofwar;

public class InvalidOrderException extends Exception {
	public InvalidOrderException(String message) {
		super(message);
	}

	public InvalidOrderException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
