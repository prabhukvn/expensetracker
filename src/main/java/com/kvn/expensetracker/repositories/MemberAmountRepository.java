package com.kvn.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.domainentities.MemberAmount;

/**
 * The Interface MemberAmountRepository.
 */

public interface MemberAmountRepository extends JpaRepository<MemberAmount, Integer> {

	
	
}
