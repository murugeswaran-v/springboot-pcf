package com.example.springboot.demo.exception;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;

/**
 * @author Murugeswaran
 *
 */

@ControllerAdvice
public class EmployeeExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException(Exception exc){
		EmployeeErrorResponse error = new EmployeeErrorResponse();
		
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
				
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<EmployeeErrorResponse> handleConstrainViolationException(ConstraintViolationException  exc){
		EmployeeErrorResponse error = new EmployeeErrorResponse();
		
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		List<String> details = exc.getConstraintViolations()
                .parallelStream()
                .map(e -> e.getMessage())
                .collect(Collectors.toList());
		error.setMessage(details.toString());
		error.setTimeStamp(System.currentTimeMillis());
			
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleEmployeeNotFoundException(EmployeeNotFoundException exc){
		EmployeeErrorResponse error = new EmployeeErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		// return ResponseEntity		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleRestClientException(RestClientException exc){
		EmployeeErrorResponse error = new EmployeeErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage("city not found");
		error.setTimeStamp(System.currentTimeMillis());
		
		// return ResponseEntity		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		
	}
}
