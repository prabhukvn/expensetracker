package com.kvn.expensetracker.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * The Class Event.
 */
@Entity
public class EventEntity {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column
	private String shortDesc;
	@Column
	private String longDesc;
	@Column
	private Date dateOfEvent;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="event_id")
	private List<EventItemEntity> eventItems;
	
	public EventEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public EventEntity(String name, String shortDesc, String longDesc, Date dateOfEvent) {
		super();
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		this.dateOfEvent = dateOfEvent;
	}



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
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the short desc.
	 *
	 * @return the short desc
	 */
	public String getShortDesc() {
		return shortDesc;
	}
	
	/**
	 * Sets the short desc.
	 *
	 * @param shortDesc the new short desc
	 */
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	
	/**
	 * Gets the long desc.
	 *
	 * @return the long desc
	 */
	public String getLongDesc() {
		return longDesc;
	}
	
	/**
	 * Sets the long desc.
	 *
	 * @param longDesc the new long desc
	 */
	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}
	
	/**
	 * Gets the date of event.
	 *
	 * @return the date of event
	 */
	public Date getDateOfEvent() {
		return dateOfEvent;
	}
	
	/**
	 * Sets the date of event.
	 *
	 * @param dateOfEvent the new date of event
	 */
	public void setDateOfEvent(Date dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}

	public List<EventItemEntity> getEventItems() {
		return eventItems;
	}

	public void setEventItems(List<EventItemEntity> eventItems) {
		this.eventItems = eventItems;
	}
	

	
}
