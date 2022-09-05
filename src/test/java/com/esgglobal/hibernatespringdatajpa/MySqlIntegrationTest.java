package com.esgglobal.hibernatespringdatajpa;

import com.esgglobal.hibernatespringdatajpa.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ActiveProfiles("local-mysql")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
@ComponentScan(basePackages = "com.esgglobal.hibernatespringdatajpa.bootstrap")
public class MySqlIntegrationTest {
    @Autowired
    BookRepository bookRepository;

    @Test
    void testMySql() {
        long before = bookRepository.count();
        assertThat(before).isEqualTo(2);
    }
}
