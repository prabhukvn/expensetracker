package com.kvn.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.domainentities.EventItem;

/**
 * The Interface EventItemRepository.
 */

public interface EventItemRepository extends JpaRepository<EventItem, Integer>{
	
}
