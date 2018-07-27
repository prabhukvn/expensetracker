package com.kvn.expensetracker.domainentities;

// TODO: Auto-generated Javadoc
/**
 * The Class MemberCost.
 */
public class MemberCost {

	/** The member name. */
	String memberName;
	
	/** The event item name. */
	String eventItemName;
	
	/** The tottal event amount. */
	double tottalEventAmount;
	
	/** The amount spent. */
	double amountSpent;
	
	/** The amount due. */
	double amountDue;

	/**
	 * Gets the member name.
	 *
	 * @return the member name
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * Sets the member name.
	 *
	 * @param memberName the new member name
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * Gets the event item name.
	 *
	 * @return the event item name
	 */
	public String getEventItemName() {
		return eventItemName;
	}

	/**
	 * Sets the event item name.
	 *
	 * @param eventItemName the new event item name
	 */
	public void setEventItemName(String eventItemName) {
		this.eventItemName = eventItemName;
	}

	/**
	 * Gets the amount spent.
	 *
	 * @return the amount spent
	 */
	public double getAmountSpent() {
		return amountSpent;
	}

	/**
	 * Sets the amount spent.
	 *
	 * @param amountSpent the new amount spent
	 */
	public void setAmountSpent(double amountSpent) {
		this.amountSpent = amountSpent;
	}

	/**
	 * Gets the amount due.
	 *
	 * @return the amount due
	 */
	public double getAmountDue() {
		return amountDue;
	}

	/**
	 * Sets the amount due.
	 *
	 * @param amountDue the new amount due
	 */
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}

}
