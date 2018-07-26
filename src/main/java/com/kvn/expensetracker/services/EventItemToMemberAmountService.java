package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.entities.EventItemToMemberAmountEntity;

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
	EventItemToMemberAmountEntity create(EventItemToMemberAmountEntity itemMemberAmount);

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<EventItemToMemberAmountEntity> findAll();

}
