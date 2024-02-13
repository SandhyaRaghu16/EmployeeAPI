package com.employee.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.employee.entity.Employee;

@RestControllerAdvice
public class GlobalExceptionHandling {

	@ExceptionHandler(value=NameNotFound.class)
	public ResponseEntity<Object> nameHandler(NameNotFound nf)
	{
		return new ResponseEntity<>(nf.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=NoSuchElementException.class)
	public  ResponseEntity<Object> noSuchHandler(NoSuchElementException ns)
	{
		return new ResponseEntity<>(ns.getMessage(),HttpStatus.NOT_FOUND);
				
	}
}
