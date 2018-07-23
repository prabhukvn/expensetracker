package com.kvn.expensetracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.services.EventItemService;

@RestController
@RequestMapping("/api")
public class EventItemsController {

	@Autowired
	private EventItemService eventItemService;
	
	@PostMapping(value="/eventItems", produces = "application/json", consumes="application/json")
	public ResponseEntity<EventItem> create(EventItem eventItem) {
		
		EventItem newEventItem = eventItemService.create(eventItem);
		return new ResponseEntity<>(newEventItem, HttpStatus.CREATED);
		
		
	}
//	@PostMapping(value="/eventItems", produces = "application/json")
//	public ResponseEntity<EventItem> update(EventItem eventItem) {
//		
//		EventItem newEventItem = eventItemService.create(eventItem);
//		return new ResponseEntity<>(newEventItem, HttpStatus.OK);
//		
//		
//	}
	
	@GetMapping(value="/eventItems", produces="application/json")
	public ResponseEntity<List<EventItem>> getAllEventItems(){
		
		List<EventItem> eventItems = eventItemService.findAll();
		return new ResponseEntity<List<EventItem>>(eventItems, HttpStatus.OK);
	}
	//TODO
	//GET PUT DELET will follow
}
