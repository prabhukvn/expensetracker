package com.kvn.expensetracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kvn.expensetracker.domainentities.EventToEventItem;
import com.kvn.expensetracker.services.EventToEventItemService;

@RestController
@RequestMapping("/api")
public class EventToEventItemController {

	@Autowired
	private EventToEventItemService eventToEventItemtService;
	
	@PostMapping(value="/eventtoeventitem/event/{eventId}/eventitem/{eventItemId}",produces="application/json")
	public ResponseEntity<EventToEventItem> attachEventItemToEvent(@PathVariable("eventId") String eventId, @PathVariable("eventItemId") String eventItemId){
		EventToEventItem eventToEventItem = eventToEventItemtService.create(eventId,eventItemId);
		ResponseEntity<EventToEventItem> eventToeventItemResponse = new ResponseEntity<EventToEventItem>(eventToEventItem, HttpStatus.OK);
		return eventToeventItemResponse;
	}
	
	@GetMapping(value="/eventtoeventitem")
	public ResponseEntity<List<EventToEventItem>> getAll(){
		List<EventToEventItem> allEventToEventItems = eventToEventItemtService.findAll();
		return new ResponseEntity<List<EventToEventItem>>(allEventToEventItems,HttpStatus.OK);
	}
	
}
