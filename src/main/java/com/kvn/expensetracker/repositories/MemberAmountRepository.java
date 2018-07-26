package com.kvn.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.entities.MemberAmountEntity;

/**
 * The Interface MemberAmountRepository.
 */

public interface MemberAmountRepository extends JpaRepository<MemberAmountEntity, Integer> {

	
	
}
