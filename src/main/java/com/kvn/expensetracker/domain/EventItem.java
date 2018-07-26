package com.kvn.expensetracker.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class EventItem.
 */
@Deprecated
public class EventItem {

	/** The name. */
	private String name;

	/** The desc. */
	private String description;

	/** The total event item cost. */
	private Double totalEventItemCost;

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
	 * Gets the desc.
	 *
	 * @return the desc
	 */
	public String getDesc() {
		return description;
	}

	/**
	 * Sets the desc.
	 *
	 * @param desc
	 *            the new desc
	 */
	public void setDesc(String desc) {
		this.description = desc;
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
	 * @param totalEventItemCost
	 *            the new total event item cost
	 */
	public void setTotalEventItemCost(Double totalEventItemCost) {
		this.totalEventItemCost = totalEventItemCost;
	}

}
