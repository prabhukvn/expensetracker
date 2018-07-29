package com.kvn.expensetracker.services;
/**
 * Using Simple Mockito where entire context will not be started.
 */
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.kvn.expensetracker.domainentities.Event;
import com.kvn.expensetracker.repositories.EventsRepository;

@RunWith(MockitoJUnitRunner.class)
public class EventServiceTest {

	@Mock
	private EventsRepository eventsRepository;

	@InjectMocks
	private EventServiceImpl eventService;

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
	public void testCreateEvent() {
		// given
		Event event = new Event("Movie", "weekend movie", "weekend movie", new Date());
		when(eventsRepository.save(event)).thenReturn(event);

		Event newEvent = eventService.createEvent(event);
		assertEquals(newEvent.getName(), event.getName());
	}

	@Test
	public void testUpdateEvent() {

		// given
		Event event = new Event("Movie", "weekend movie", "weekend movie", new Date());
		when(eventsRepository.save(event)).thenReturn(event);

		Event newEvent = eventService.updateEvent(event);
		assertEquals(newEvent.getName(), event.getName());

	}

	@Test
	public void testGetAllEvents() {
		Event event = new Event("Movie", "weekend movie", "weekend movie", new Date());
		List<Event> inputEvents = new ArrayList<>();
		inputEvents.add(event);
		when(eventsRepository.findAll()).thenReturn(inputEvents);
		List<Event> events = eventService.getAllEvents();
		assertNotNull(events);
	}

	@Test
	public void testGetEvent() {
		Event event = new Event("Movie", "weekend movie", "weekend movie", new Date());
		Optional<Event> optionalEvent = Optional.of(event);
		when(eventsRepository.findById(0)).thenReturn(optionalEvent);

		Event outPutEvent = eventService.getEvent(0);
		assertNotNull(outPutEvent);
	}

}
