package com.kvn.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.entities.EventEntity;

/**
 * The Interface EventsRepository.
 */

public interface EventsRepository extends JpaRepository<EventEntity, Integer> {

}
