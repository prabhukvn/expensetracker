package com.kvn.expensetracker.framework.exceptions;

import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kvn.expensetracker.vo.ExceptionResponse;

/**
 * The Class GlobalExceptionHandler.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	/** The logger. */
	Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

	/**
	 * Handle exception.
	 *
	 * @param exception the exception
	 * @return the response entity
	 */
	@ExceptionHandler(BusinessExceptions.class)
	public ResponseEntity<String> handleException(BusinessExceptions exception) {
		String exceptionJason = null;
		try {
			ExceptionResponse exceptionResponse = new ExceptionResponse();
			exceptionResponse.setMessage(exception.getMessage());
			exceptionResponse.setMessageId(exception.getMessageId());
			exceptionJason = new ObjectMapper().writeValueAsString(exceptionResponse);
		} catch (JsonProcessingException e) {
			logger.error("SERVICE_EXCEPTION", e);
		}
		return new ResponseEntity<String>(exceptionJason, exception.getHttpStatus());

	}
	
	/**
	 * Other than Business Exceptions
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception exception){
	
		String exceptionJason = null;
		try {
			ExceptionResponse exceptionResponse = new ExceptionResponse();
			exceptionResponse.setMessage(exception.getMessage());
			exceptionResponse.setMessageId(HttpStatus.INTERNAL_SERVER_ERROR.toString());
			exceptionJason = new ObjectMapper().writeValueAsString(exceptionResponse);
		} catch (JsonProcessingException e) {
			logger.error("SERVICE_EXCEPTION", e);
		}
		return new ResponseEntity<String>(exceptionJason, HttpStatus.INTERNAL_SERVER_ERROR);

	}
	/**
	 * Other than Business Exceptions
	 */
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> handleException(RuntimeException exception){
	
		String exceptionJason = null;
		try {
			ExceptionResponse exceptionResponse = new ExceptionResponse();
			exceptionResponse.setMessage(exception.getMessage());
			exceptionResponse.setMessageId(HttpStatus.INTERNAL_SERVER_ERROR.toString());
			exceptionJason = new ObjectMapper().writeValueAsString(exceptionResponse);
		} catch (JsonProcessingException e) {
			logger.error("SERVICE_EXCEPTION", e);
		}
		return new ResponseEntity<String>(exceptionJason, HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
