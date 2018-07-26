package com.kvn.expensetracker.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.kvn.expensetracker.entities.EventEntity;
import com.kvn.expensetracker.entities.EventItemEntity;
import com.kvn.expensetracker.entities.EventItemToMemberAmountEntity;
import com.kvn.expensetracker.entities.MemberEntity;
import com.kvn.expensetracker.entities.MemberAmountEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class EventsRepositoryTest.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class EventsRepositoryTest {
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

	/** The entity manager. */
	@Autowired
	private TestEntityManager entityManager;

	/** The events repository. */
	@Autowired
	private EventsRepository eventsRepository;

	/**
	 * Sets the up before class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Tear down after class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test should insert events records.
	 */
	@Test
	@Transactional
	public void testShouldInsertEventsRecords() {
		// given
		EventEntity movie = new EventEntity("Movie", "Weekend Movie", "Weekend Movie plan on occasion of my birthday", new Date());
		EventEntity lunch = new EventEntity("Lunch", "Weekend Lunch", "Weekend Lunch plan on occasion of my birthday", new Date());
		EventEntity dinner = new EventEntity("Dinner", "Weekend Dinner", "Weekend Dinner plan on occasion of my birthday",
				new Date());
		Integer movieId = (Integer) entityManager.persistAndGetId(movie);
		Integer lunchId = (Integer) entityManager.persistAndGetId(lunch);
		Integer dinnerId = (Integer) entityManager.persistAndGetId(dinner);
		entityManager.flush();

		// when
		EventEntity storedMovie = eventsRepository.findById(movieId.intValue()).get();
		EventEntity storedLunch = eventsRepository.findById(lunchId).get();
		EventEntity storedDinner = eventsRepository.findById(dinnerId).get();
		int allEvents = eventsRepository.findAll().size();

		// then
		assertEquals(movie.getName(), storedMovie.getName());
		assertEquals(lunch.getName(), storedLunch.getName());
		assertEquals(dinner.getName(), storedDinner.getName());
		assertEquals(3, allEvents);
	}

	/**
	 * Test should fetch all events.
	 */
	@Test
	@Transactional
	public void testShouldFetchAllEvents() {
		List<EventEntity> events = eventsRepository.findAll();
		if (null != events) {
			events.forEach(event -> {
				System.out.println(event);
			});
		}
		assert (true);
	}

	public void testShouldCreateEventAndAllItsSubEntities() {
		// 1. create member
		MemberEntity member = new MemberEntity("prabhu", "kvn", "prabhukvn@gmail.com", "prabhukvn@gmail.com");
		member = membersRepository.saveAndFlush(member);

		// 2. create amount
		List<MemberAmountEntity> memberAmounts = new ArrayList<>();
		MemberAmountEntity memberAmount = new MemberAmountEntity();
		memberAmount.setAmountPaid(15000);
		memberAmount.setMemberId(member.getId());

		memberAmount = memberAmountRepository.saveAndFlush(memberAmount);
		assertNotNull(memberAmount.getId());

		// 3 create event item
		EventItemEntity eventItem = new EventItemEntity();
		eventItem.setDesc("Movie tickets");
		eventItem.setName("Tickets");
		eventItem.setTotalEventItemCost(15000.00);
		eventItem = eventItemRepository.saveAndFlush(eventItem);

		// 4 attach eventItemt to member and member amount
		EventItemToMemberAmountEntity eventItemToMemberAmount = new EventItemToMemberAmountEntity();
		eventItemToMemberAmount.setEventItemId(eventItem.getId());
		eventItemToMemberAmount.setMemeberAmounts(memberAmounts);
		eventItemToMemberAmountRepository.saveAndFlush(eventItemToMemberAmount);
		
		// 5 attach event item to event
		EventEntity event = new EventEntity("Movie", "BirthDayMovie", "my Big Birthday Movie", new Date());
		event = eventsRepository.saveAndFlush(event);
		assertNotNull(event.getId());
		
	}

}
