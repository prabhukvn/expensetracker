package com.kvn.expensetracker.controllers;
/**
 * Simple Controller Unit Test Case
 */
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

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

	/*@Test
	public void testUpdateEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEvent() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEventItems() {
		fail("Not yet implemented");
	}*/

}
