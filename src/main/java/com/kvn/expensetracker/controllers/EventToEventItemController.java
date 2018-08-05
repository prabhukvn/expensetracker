package com.kvn.expensetracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.metrics.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kvn.expensetracker.domainentities.EventToEventItem;
import com.kvn.expensetracker.services.EventToEventItemService;

// TODO: Auto-generated Javadoc
/**
 * The Class EventToEventItemController.
 */
@RestController
@RequestMapping("/api")
@Timed
public class EventToEventItemController {

	/** The event to event itemt service. */
	@Autowired
	private EventToEventItemService eventToEventItemtService;

	/**
	 * Attach event item to event.
	 *
	 * @param eventId the event id
	 * @param eventItemId the event item id
	 * @return the response entity
	 */
	@PostMapping(value = "/eventtoeventitem/event/{eventId}/eventitem/{eventItemId}", produces = "application/json")
	public ResponseEntity<EventToEventItem> attachEventItemToEvent(@PathVariable("eventId") String eventId,
			@PathVariable("eventItemId") String eventItemId) {
		EventToEventItem eventToEventItem = eventToEventItemtService.create(eventId, eventItemId);
		ResponseEntity<EventToEventItem> eventToeventItemResponse = new ResponseEntity<EventToEventItem>(
				eventToEventItem, HttpStatus.OK);
		return eventToeventItemResponse;
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@GetMapping(value = "/eventtoeventitem")
	public ResponseEntity<List<EventToEventItem>> getAll() {
		List<EventToEventItem> allEventToEventItems = eventToEventItemtService.findAll();
		return new ResponseEntity<List<EventToEventItem>>(allEventToEventItems, HttpStatus.OK);
	}

}
