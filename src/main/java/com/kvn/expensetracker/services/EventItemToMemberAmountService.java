package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.domainentities.EventItemToMemberAmount;

public interface EventItemToMemberAmountService {

	EventItemToMemberAmount create(EventItemToMemberAmount itemMemberAmount);

	List<EventItemToMemberAmount> findAll();

}
