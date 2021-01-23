package com.example.demo.exceptionhandler;

public class UserNotFoundExceptioncreate extends Exception {
	 private static final long serialVersionUID=1l;
	
	 private String message;

	public UserNotFoundExceptioncreate(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
