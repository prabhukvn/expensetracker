package com.kvn.expensetracker.domainentities;

public class EventReport {

	private String eventName;
	
	private EventItemToMemberAmount eventItemToMemberAmount;
	
	//private List<MemberCost> memberCostList;
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/*public List<MemberCost> getMemberCostList() {
		return memberCostList;
	}
	public void setMemberCostList(List<MemberCost> memberCostList) {
		this.memberCostList = memberCostList;
	}*/
	public EventItemToMemberAmount getEventItemToMemberAmount() {
		return eventItemToMemberAmount;
	}
	public void setEventItemToMemberAmount(EventItemToMemberAmount eventItemToMemberAmount) {
		this.eventItemToMemberAmount = eventItemToMemberAmount;
	}
	
	
}


