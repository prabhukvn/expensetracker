package com.kvn.expensetracker.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.entities.MemberEntity;
import com.kvn.expensetracker.repositories.MembersRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class MembersServiceImpl.
 */
@Service
public class MembersServiceImpl implements MembersService {

	/** The memebers repository. */
	@Autowired
	private MembersRepository memebersRepository;

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.MembersService#create(com.kvn.expensetracker.domainentities.Member)
	 */
	@Override
	@Transactional
	public MemberEntity create(MemberEntity member) {
		// TODO Auto-generated method stub
		return memebersRepository.save(member);
	}

	/* (non-Javadoc)
	 * @see com.kvn.expensetracker.services.MembersService#findAll()
	 */
	@Override
	public List<MemberEntity> findAll() {
		// TODO Auto-generated method stub
		return memebersRepository.findAll();
	}
}
