package com.kvn.expensetracker.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.domain.EventReport;
import com.kvn.expensetracker.entities.EventEntity;
import com.kvn.expensetracker.entities.EventItemEntity;
import com.kvn.expensetracker.entities.EventItemToMemberAmountEntity;
import com.kvn.expensetracker.repositories.EventItemRepository;
import com.kvn.expensetracker.repositories.EventItemToMemberAmountRepository;
import com.kvn.expensetracker.repositories.EventsRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class EventReportServiceImpl.
 */
@Service
public class EventReportServiceImpl implements EventReportService {

	
	
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
		EventEntity event = eventsRepository.findById(eId).get();
		if (null != event) {
			eventReport.setEventName(event.getName());
			List<EventItemEntity> eventItems = event.getEventItems();
			eventItems.forEach(eventItem -> {
				
				if (null != eventItem) {
					EventItemToMemberAmountEntity eventItemToMemberAmount = eventItemToMemberAmountRepository
							.findByEventItemId(eventItem.getId());
					eventReport.setEventItemToMemberAmount(eventItemToMemberAmount);
				}
			});
		}
		return eventReport;
	}
}
