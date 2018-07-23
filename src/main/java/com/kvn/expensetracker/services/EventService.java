package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.domainentities.Event;
import com.kvn.expensetracker.domainentities.EventItem;

public interface EventService {

	public Event createEvent(Event event);

	Event updateEvent(Event event);

	public List<Event> getAllEvents();

	public Event getEvent(Integer eventId);

	

}
