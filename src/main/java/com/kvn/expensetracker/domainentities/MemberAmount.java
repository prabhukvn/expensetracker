package com.kvn.expensetracker.domainentities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

// TODO: Auto-generated Javadoc
/**
 * The Class MemberAmount.
 */
@Entity
@Cache(region="common", usage = CacheConcurrencyStrategy.READ_WRITE) 
public class MemberAmount {

	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	/** The member id. */
	private int memberId;
	
	/** The amount paid. */
	private double amountPaid;

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
	 * Gets the member id.
	 *
	 * @return the member id
	 */
	public int getMemberId() {
		return memberId;
	}

	/**
	 * Sets the member id.
	 *
	 * @param memberId the new member id
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	/**
	 * Gets the amount paid.
	 *
	 * @return the amount paid
	 */
	public double getAmountPaid() {
		return amountPaid;
	}

	/**
	 * Sets the amount paid.
	 *
	 * @param amountPaid the new amount paid
	 */
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

}
