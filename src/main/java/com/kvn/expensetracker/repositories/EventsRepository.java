package com.kvn.expensetracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kvn.expensetracker.domainentities.Event;
import com.kvn.expensetracker.domainentities.EventItem;

public interface EventsRepository extends JpaRepository<Event, Integer> {
	

}
