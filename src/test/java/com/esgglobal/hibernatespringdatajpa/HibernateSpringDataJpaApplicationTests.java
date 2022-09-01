package com.esgglobal.hibernatespringdatajpa;

import com.esgglobal.hibernatespringdatajpa.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class HibernateSpringDataJpaApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    void testBookRepository_count_greaterThanOne() {
        long count = bookRepository.count();
        assertThat(count).isGreaterThan(1);
    }

    @Test
    void contextLoads() {
    }

}
