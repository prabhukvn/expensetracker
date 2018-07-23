package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.domainentities.EventItem;

// TODO: Auto-generated Javadoc
/**
 * The Interface EventItemService.
 */
public interface EventItemService {

	/**
	 * Creates the.
	 *
	 * @param eventItem the event item
	 * @return the event item
	 */
	EventItem create(EventItem eventItem);

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<EventItem> findAll();

}
