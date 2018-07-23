package com.kvn.expensetracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.domainentities.Event;
import com.kvn.expensetracker.repositories.EventItemRepository;
import com.kvn.expensetracker.repositories.EventsRepository;

@Service
public class EventServiceImpl implements EventService{

	@Autowired
	private EventsRepository eventsRepository;
	@Autowired
	private EventItemRepository eventItemRepository;
	
	@Override
	public Event createEvent(Event event) {
		return eventsRepository.save(event);
	}
	@Override
	public Event updateEvent(Event event) {
		return eventsRepository.save(event);
	}
	
	@Override
	public List<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return eventsRepository.findAll();
	}
	@Override
	public Event getEvent(Integer eventId) {
		// TODO Auto-generated method stub
		return eventsRepository.findById(eventId).get();
	}
	
	
}
