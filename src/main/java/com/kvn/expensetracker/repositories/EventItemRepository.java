package com.kvn.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.entities.EventItemEntity;

/**
 * The Interface EventItemRepository.
 */

public interface EventItemRepository extends JpaRepository<EventItemEntity, Integer>{
	
}
