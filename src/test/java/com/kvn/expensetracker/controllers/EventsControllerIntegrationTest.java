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
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.kvn.expensetracker.domainentities.Event;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.Header;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

import org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EventsControllerIntegrationTest {

	@Autowired
	private TestRestTemplate restTemplate;
	@LocalServerPort
	int port;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	
	@Before
	public void setUp() throws Exception {
		 RestAssured.baseURI = "http://localhost";
		    RestAssured.port = port;
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
	@Test
	public void testCreateEventRestAssured() {
		Event event = new Event("Movie", "Movie", "Movie", new Date());
		Header headers = new Header("Content-Type", "application/json");
		Response response= RestAssured.given().log().all().with().header(headers).body(event).post("/api/events");
		response.then().statusCode(201);
		System.out.println("Response Time in milli Seconds :" +response.time());
		

	}

}
