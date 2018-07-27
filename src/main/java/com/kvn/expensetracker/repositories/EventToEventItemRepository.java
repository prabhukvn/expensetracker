package com.kvn.expensetracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvn.expensetracker.domainentities.EventToEventItem;

// TODO: Auto-generated Javadoc
/**
 * The Interface EventToEventItemRepository.
 */
public interface EventToEventItemRepository extends JpaRepository<EventToEventItem, Integer> {

	/**
	 * Find by event id.
	 *
	 * @param eventId the event id
	 * @return the list
	 */
	List<EventToEventItem> findByEventId(int eventId);

}
