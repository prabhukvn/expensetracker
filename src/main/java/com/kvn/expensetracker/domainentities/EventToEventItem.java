package com.kvn.expensetracker.domainentities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

// TODO: Auto-generated Javadoc
/**
 * The Class EventToEventItem.
 */
@Entity
@Cache(region="common", usage = CacheConcurrencyStrategy.READ_WRITE) 
public class EventToEventItem {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	/** The event id. */
	private int eventId;
	
	/** The event item id. */
	private int eventItemId;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the event id.
	 *
	 * @return the event id
	 */
	public int getEventId() {
		return eventId;
	}

	/**
	 * Sets the event id.
	 *
	 * @param eventId the new event id
	 */
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	/**
	 * Gets the event item id.
	 *
	 * @return the event item id
	 */
	public int getEventItemId() {
		return eventItemId;
	}

	/**
	 * Sets the event item id.
	 *
	 * @param eventItemId the new event item id
	 */
	public void setEventItemId(int eventItemId) {
		this.eventItemId = eventItemId;
	}

}
