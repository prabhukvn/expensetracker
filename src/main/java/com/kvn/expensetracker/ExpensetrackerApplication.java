package com.kvn.expensetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// TODO: Auto-generated Javadoc
/**
 * The Class ExpensetrackerApplication.
 * 
 * This is the main application to start service.
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
public class ExpensetrackerApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ExpensetrackerApplication.class, args);
	}

	
}
