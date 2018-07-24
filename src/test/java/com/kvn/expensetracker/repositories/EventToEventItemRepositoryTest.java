package com.kvn.expensetracker.repositories;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kvn.expensetracker.domainentities.Event;
import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.domainentities.EventToEventItem;
// TODO: Auto-generated Javadoc

/**
 * The Class EventToEventItemRepositoryTest.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class EventToEventItemRepositoryTest {
	
	/** The event to event item repository. */
	@Autowired
	private EventToEventItemRepository eventToEventItemRepository;
	
	/** The events repository. */
	@Autowired
	private EventsRepository eventsRepository;
	
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
	 * Test should create events and events items.
	 */
	@Test
	@Transactional
	public void testShouldCreateEventsAndEventsItems() {
		//Given
		//1. create the event
		Event event = new Event("Movie", "documentation", "longDesc", new Date());
		event = eventsRepository.saveAndFlush(event);
		EventItem eventItem = new EventItem();
		eventItem.setName("Tickets");
		eventItem.setDesc("Tickets to movie");
		eventItem.setTotalEventItemCost(3000.00);
		eventItem = eventItemRepository.saveAndFlush(eventItem);
		EventToEventItem eventToEventItem = new EventToEventItem();
		eventToEventItem.setEventId(event.getId());
		eventToEventItem.setEventItemId(eventItem.getId());
		
		eventToEventItem = eventToEventItemRepository.saveAndFlush(eventToEventItem);
		
		//when
		eventToEventItem = eventToEventItemRepository.findById(eventToEventItem.getId()).get();
		
		//then
		assertNotNull(eventToEventItem);
		
		
	}

}
