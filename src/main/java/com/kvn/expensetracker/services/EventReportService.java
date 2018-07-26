package com.kvn.expensetracker.services;

import com.kvn.expensetracker.domain.EventReport;

// TODO: Auto-generated Javadoc
/**
 * The Interface EventReportService.
 */
public interface EventReportService {

	/**
	 * Generate report.
	 *
	 * @param eventId the event id
	 * @return the event report
	 */
	EventReport generateReport(String eventId);

}
