package com.kvn.expensetracker.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

// TODO: Auto-generated Javadoc
/**
 * The Class EventItemToMemberAmount.
 */
@Entity
public class EventItemToMemberAmountEntity {

	/** The id. */
	@Id
	private int id;
	
	/** The event item id. */
	private int eventItemId;
	
	/** The memeber amount. */
	@OneToMany
	@JoinColumn(name="event_item_id")
	private List<MemberAmountEntity> memeberAmounts;

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

	public List<MemberAmountEntity> getMemeberAmounts() {
		return memeberAmounts;
	}

	public void setMemeberAmounts(List<MemberAmountEntity> memeberAmounts) {
		this.memeberAmounts = memeberAmounts;
	}

	

}
