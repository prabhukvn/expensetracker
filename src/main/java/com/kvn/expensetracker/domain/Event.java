package com.kvn.expensetracker.domain;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Event.
 */

@Deprecated
public class Event {


	
	/** The name. */
	private String name;
	
	/** The short desc. */
	private String shortDesc;
	
	/** The long desc. */
	private String longDesc;
	
	/** The date of event. */
	private Date dateOfEvent;

	/**
	 * Instantiates a new event.
	 */
	public Event() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new event.
	 *
	 * @param name the name
	 * @param shortDesc the short desc
	 * @param longDesc the long desc
	 * @param dateOfEvent the date of event
	 */
	public Event(String name, String shortDesc, String longDesc, Date dateOfEvent) {
		super();
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		this.dateOfEvent = dateOfEvent;
	}

	/** The id. */
	private int id;
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
	 * @param name
	 *            the new name
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
	 * @param shortDesc
	 *            the new short desc
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
	 * @param longDesc
	 *            the new long desc
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
	 * @param dateOfEvent
	 *            the new date of event
	 */
	public void setDateOfEvent(Date dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}

}
