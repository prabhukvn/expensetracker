package com.kvn.expensetracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.repositories.EventItemRepository;

@Service
public class EventItemServiceImpl implements EventItemService {

	@Autowired
	private EventItemRepository eventItemRepository;
	@Override
	public EventItem create(EventItem eventItem) {
		return eventItemRepository.save(eventItem);
	}
	
	@Override
	public List<EventItem> findAll() {
		// TODO Auto-generated method stub
		 return eventItemRepository.findAll();
	}
	/**
	 * Find all Event Items for an event
	 */
	
}
