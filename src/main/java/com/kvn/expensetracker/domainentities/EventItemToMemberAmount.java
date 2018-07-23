package com.kvn.expensetracker.domainentities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EventItemToMemberAmount {

	@Id
	private int id;
	private int eventItemId;
	@OneToOne
	private MemberAmount memeberAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEventItemId() {
		return eventItemId;
	}
	public void setEventItemId(int eventItemId) {
		this.eventItemId = eventItemId;
	}
	public MemberAmount getMemeberAmount() {
		return memeberAmount;
	}
	public void setMemeberAmount(MemberAmount memeberAmount) {
		this.memeberAmount = memeberAmount;
	}
	
	
}
