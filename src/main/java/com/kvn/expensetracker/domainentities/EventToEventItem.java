package com.kvn.expensetracker.domainentities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EventToEventItem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int eventId;
	private int eventItemId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public int getEventItemId() {
		return eventItemId;
	}
	public void setEventItemId(int eventItemId) {
		this.eventItemId = eventItemId;
	}
	
	
}
