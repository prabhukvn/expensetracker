package com.kvn.expensetracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.domainentities.EventToEventItem;

public interface EventToEventItemRepository extends JpaRepository<EventToEventItem, Integer>{

	List<EventToEventItem> findByEventId(int eventId);

	
}
