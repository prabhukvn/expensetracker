package com.kvn.expensetracker.domain;

import com.kvn.expensetracker.entities.EventItemToMemberAmountEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class EventReport.
 */
public class EventReport {

	/** The event name. */
	private String eventName;

	/** The event item to member amount. */
	private EventItemToMemberAmountEntity eventItemToMemberAmount;

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

	/**
	 * Gets the event item to member amount.
	 *
	 * @return the event item to member amount
	 */
	/*
	 * public List<MemberCost> getMemberCostList() { return memberCostList; } public
	 * void setMemberCostList(List<MemberCost> memberCostList) { this.memberCostList
	 * = memberCostList; }
	 */
	public EventItemToMemberAmountEntity getEventItemToMemberAmount() {
		return eventItemToMemberAmount;
	}

	/**
	 * Sets the event item to member amount.
	 *
	 * @param eventItemToMemberAmount the new event item to member amount
	 */
	public void setEventItemToMemberAmount(EventItemToMemberAmountEntity eventItemToMemberAmount) {
		this.eventItemToMemberAmount = eventItemToMemberAmount;
	}

}
