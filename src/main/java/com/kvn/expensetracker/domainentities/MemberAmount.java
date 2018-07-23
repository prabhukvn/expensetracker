package com.kvn.expensetracker.domainentities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MemberAmount {

	@Id
	private int id;

	private int memberId;
	private double amountPaid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

}
