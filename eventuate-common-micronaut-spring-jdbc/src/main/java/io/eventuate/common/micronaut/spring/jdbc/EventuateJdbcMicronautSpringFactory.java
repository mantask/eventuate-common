package io.eventuate.common.micronaut.spring.jdbc;

import io.eventuate.common.common.spring.jdbc.EventuateSpringJdbcStatementExecutor;
import io.eventuate.common.common.spring.jdbc.EventuateSpringTransactionTemplate;
import io.eventuate.common.jdbc.EventuateJdbcStatementExecutor;
import io.eventuate.common.jdbc.EventuateTransactionTemplate;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.inject.Singleton;
import javax.sql.DataSource;

@Factory
public class EventuateJdbcMicronautSpringFactory {

  @Singleton
  public EventuateJdbcStatementExecutor eventuateJdbcStatementExecutor(JdbcTemplate jdbcTemplate) {
    return new EventuateSpringJdbcStatementExecutor(jdbcTemplate);
  }

  @Singleton
  public EventuateTransactionTemplate eventuateTransactionTemplate(TransactionTemplate transactionTemplate) {
    return new EventuateSpringTransactionTemplate(transactionTemplate);
  }

  @Singleton
  @Requires(missingBeans = JdbcTemplate.class)
  public JdbcTemplate jdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }

  @Singleton
  @Requires(missingBeans = TransactionTemplate.class)
  public TransactionTemplate transactionTemplate(PlatformTransactionManager platformTransactionManager) {
    return new TransactionTemplate(platformTransactionManager);
  }

}
