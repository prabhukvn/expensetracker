package com.kvn.expensetracker.repositories;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kvn.expensetracker.entities.EventItemEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class EventItemRepositoryTest.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class EventItemRepositoryTest {
	
	/** The event item repository. */
	@Autowired
	private EventItemRepository eventItemRepository;

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
	 * Test should insert event items into repository.
	 */
	@Test
	@Transactional
	public void testShouldInsertEventItemsIntoRepository() {
		//given
		EventItemEntity eventItem = new EventItemEntity();
		eventItem.setName("Tickets");
		eventItem.setDesc("Movie tickets for my birth day");
		eventItem.setTotalEventItemCost(2500.00);
		eventItem = eventItemRepository.saveAndFlush(eventItem);
		eventItemRepository.flush();
		
		//when
		EventItemEntity storedEventItem = eventItemRepository.findById(eventItem.getId()).get();
		
		//then
		assertEquals(eventItem.getName(), storedEventItem.getName());
		
	}

}
