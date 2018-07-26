package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.entities.EventEntity;

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
	public EventEntity createEvent(EventEntity event);

	/**
	 * Update event.
	 *
	 * @param event the event
	 * @return the event
	 */
	EventEntity updateEvent(EventEntity event);

	/**
	 * Gets the all events.
	 *
	 * @return the all events
	 */
	public List<EventEntity> getAllEvents();

	/**
	 * Gets the event.
	 *
	 * @param eventId the event id
	 * @return the event
	 */
	public EventEntity getEvent(Integer eventId);

}
