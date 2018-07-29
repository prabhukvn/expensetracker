package com.kvn.expensetracker.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import com.kvn.expensetracker.domainentities.Event;
import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.domainentities.EventItemToMemberAmount;
import com.kvn.expensetracker.domainentities.EventReport;
import com.kvn.expensetracker.domainentities.EventToEventItem;
import com.kvn.expensetracker.repositories.EventItemRepository;
import com.kvn.expensetracker.repositories.EventItemToMemberAmountRepository;
import com.kvn.expensetracker.repositories.EventToEventItemRepository;
import com.kvn.expensetracker.repositories.EventsRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class EventReportServiceImpl.
 */
@Service
public class EventReportServiceImpl implements EventReportService {

	/** The event to event item repository. */
	@Autowired
	private EventToEventItemRepository eventToEventItemRepository;
	
	/** The events repository. */
	@Autowired
	private EventsRepository eventsRepository;
	
	/** The event item repository. */
	@Autowired
	private EventItemRepository eventItemRepository;
	
	/** The event item to member amount repository. */
	@Autowired
	private EventItemToMemberAmountRepository eventItemToMemberAmountRepository;

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventReportService#generateReport(java.lang.String)
	 */
	@Override
	@Transactional
	public EventReport generateReport(String eventId) {

		EventReport eventReport = new EventReport();
		int eId = Integer.parseInt(eventId);
		Event event = eventsRepository.findById(eId).get();
		if (null != event) {
			eventReport.setEventName(event.getName());
			List<EventToEventItem> eventToEventItems = eventToEventItemRepository.findByEventId(eId);
			eventToEventItems.forEach(eventToEventItem -> {
				EventItem eventItem = eventItemRepository.findById(eventToEventItem.getEventItemId()).get();
				if (null != eventItem) {
					List<EventItemToMemberAmount> eventItemToMemberAmounts = eventItemToMemberAmountRepository
							.findByEventItemId(eventItem.getId());
					eventItemToMemberAmounts.forEach(eventItemToMemberAmount->{
						eventReport.getEventItemToMemberAmounts().add(eventItemToMemberAmount);
					});
				
				}
			});
		}
		return eventReport;
	}
}
