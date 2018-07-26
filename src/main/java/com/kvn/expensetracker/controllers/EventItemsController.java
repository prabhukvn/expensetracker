package com.kvn.expensetracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kvn.expensetracker.entities.EventItemEntity;
import com.kvn.expensetracker.services.EventItemService;

// TODO: Auto-generated Javadoc
/**
 * The Class EventItemsController.
 */
@RestController
@RequestMapping("/api")
public class EventItemsController {

	/** The event item service. */
	@Autowired
	private EventItemService eventItemService;
	
	/**
	 * Creates the.
	 *
	 * @param eventItem the event item
	 * @return the response entity
	 */
	@PostMapping(value="/eventItems", produces = "application/json", consumes="application/json")
	public ResponseEntity<EventItemEntity> create(EventItemEntity eventItem) {
		
		EventItemEntity newEventItem = eventItemService.create(eventItem);
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
	
	/**
 * Gets the all event items.
 *
 * @return the all event items
 */
@GetMapping(value="/eventItems", produces="application/json")
	public ResponseEntity<List<EventItemEntity>> getAllEventItems(){
		
		List<EventItemEntity> eventItems = eventItemService.findAll();
		return new ResponseEntity<List<EventItemEntity>>(eventItems, HttpStatus.OK);
	}
	//TODO
	//GET PUT DELET will follow
}
