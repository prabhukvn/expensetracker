package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.entities.MemberEntity;

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
	MemberEntity create(MemberEntity member);

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<MemberEntity> findAll();

}
