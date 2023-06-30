package com.ravi.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleUNF(UserNotFoundException e){
		String exMsg = e.getMessage();
		
		ErrorInfo info = new ErrorInfo();
		info.setCode("SBIEX001");//management decide the error code
		info.setMsg(exMsg);
		info.setWhen(LocalDate.now());
		
		return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e){
		String exMsg = e.getMessage();
		
		ErrorInfo info = new ErrorInfo();
		info.setCode("SBIEX003");
		info.setMsg(exMsg);
		info.setWhen(LocalDate.now());
		
		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
