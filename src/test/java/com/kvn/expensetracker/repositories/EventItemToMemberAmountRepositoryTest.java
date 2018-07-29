package com.kvn.expensetracker.repositories;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.domainentities.EventItemToMemberAmount;
import com.kvn.expensetracker.domainentities.Member;
import com.kvn.expensetracker.domainentities.MemberAmount;

// TODO: Auto-generated Javadoc
/**
 * The Class EventItemToMemberAmountRepositoryTest.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class EventItemToMemberAmountRepositoryTest {
	
	/** The event item repository. */
	@Autowired
	private EventItemRepository eventItemRepository;
	
	/** The member amount repository. */
	@Autowired
	private MemberAmountRepository memberAmountRepository;
	
	/** The members repository. */
	@Autowired
	private MembersRepository membersRepository;
	
	@Autowired
	private EventItemToMemberAmountRepository eventItemToMemberAmountRepository;

	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test should attach member amount to event item.
	 */
	@Test
	public void testShouldAttachMemberAmountToEventItem() {

		//1. create member
		Member member = new Member("prabhu", "kvn", "prabhukvn@gmail.com", "prabhukvn@gmail.com");
		member = membersRepository.saveAndFlush(member);
		
		// 2. create amount 
		MemberAmount memberAmount = new MemberAmount();
		memberAmount.setAmountPaid(15000);
		memberAmount.setMemberId(member.getId());
		
		memberAmount = memberAmountRepository.saveAndFlush(memberAmount);
		assertNotNull(memberAmount.getId());
		
		// 3 create event item
		EventItem eventItem = new EventItem();
		eventItem.setDesc("Movie tickets");
		eventItem.setName("Tickets");
		eventItem.setTotalEventItemCost(15000.00);
		eventItem = eventItemRepository.saveAndFlush(eventItem);
		
		// attach eventItemt to member and member amount
		EventItemToMemberAmount eventItemToMemberAmount = new EventItemToMemberAmount();
		eventItemToMemberAmount.setEventItemId(eventItem.getId());
		List<MemberAmount> memeberAmounts = new ArrayList<>();
		memeberAmounts.add(memberAmount);
		eventItemToMemberAmount.setMemeberAmounts(memeberAmounts);
		
		eventItemToMemberAmountRepository.saveAndFlush(eventItemToMemberAmount);
		
	}

}
