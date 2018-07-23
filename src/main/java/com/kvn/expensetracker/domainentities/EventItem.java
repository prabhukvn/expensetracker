package com.kvn.expensetracker.domainentities;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class EventItem.
 */
@Entity
public class EventItem {
	
	/** The id. */
	@Id
	private int id;
	
	/** The name. */
	private String name;
	
	/** The desc. */
	private String desc;
	
	/** The total event item cost. */
	private Double totalEventItemCost;

//	@OneToMany(fetch=FetchType.LAZY)
//	@JoinColumn(name="event_item_id")
//	private List<MemberAmount> amountPaidByMembers;
	
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
	 * Gets the desc.
	 *
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	
	/**
	 * Sets the desc.
	 *
	 * @param desc the new desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	/**
	 * Gets the total event item cost.
	 *
	 * @return the total event item cost
	 */
	public Double getTotalEventItemCost() {
		return totalEventItemCost;
	}
	
	/**
	 * Sets the total event item cost.
	 *
	 * @param totalEventItemCost the new total event item cost
	 */
	public void setTotalEventItemCost(Double totalEventItemCost) {
		this.totalEventItemCost = totalEventItemCost;
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
//	public Member getPaidByMemberId() {
//		return paidByMemberId;
//	}
//	public void setPaidByMemberId(Member paidByMemberId) {
//		this.paidByMemberId = paidByMemberId;
//	}
//	public List<MemberAmount> getAmountPaidByMembers() {
//		return amountPaidByMembers;
//	}
//	public void setAmountPaidByMembers(List<MemberAmount> amountPaidByMembers) {
//		this.amountPaidByMembers = amountPaidByMembers;
//	}
	
	
	
	
	
	

}
