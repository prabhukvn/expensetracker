package com.kvn.expensetracker.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.domainentities.Event;
import com.kvn.expensetracker.repositories.EventsRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class EventServiceImpl.
 */
@Service
public class EventServiceImpl implements EventService {

	/** The events repository. */
	@Autowired
	private EventsRepository eventsRepository;
	
	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventService#createEvent(com.kvn.expensetracker.domainentities.Event)
	 */
	@Autowired


	@Override
	@Transactional
	public Event createEvent(Event event) {
		return eventsRepository.save(event);
	}

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventService#updateEvent(com.kvn.expensetracker.domainentities.Event)
	 */
	@Override
	public Event updateEvent(Event event) {
		return eventsRepository.save(event);
	}

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventService#getAllEvents()
	 */
	@Override
	public List<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return eventsRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventService#getEvent(java.lang.Integer)
	 */
	@Override
	public Event getEvent(Integer eventId) {
		// TODO Auto-generated method stub
		return eventsRepository.findById(eventId).get();
	}

}
