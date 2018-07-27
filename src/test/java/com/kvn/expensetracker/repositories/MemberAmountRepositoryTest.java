/**
 * 
 */
package com.kvn.expensetracker.repositories;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kvn.expensetracker.domainentities.Member;
import com.kvn.expensetracker.domainentities.MemberAmount;

/**
 * @author venkoppu
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class MemberAmountRepositoryTest {

	@Autowired
	private MembersRepository membersRepository;
	
	@Autowired
	private MemberAmountRepository memberAmountRepository;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShouldLoadMemebrsAndMembersAmount() {

		Member member = new Member("prabhu", "kvn", "prabhukvn@gmail.com", "prabhukvn@gmail.com");
		member = membersRepository.saveAndFlush(member);
		
		// create amount 
		MemberAmount memberAmount = new MemberAmount();
		memberAmount.setAmountPaid(15000);
		memberAmount.setMemberId(member.getId());
		
		memberAmount = memberAmountRepository.saveAndFlush(memberAmount);
		assertNotNull(memberAmount.getId());
		
	}

}
