package com.kvn.expensetracker.framework.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.metrics.instrument.Meter;
import org.springframework.metrics.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MeterRegistriesController {

	@Autowired
	private MeterRegistry meterRegistry;
	@GetMapping(value="/meters",produces="application/json")
	public ResponseEntity<Collection<Meter>> meters() {
		
		Collection<Meter> meters = meterRegistry.getMeters();
		return new ResponseEntity<Collection<Meter>>(meters, HttpStatus.OK);
	}
}
