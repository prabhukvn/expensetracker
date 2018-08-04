package com.kvn.expensetracker.services;

import com.kvn.expensetracker.domainentities.EventReport;
import com.kvn.expensetracker.framework.performance.EnablePerformanceLogging;

/**
 * The Interface EventReportService.
 */
public interface EventReportService {

	/**
	 * Generate report.
	 *
	 * @param eventId
	 *            the event id
	 * @return the event report
	 */
	@EnablePerformanceLogging
	EventReport generateReport(String eventId);

}
