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

import com.kvn.expensetracker.entities.MemberEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class MembersRepositoryTest.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class MembersRepositoryTest {

	/** The members repository. */
	@Autowired
	private MembersRepository membersRepository;

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
	 * Test should insert members into repository.
	 */
	@Test
	@Transactional
	public void testShouldInsertMembersIntoRepository() {

		MemberEntity prabhu = new MemberEntity("prabhu", "kvn", "prabhukvn@gmail.com", "prabhukvn@gmail.com");
		prabhu = membersRepository.saveAndFlush(prabhu);
		MemberEntity storedPrabhu = membersRepository.findById(prabhu.getId()).get();
		assertEquals(storedPrabhu.getFirstName(),prabhu.getFirstName());

	}

}
