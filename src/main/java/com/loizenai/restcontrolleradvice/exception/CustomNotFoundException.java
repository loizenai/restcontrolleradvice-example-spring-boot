package com.loizenai.restcontrolleradvice.exception;

public class CustomNotFoundException extends RuntimeException{

	public CustomNotFoundException(String msg) {
		super(msg);
	}
}