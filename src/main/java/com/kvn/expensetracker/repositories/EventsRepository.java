package com.kvn.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.domainentities.Event;

/**
 * The Interface EventsRepository.
 */

public interface EventsRepository extends JpaRepository<Event, Integer> {

}
