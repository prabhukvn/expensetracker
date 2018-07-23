package com.kvn.expensetracker.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.domainentities.Event;
import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.domainentities.EventItemToMemberAmount;
import com.kvn.expensetracker.domainentities.EventReport;
import com.kvn.expensetracker.domainentities.EventToEventItem;
import com.kvn.expensetracker.domainentities.MemberCost;
import com.kvn.expensetracker.repositories.EventItemRepository;
import com.kvn.expensetracker.repositories.EventItemToMemberAmountRepository;
import com.kvn.expensetracker.repositories.EventToEventItemRepository;
import com.kvn.expensetracker.repositories.EventsRepository;

@Service
public class EventReportServiceImpl implements EventReportService{
	
	@Autowired
	private EventToEventItemRepository eventToEventItemRepository;
	@Autowired
	private EventsRepository eventsRepository;
	@Autowired
	private EventItemRepository eventItemRepository;
	@Autowired
	private EventItemToMemberAmountRepository eventItemToMemberAmountRepository;

	@Override
	public EventReport generateReport(String eventId) {

		EventReport eventReport = new EventReport();
		int eId = Integer.parseInt(eventId);
		Event event = eventsRepository.findById(eId).get();
		if(null!=event) {
		eventReport.setEventName(event.getName());
		List<EventToEventItem> eventToEventItems = eventToEventItemRepository.findByEventId(eId);
		eventToEventItems.forEach(eventToEventItem->{
			EventItem eventItem = eventItemRepository.findById(eventToEventItem.getEventItemId()).get();
			if(null!=eventItem) {
				EventItemToMemberAmount eventItemToMemberAmount = eventItemToMemberAmountRepository.findByEventItemId(eventItem.getId());
				eventReport.setEventItemToMemberAmount(eventItemToMemberAmount);
			}
		});
		}
		return eventReport;
	}
}
