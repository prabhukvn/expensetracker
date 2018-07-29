/**
 * 
 */
package com.kvn.expensetracker.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author venkoppu
 *
 */
@Configuration
@EnableJpaRepositories(basePackages="com.kvn.expensetracker.repositories")
@EntityScan(basePackages="com.kvn.expensetracker.domainentities")
@EnableTransactionManagement
public class EntitiesConfig {

}
