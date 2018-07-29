package com.kvn.expensetracker.domainentities;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class EventReport.
 */
public class EventReport {

	/** The event name. */
	private String eventName;

	/** The event item to member amount. */
	private List<EventItemToMemberAmount> eventItemToMemberAmounts = new ArrayList<>();

	/**
	 * Gets the event name.
	 *
	 * @return the event name
	 */
	// private List<MemberCost> memberCostList;
	public String getEventName() {
		return eventName;
	}

	/**
	 * Sets the event name.
	 *
	 * @param eventName the new event name
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public List<EventItemToMemberAmount> getEventItemToMemberAmounts() {
		return eventItemToMemberAmounts;
	}

	public void setEventItemToMemberAmounts(List<EventItemToMemberAmount> eventItemToMemberAmounts) {
		this.eventItemToMemberAmounts = eventItemToMemberAmounts;
	}

	

}
