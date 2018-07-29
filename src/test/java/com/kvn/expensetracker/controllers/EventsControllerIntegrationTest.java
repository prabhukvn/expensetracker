package com.kvn.expensetracker.controllers;
/**
 * Integration test case for Events Controller
 */
import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.kvn.expensetracker.domainentities.Event;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EventsControllerIntegrationTest {

	@Autowired
	private TestRestTemplate restTemplate;

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
		Event event = new Event("Movie", "Movie", "Movie", new Date());

		ResponseEntity<Event> responseEntity = restTemplate.postForEntity("/api/events", event, Event.class);
		Event responseEvent = responseEntity.getBody();
		assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
		assertEquals(event.getName(), responseEvent.getName());
	}

}
