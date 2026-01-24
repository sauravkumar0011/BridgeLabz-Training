package com.exception.customexception;

class InvalidAgeException extends RuntimeException{

	public InvalidAgeException(String message)
	{
		super(message);
	}
}
