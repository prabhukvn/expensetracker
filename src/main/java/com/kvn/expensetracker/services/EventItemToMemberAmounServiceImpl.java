package com.kvn.expensetracker.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.domainentities.EventItemToMemberAmount;
import com.kvn.expensetracker.domainentities.MemberAmount;
import com.kvn.expensetracker.repositories.EventItemToMemberAmountRepository;
import com.kvn.expensetracker.repositories.MemberAmountRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class EventItemToMemberAmounServiceImpl.
 */
@Service
public class EventItemToMemberAmounServiceImpl implements EventItemToMemberAmountService {

	/** The event item to member amount repository. */
	@Autowired
	private EventItemToMemberAmountRepository eventItemToMemberAmountRepository;
	
	/** The member amount repository. */
	@Autowired
	private MemberAmountRepository memberAmountRepository;

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventItemToMemberAmountService#create(com.kvn.expensetracker.domainentities.EventItemToMemberAmount)
	 */
	@Override
	@Transactional
	public EventItemToMemberAmount create(EventItemToMemberAmount itemMemberAmount) {
		// TODO Auto-generated method stub
		MemberAmount memberAmount = itemMemberAmount.getMemeberAmount();
		memberAmountRepository.saveAndFlush(memberAmount);
		return eventItemToMemberAmountRepository.save(itemMemberAmount);
	}

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventItemToMemberAmountService#findAll()
	 */
	@Override
	public List<EventItemToMemberAmount> findAll() {
		// TODO Auto-generated method stub
		return eventItemToMemberAmountRepository.findAll();
	}
}
