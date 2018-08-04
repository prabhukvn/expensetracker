package com.kvn.expensetracker.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kvn.expensetracker.framework.exceptions.BusinessExceptions;

@RestController
@RequestMapping("/api")
public class SendExceptionController {

	@RequestMapping("/exception")
	public ResponseEntity<String> throwException() {
		throw new BusinessExceptions("Test Message", "MESSAGE_1", HttpStatus.BAD_REQUEST, new Exception());
	}
}
