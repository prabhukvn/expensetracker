package com.kvn.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.domainentities.Member;

public interface MembersRepository extends JpaRepository<Member, Integer> {

}
