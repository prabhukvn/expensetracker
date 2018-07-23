package com.kvn.expensetracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.domainentities.EventItem;

public interface EventItemRepository extends JpaRepository<EventItem, Integer>{
	
}
