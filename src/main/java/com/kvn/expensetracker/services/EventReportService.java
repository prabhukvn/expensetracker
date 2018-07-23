package com.kvn.expensetracker.services;

import com.kvn.expensetracker.domainentities.EventReport;

public interface EventReportService {

	EventReport generateReport(String eventId);

}
