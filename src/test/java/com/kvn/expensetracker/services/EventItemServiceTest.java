package com.kvn.expensetracker.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.repositories.EventItemRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EventItemServiceTest {

	@MockBean
	private EventItemRepository eventItemRepository;
	@Autowired
	private EventItemService eventItemService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreate() {

		EventItem eventItem = new EventItem();
		eventItem.setDesc("Ticket Event");
		eventItem.setId(1);
		eventItem.setName("Ticket");
		eventItem.setTotalEventItemCost(123456.00);
		// given
		when(eventItemRepository.save(eventItem)).thenReturn(eventItem);
		EventItem newEventItem = eventItemService.create(eventItem);
		assertEquals(eventItem.getId(), newEventItem.getId());

	}

	@Test
	public void testFindAll() {
		EventItem eventItem = new EventItem();
		eventItem.setDesc("Ticket Event");
		eventItem.setId(1);
		eventItem.setName("Ticket");
		eventItem.setTotalEventItemCost(123456.00);
		// given
		List<EventItem> eventItems= new ArrayList<>();
		eventItems.add(eventItem);
		when(eventItemRepository.findAll()).thenReturn(eventItems);
		List<EventItem> newEventItems = eventItemService.findAll();
		assertThat(newEventItems);
		
		
	}

}
