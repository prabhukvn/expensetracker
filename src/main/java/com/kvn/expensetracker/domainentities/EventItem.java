package com.kvn.expensetracker.domainentities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class EventItem {
	@Id
	private int id;
	private String name;
	private String desc;
	private Double totalEventItemCost;

//	@OneToMany(fetch=FetchType.LAZY)
//	@JoinColumn(name="event_item_id")
//	private List<MemberAmount> amountPaidByMembers;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getTotalEventItemCost() {
		return totalEventItemCost;
	}
	public void setTotalEventItemCost(Double totalEventItemCost) {
		this.totalEventItemCost = totalEventItemCost;
	}
	public int getId() {
		return id;
	}
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
