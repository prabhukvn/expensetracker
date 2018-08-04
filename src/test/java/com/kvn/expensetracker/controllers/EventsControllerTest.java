package com.kvn.expensetracker.controllers;

/**
 * Simple Controller Unit Test Case
 */
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kvn.expensetracker.domainentities.Event;
import com.kvn.expensetracker.domainentities.EventItem;
import com.kvn.expensetracker.services.EventServiceImpl;
import com.kvn.expensetracker.services.EventToEventItemService;

@RunWith(SpringRunner.class)
@WebMvcTest(EventsController.class)
public class EventsControllerTest {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	private EventServiceImpl eventService;
	@MockBean
	private EventToEventItemService eventToEventItemService;

	@Autowired
	ObjectMapper objectMapper;

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
	public void testCreateEvent() throws JsonProcessingException, Exception {
		Event event = new Event("Movie", "Movie", "Movie", new Date());
		when(eventService.createEvent(event)).thenReturn(event);
		mockMvc.perform(
				post("/api/events").contentType("application/json").content(objectMapper.writeValueAsBytes(event)))
				.andExpect(status().isCreated());

	}

	@Test
	public void testUpdateEvent() throws JsonProcessingException, Exception {
		Event event = new Event("Movie", "Movie", "Movie", new Date());
		when(eventService.updateEvent(event)).thenReturn(event);
		mockMvc.perform(
				put("/api/events/0").contentType("application/json").content(objectMapper.writeValueAsBytes(event)))
				.andExpect(status().isOk());

	}

	@Test
	public void testGetAllEvent() throws JsonProcessingException, Exception {
		Event event = new Event("Movie", "Movie", "Movie", new Date());
		List<Event> events = new ArrayList<>();
		events.add(event);
		when(eventService.getAllEvents()).thenReturn(events);
		mockMvc.perform(
				get("/api/events").contentType("application/json").content(objectMapper.writeValueAsBytes(event)))
				.andExpect(status().isOk());
	}

	@Test
	public void testGetEvent() throws JsonProcessingException, Exception {
		Event event = new Event("Movie", "Movie", "Movie", new Date());
		List<Event> events = new ArrayList<>();
		events.add(event);
		when(eventService.getEvent(0)).thenReturn(event);
		mockMvc.perform(
				get("/api/events/0").contentType("application/json").content(objectMapper.writeValueAsBytes(event)))
				.andExpect(status().isOk());
	}

	@Test
	public void testGetEventItems() throws JsonProcessingException, Exception {
		List<EventItem> eventItems = new ArrayList<>();
		EventItem eventItem = new EventItem();
		eventItem.setId(1);
		eventItem.setDesc("Event Item");
		eventItem.setName("Ticket Event");

		when(eventToEventItemService.getEventItems(0)).thenReturn(eventItems);
		mockMvc.perform(get("/api/events/0/eventItems").contentType("application/json")
				.content(objectMapper.writeValueAsBytes(eventItems))).andExpect(status().isOk());
	}
	@Test
	public void testGetEventItemsIsNull() throws JsonProcessingException, Exception {
		List<EventItem> eventItems = new ArrayList<>();
		EventItem eventItem = new EventItem();
		eventItem.setId(1);
		eventItem.setDesc("Event Item");
		eventItem.setName("Ticket Event");

		when(eventToEventItemService.getEventItems(0)).thenReturn(null);
		mockMvc.perform(get("/api/events/0/eventItems").contentType("application/json")
				.content(objectMapper.writeValueAsBytes(eventItems))).andExpect(status().isOk());
	}

}
