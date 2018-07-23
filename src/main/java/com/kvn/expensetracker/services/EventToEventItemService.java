package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.domainentities.EventToEventItem;

public interface EventToEventItemService {

	List<EventItem> getEventItems(int parseInt);

	EventToEventItem create(String eventId, String eventItemId);

	List<EventToEventItem> findAll();

}
