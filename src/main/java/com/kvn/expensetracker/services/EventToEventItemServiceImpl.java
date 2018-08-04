package com.kvn.expensetracker.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.domainentities.EventToEventItem;
import com.kvn.expensetracker.repositories.EventItemRepository;
import com.kvn.expensetracker.repositories.EventToEventItemRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class EventToEventItemServiceImpl.
 */
@Service
public class EventToEventItemServiceImpl implements EventToEventItemService {

	/** The event to event item repository. */
	@Autowired
	private EventToEventItemRepository eventToEventItemRepository;

	/** The event item repository. */
	@Autowired
	private EventItemRepository eventItemRepository;

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventToEventItemService#getEventItems(int)
	 */
	@Override
	public List<EventItem> getEventItems(int eventId) {
		List<EventToEventItem> eventToEventItems = eventToEventItemRepository.findByEventId(eventId);
		List<EventItem> eventItems = new ArrayList<>();
		eventToEventItems.forEach(eventToEventItem -> {
			eventItems.add(eventItemRepository.findById(eventToEventItem.getEventItemId()).get());
		});

		return eventItems;

	}

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventToEventItemService#create(java.lang.String, java.lang.String)
	 */
	@Override
	@Transactional
	public EventToEventItem create(String eventId, String eventItemId) {
		EventToEventItem eit = new EventToEventItem();
		if (null != eventId && null != eventItemId) {
			eit.setEventId(Integer.parseInt(eventId));
			eit.setEventItemId(Integer.parseInt(eventItemId));
			return eventToEventItemRepository.save(eit);
		} else {
			return eit;
		}

	}

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventToEventItemService#findAll()
	 */
	@Override
	public List<EventToEventItem> findAll() {
		// TODO Auto-generated method stub
		return eventToEventItemRepository.findAll();
	}
}
