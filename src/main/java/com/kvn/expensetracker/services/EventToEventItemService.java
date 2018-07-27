package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.domainentities.EventToEventItem;

// TODO: Auto-generated Javadoc
/**
 * The Interface EventToEventItemService.
 */
public interface EventToEventItemService {

	/**
	 * Gets the event items.
	 *
	 * @param parseInt the parse int
	 * @return the event items
	 */
	List<EventItem> getEventItems(int parseInt);

	/**
	 * Creates the.
	 *
	 * @param eventId the event id
	 * @param eventItemId the event item id
	 * @return the event to event item
	 */
	EventToEventItem create(String eventId, String eventItemId);

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<EventToEventItem> findAll();

}
