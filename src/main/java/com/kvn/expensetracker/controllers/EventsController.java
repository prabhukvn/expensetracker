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
import org.springframework.web.bind.annotation.RequestMapping;

import com.kvn.expensetracker.entities.EventEntity;
import com.kvn.expensetracker.entities.EventItemEntity;
import com.kvn.expensetracker.services.EventService;

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

	/**
	 * Creates the event.
	 *
	 * @param event
	 *            the event
	 * @return the response entity
	 */
	@PostMapping(value = "/events", produces = "application/json")
	public ResponseEntity<EventEntity> createEvent(EventEntity event) {

		// TODO validate event
		EventEntity createEvent = eventService.createEvent(event);
		return new ResponseEntity<>(createEvent, HttpStatus.CREATED);

	}

	/**
	 * Update event.
	 *
	 * @param event
	 *            the event
	 * @return the response entity
	 */
	@PutMapping(value = "/events", produces = "application/json")
	public ResponseEntity<EventEntity> updateEvent(EventEntity event) {

		// TODO validate event
		EventEntity createEvent = eventService.updateEvent(event);
		return new ResponseEntity<>(createEvent, HttpStatus.OK);

	}

	/**
	 * Gets the all event.
	 *
	 * @return the all event
	 */
	@GetMapping(value = "/events", produces = "application/json")
	public ResponseEntity<List<EventEntity>> getAllEvent() {

		// TODO validate event
		List<EventEntity> createEvent = eventService.getAllEvents();
		return new ResponseEntity<>(createEvent, HttpStatus.OK);

	}

	/**
	 * Gets the event.
	 *
	 * @param eventId
	 *            the event id
	 * @return the event
	 */
	@GetMapping(value = "/events/{eventId}", produces = "application/json")
	public ResponseEntity<EventEntity> getEvent(@PathVariable("eventId") String eventId) {

		// TODO validate event
		EventEntity createEvent = eventService.getEvent(Integer.parseInt(eventId));
		if (createEvent != null) {
			return new ResponseEntity<>(createEvent, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	/**
	 * Gets the event items.
	 *
	 * @param eventId
	 *            the event id
	 * @return the event items
	 */
	@GetMapping(value = "/events/{eventId}/eventItems", produces = "application/json")
	public ResponseEntity<List<EventItemEntity>> getEventItems(@PathVariable("eventId") String eventId) {

		// TODO validate event
		EventEntity event = eventService.getEvent(Integer.parseInt(eventId));
		if (null != event && null != event.getEventItems() && !event.getEventItems().isEmpty()) {
			List<EventItemEntity> eventItems = event.getEventItems();
			if (eventItems != null) {
				return new ResponseEntity<>(eventItems, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}

		} else {
			return null;
		}
	}

}
