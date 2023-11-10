package com.ty.game_wing_springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.ty.game_wing_springboot.entity.ResponseStructure;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(NoSuchUserFoundException.class)
	public ResponseEntity<ResponseStructure<String>> catchNoSuchUserFoundException(NoSuchUserFoundException exception) {
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatus(HttpStatus.NO_CONTENT.value());
		structure.setMessage("Failed");
		structure.setData(exception.getMessage());

		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.CREATED);
	}
	
	

}
