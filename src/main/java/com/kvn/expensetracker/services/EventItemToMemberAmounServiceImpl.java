package com.kvn.expensetracker.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.entities.EventItemToMemberAmountEntity;
import com.kvn.expensetracker.entities.MemberAmountEntity;
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
	public EventItemToMemberAmountEntity create(EventItemToMemberAmountEntity itemMemberAmount) {
		// TODO Auto-generated method stub
		List<MemberAmountEntity> memberAmounts = itemMemberAmount.getMemeberAmounts();
		memberAmountRepository.saveAll(memberAmounts);
		memberAmountRepository.flush();
		return eventItemToMemberAmountRepository.save(itemMemberAmount);
	}

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.EventItemToMemberAmountService#findAll()
	 */
	@Override
	public List<EventItemToMemberAmountEntity> findAll() {
		// TODO Auto-generated method stub
		return eventItemToMemberAmountRepository.findAll();
	}
}
