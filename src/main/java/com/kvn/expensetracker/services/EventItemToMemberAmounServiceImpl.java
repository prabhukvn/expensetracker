package com.kvn.expensetracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.domainentities.EventItemToMemberAmount;
import com.kvn.expensetracker.domainentities.MemberAmount;
import com.kvn.expensetracker.repositories.EventItemToMemberAmountRepository;
import com.kvn.expensetracker.repositories.MemberAmountRepository;

@Service
public class EventItemToMemberAmounServiceImpl implements EventItemToMemberAmountService{

	
	@Autowired
	private EventItemToMemberAmountRepository eventItemToMemberAmountRepository;
	@Autowired
	private MemberAmountRepository memberAmountRepository;
	@Override
	public EventItemToMemberAmount create(EventItemToMemberAmount itemMemberAmount) {
		// TODO Auto-generated method stub
		MemberAmount memberAmount = itemMemberAmount.getMemeberAmount();
		memberAmountRepository.saveAndFlush(memberAmount);
		return eventItemToMemberAmountRepository.save(itemMemberAmount);
	}
	
	@Override
	public List<EventItemToMemberAmount> findAll() {
		// TODO Auto-generated method stub
		return eventItemToMemberAmountRepository.findAll();
	}
}
