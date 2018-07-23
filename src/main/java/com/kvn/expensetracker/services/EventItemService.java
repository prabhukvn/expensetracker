package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.domainentities.EventItem;

public interface EventItemService {

	EventItem create(EventItem eventItem);

	List<EventItem> findAll();


}
