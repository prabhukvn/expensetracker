package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.domainentities.EventItemToMemberAmount;

// TODO: Auto-generated Javadoc
/**
 * The Interface EventItemToMemberAmountService.
 */
public interface EventItemToMemberAmountService {

	/**
	 * Creates the.
	 *
	 * @param itemMemberAmount the item member amount
	 * @return the event item to member amount
	 */
	EventItemToMemberAmount create(EventItemToMemberAmount itemMemberAmount);

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<EventItemToMemberAmount> findAll();

}
