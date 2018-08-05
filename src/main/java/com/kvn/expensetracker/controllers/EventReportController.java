package com.kvn.expensetracker.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.metrics.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kvn.expensetracker.domainentities.EventReport;
import com.kvn.expensetracker.framework.performance.EnablePerformanceLogging;
import com.kvn.expensetracker.services.EventReportService;

// TODO: Auto-generated Javadoc
/**
 * The Class EventReportController.
 */
@RestController
@RequestMapping("/api")
@Timed
public class EventReportController {
	
	/** The logger. */
	public static Logger LOGGER = LoggerFactory.getLogger(EventReportController.class);

	/** The event report service. */
	@Autowired
	private EventReportService eventReportService;

	/**
	 * Gets the report.
	 *
	 * @param eventId the event id
	 * @return the report
	 */

	@GetMapping("/report/event/{eventId}")
	public ResponseEntity<EventReport> getReport(@PathVariable("eventId") String eventId) {
		LOGGER.debug(">>>>>>>>Generating Report for event {}>>>>>>>>", eventId);
		EventReport eventReport = eventReportService.generateReport(eventId);
		return new ResponseEntity<EventReport>(eventReport, HttpStatus.OK);

	}
}
