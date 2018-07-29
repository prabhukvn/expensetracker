package com.kvn.expensetracker.domainentities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

// TODO: Auto-generated Javadoc
/**
 * The Class EventItemToMemberAmount.
 */
@Entity
public class EventItemToMemberAmount {

	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/** The event item id. */
	private int eventItemId;
	
	/** The memeber amount. */
	@OneToMany
	@JoinColumn(name="event_item_id")
	private List<MemberAmount> memeberAmounts;

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

	public List<MemberAmount> getMemeberAmounts() {
		return memeberAmounts;
	}

	public void setMemeberAmounts(List<MemberAmount> memeberAmounts) {
		this.memeberAmounts = memeberAmounts;
	}

	

}
