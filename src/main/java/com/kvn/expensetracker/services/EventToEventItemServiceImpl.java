package com.kvn.expensetracker.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.domainentities.EventToEventItem;
import com.kvn.expensetracker.repositories.EventItemRepository;
import com.kvn.expensetracker.repositories.EventToEventItemRepository;

@Service
public class EventToEventItemServiceImpl implements EventToEventItemService {

	@Autowired
	private EventToEventItemRepository eventToEventItemRepository;

	@Autowired
	private EventItemRepository eventItemRepository;

	@Override
	public List<EventItem> getEventItems(int eventId) {
		// TODO Auto-generated method stub
		List<EventToEventItem> eventToEventItems = eventToEventItemRepository.findByEventId(eventId);
		List<EventItem> eventItems = new ArrayList<>();
		eventToEventItems.forEach(eventToEventItem -> {
			eventItems.add(eventItemRepository.findById(eventToEventItem.getEventItemId()).get());
		});

		return eventItems;

	}

	@Override
	public EventToEventItem create(String eventId, String eventItemId) {
		// TODO Auto-generated method stub
		EventToEventItem eit = new EventToEventItem();
		if (null != eventId && null != eventItemId) {
			eit.setEventId(Integer.parseInt(eventId));
			eit.setEventItemId(Integer.parseInt(eventItemId));
			return eventToEventItemRepository.save(eit);
		} else {
			return eit;
		}

	}
	
	@Override
	public List<EventToEventItem> findAll() {
		// TODO Auto-generated method stub
		return eventToEventItemRepository.findAll();
	}
}
