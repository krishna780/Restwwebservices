package com.example.demo.exceptionhandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler
	public String handleImplementedException(UserNotFoundExceptioncreate exception) {
		// TODO Auto-generated constructor stub
		return exception.getMessage();
	}
}
