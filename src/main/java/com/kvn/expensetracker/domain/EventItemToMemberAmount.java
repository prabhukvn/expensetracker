package com.kvn.expensetracker.domain;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

// TODO: Auto-generated Javadoc
/**
 * The Class EventItemToMemberAmount.
 */
@Deprecated
public class EventItemToMemberAmount {

	
	/** The event item id. */
	private int eventItemId;
	
	/** The memeber amount. */
	@OneToMany
	@JoinColumn(name="event_item_id")
	private List<MemberAmount> memeberAmounts;

	

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
