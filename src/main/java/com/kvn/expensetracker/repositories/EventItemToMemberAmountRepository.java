package com.kvn.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.domainentities.EventItemToMemberAmount;

public interface EventItemToMemberAmountRepository extends JpaRepository<EventItemToMemberAmount, Integer>{

	EventItemToMemberAmount findByEventItemId(int id);

}
