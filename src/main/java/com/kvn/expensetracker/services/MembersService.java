package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.domainentities.Member;

// TODO: Auto-generated Javadoc
/**
 * The Interface MembersService.
 */
public interface MembersService {

	/**
	 * Creates the.
	 *
	 * @param member the member
	 * @return the member
	 */
	Member create(Member member);

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<Member> findAll();

}
