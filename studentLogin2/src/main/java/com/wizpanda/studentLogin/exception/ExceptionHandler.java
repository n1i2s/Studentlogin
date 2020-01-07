package com.wizpanda.studentLogin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

	 @org.springframework.web.bind.annotation.ExceptionHandler({RuntimeException.class})
	    public ResponseEntity<String> handleRunTimeException(RuntimeException e) {
	        return error(HttpStatus.INTERNAL_SERVER_ERROR, e);
	    }
	    @org.springframework.web.bind.annotation.ExceptionHandler({studentNotFound.class})
	    public ResponseEntity<String> handleNotFoundException(studentNotFound e) {
	        return error(HttpStatus.NOT_FOUND, e);
	    }
	    private ResponseEntity<String> error(HttpStatus status, Exception e) {
	        //log.error("Exception : ", e);
	        return ResponseEntity.status(status).body(e.getMessage());
	    }
}
