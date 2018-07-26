package com.kvn.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.entities.MemberEntity;

/**
 * The Interface MembersRepository.
 */
public interface MembersRepository extends JpaRepository<MemberEntity, Integer> {

}
