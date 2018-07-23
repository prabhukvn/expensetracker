package com.kvn.expensetracker.domainentities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

// TODO: Auto-generated Javadoc
/**
 * The Class EventItemToMemberAmount.
 */
@Entity
public class EventItemToMemberAmount {

	/** The id. */
	@Id
	private int id;
	
	/** The event item id. */
	private int eventItemId;
	
	/** The memeber amount. */
	@OneToOne
	private MemberAmount memeberAmount;

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

	/**
	 * Gets the memeber amount.
	 *
	 * @return the memeber amount
	 */
	public MemberAmount getMemeberAmount() {
		return memeberAmount;
	}

	/**
	 * Sets the memeber amount.
	 *
	 * @param memeberAmount the new memeber amount
	 */
	public void setMemeberAmount(MemberAmount memeberAmount) {
		this.memeberAmount = memeberAmount;
	}

}
