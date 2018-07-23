package com.kvn.expensetracker.services;

import java.util.List;

import com.kvn.expensetracker.domainentities.Member;

public interface MembersService {

	Member create(Member member);

	List<Member> findAll();

}
