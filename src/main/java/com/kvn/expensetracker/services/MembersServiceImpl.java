package com.kvn.expensetracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvn.expensetracker.domainentities.Member;
import com.kvn.expensetracker.repositories.MembersRepository;

@Service
public class MembersServiceImpl implements MembersService {
	
	@Autowired
	private MembersRepository memebersRepository;
	@Override
	public Member create(Member member) {
		// TODO Auto-generated method stub
		return memebersRepository.save(member);
	}
	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return memebersRepository.findAll();
	}
}
