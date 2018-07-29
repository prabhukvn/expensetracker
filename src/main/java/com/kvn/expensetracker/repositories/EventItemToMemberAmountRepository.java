package com.kvn.expensetracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.domainentities.EventItemToMemberAmount;

public interface EventItemToMemberAmountRepository extends JpaRepository<EventItemToMemberAmount, Integer>{

	/**
	 * Find by event item id.
	 *
	 * @param id the id
	 * @return the event item to member amount
	 */
	List<EventItemToMemberAmount> findByEventItemId(int id);

}
