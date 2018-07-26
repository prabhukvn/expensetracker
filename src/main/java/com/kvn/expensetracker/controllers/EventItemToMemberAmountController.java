package com.kvn.expensetracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kvn.expensetracker.entities.EventItemToMemberAmountEntity;
import com.kvn.expensetracker.services.EventItemToMemberAmountService;

// TODO: Auto-generated Javadoc
/**
 * The Class EventItemToMemberAmountController.
 */
@RestController
@RequestMapping("/api")
public class EventItemToMemberAmountController {

	/** The event item to member amount service. */
	@Autowired
	private EventItemToMemberAmountService eventItemToMemberAmountService;

	/**
	 * Creates the.
	 *
	 * @param itemMemberAmount the item member amount
	 * @return the response entity
	 */
	@PostMapping(value = "/eventItemToMemberAmount", produces = "application/json", consumes = "application/json")
	public ResponseEntity<EventItemToMemberAmountEntity> create(EventItemToMemberAmountEntity itemMemberAmount) {

		EventItemToMemberAmountEntity item = eventItemToMemberAmountService.create(itemMemberAmount);
		return new ResponseEntity<EventItemToMemberAmountEntity>(item, HttpStatus.CREATED);
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@GetMapping(value = "/eventItemToMemberAmount", produces = "application/json")
	public ResponseEntity<List<EventItemToMemberAmountEntity>> getAll() {

		List<EventItemToMemberAmountEntity> allEntities = eventItemToMemberAmountService.findAll();
		return new ResponseEntity<List<EventItemToMemberAmountEntity>>(allEntities, HttpStatus.OK);
	}

}
