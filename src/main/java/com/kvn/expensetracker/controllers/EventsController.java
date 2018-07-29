/**
 * 
 */
package com.kvn.expensetracker.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kvn.expensetracker.domainentities.Event;
import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.services.EventService;
import com.kvn.expensetracker.services.EventToEventItemService;

// TODO: Auto-generated Javadoc
/**
 * The Class EventsController.
 *
 * @author venkoppu
 */
@Controller
@RequestMapping("/api")
public class EventsController {
	
	/** The logger. */
	public static Logger LOGGER = LoggerFactory.getLogger(EventsController.class);

	/** The event service. */
	@Autowired
	private EventService eventService;

	/** The event to event item service. */
	@Autowired
	private EventToEventItemService eventToEventItemService;

	/**
	 * Creates the event.
	 *
	 * @param event the event
	 * @return the response entity
	 */
	@PostMapping(value = "/events", produces = "application/json")
	public ResponseEntity<Event> createEvent(@RequestBody Event event) {

		// TODO validate event
		Event createEvent = eventService.createEvent(event);
		return new ResponseEntity<>(createEvent, HttpStatus.CREATED);

	}

	/**
	 * Update event.
	 *
	 * @param event the event
	 * @return the response entity
	 */
	@PutMapping(value = "/events/{eventId}", produces = "application/json")
	public ResponseEntity<Event> updateEvent(@PathVariable("eventId") int eventId, @RequestBody Event event) {

		// TODO validate event
		if(eventId!=0) {
			event.setId(eventId);
		}
		Event createEvent = eventService.updateEvent(event);
		return new ResponseEntity<>(createEvent, HttpStatus.OK);

	}

	/**
	 * Gets the all event.
	 *
	 * @return the all event
	 */
	@GetMapping(value = "/events", produces = "application/json")
	public ResponseEntity<List<Event>> getAllEvent() {

		// TODO validate event
		List<Event> createEvent = eventService.getAllEvents();
		return new ResponseEntity<>(createEvent, HttpStatus.OK);

	}

	/**
	 * Gets the event.
	 *
	 * @param eventId the event id
	 * @return the event
	 */
	@GetMapping(value = "/events/{eventId}", produces = "application/json")
	public ResponseEntity<Event> getEvent(@PathVariable("eventId") String eventId) {

		// TODO validate event
		Event createEvent = eventService.getEvent(Integer.parseInt(eventId));
		if (createEvent != null) {
			return new ResponseEntity<>(createEvent, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	/**
	 * Gets the event items.
	 *
	 * @param eventId the event id
	 * @return the event items
	 */
	@GetMapping(value = "/events/{eventId}/eventItems", produces = "application/json")
	public ResponseEntity<List<EventItem>> getEventItems(@PathVariable("eventId") String eventId) {

		// TODO validate event
		List<EventItem> eventItems = eventToEventItemService.getEventItems(Integer.parseInt(eventId));
		if (eventItems != null) {
			return new ResponseEntity<>(eventItems, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

}
