package com.kvn.expensetracker.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.repositories.EventItemRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class EventItemServiceImpl.
 */
@Service
public class EventItemServiceImpl implements EventItemService {

	/** The event item repository. */
	@Autowired
	private EventItemRepository eventItemRepository;

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventItemService#create(com.kvn.expensetracker.domainentities.EventItem)
	 */
	@Override
	@Transactional
	public EventItem create(EventItem eventItem) {
		return eventItemRepository.save(eventItem);
	}

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventItemService#findAll()
	 */
	@Override
	public List<EventItem> findAll() {
		// TODO Auto-generated method stub
		return eventItemRepository.findAll();
	}
	/**
	 * Find all Event Items for an event
	 */

}
