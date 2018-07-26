package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.entities.EventItemEntity;

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
	EventItemEntity create(EventItemEntity eventItem);

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<EventItemEntity> findAll();

}
