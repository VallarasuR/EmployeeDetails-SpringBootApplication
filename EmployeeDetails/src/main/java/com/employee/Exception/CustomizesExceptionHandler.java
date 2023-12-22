package com.employee.Exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizesExceptionHandler extends ResponseEntityExceptionHandler
{

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> exceptionHandler(Exception ex , WebRequest web)
	{
		ExceptionHand handle = new ExceptionHand(new Date(),ex.getMessage(),web.getDescription(true));
		
		return new ResponseEntity<Object>(handle, HttpStatus.NOT_FOUND);
	}
	

	@ExceptionHandler(com.employee.Exception.UserNotFoundException.class)
	public final ResponseEntity<Object> exceptionHandler( com.employee.Exception.UserNotFoundException ex , WebRequest web)
	{
		ExceptionHand handle = new ExceptionHand(new Date(),ex.getMessage(),web.getDescription(true));
		
		return new ResponseEntity<Object>(handle, HttpStatus.NOT_FOUND);
	}


	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub
		return super.handleMethodArgumentNotValid(ex, headers, status, request);
	}
	
	
	
}
