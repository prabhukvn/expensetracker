package com.kvn.expensetracker.domainentities;

public class MemberCost {

	String memberName;
	String eventItemName;
	double tottalEventAmount;
	double amountSpent;
	double amountDue;
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getEventItemName() {
		return eventItemName;
	}
	public void setEventItemName(String eventItemName) {
		this.eventItemName = eventItemName;
	}
	public double getAmountSpent() {
		return amountSpent;
	}
	public void setAmountSpent(double amountSpent) {
		this.amountSpent = amountSpent;
	}
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	
	

}
