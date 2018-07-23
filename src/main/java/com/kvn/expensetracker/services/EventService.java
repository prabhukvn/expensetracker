package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.domainentities.Event;

// TODO: Auto-generated Javadoc
/**
 * The Interface EventService.
 */
public interface EventService {

	/**
	 * Creates the event.
	 *
	 * @param event the event
	 * @return the event
	 */
	public Event createEvent(Event event);

	/**
	 * Update event.
	 *
	 * @param event the event
	 * @return the event
	 */
	Event updateEvent(Event event);

	/**
	 * Gets the all events.
	 *
	 * @return the all events
	 */
	public List<Event> getAllEvents();

	/**
	 * Gets the event.
	 *
	 * @param eventId the event id
	 * @return the event
	 */
	public Event getEvent(Integer eventId);

}
