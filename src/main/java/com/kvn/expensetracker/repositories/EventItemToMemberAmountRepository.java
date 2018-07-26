package com.kvn.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.entities.EventItemToMemberAmountEntity;

public interface EventItemToMemberAmountRepository extends JpaRepository<EventItemToMemberAmountEntity, Integer>{

	/**
	 * Find by event item id.
	 *
	 * @param id the id
	 * @return the event item to member amount
	 */
	EventItemToMemberAmountEntity findByEventItemId(int id);

}
