package com.esgglobal.hibernatespringdatajpa;

import com.esgglobal.hibernatespringdatajpa.domain.Book;
import com.esgglobal.hibernatespringdatajpa.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class SpringBootJpaTestSliceTests {
    @Autowired
    BookRepository bookRepository;

    @Test
    void testJpaTestSplice() {
        long before = bookRepository.count();
        assertThat(before).isEqualTo(0);
        bookRepository.save(Book.builder().title("hello").publisher("self").build());
        long after = bookRepository.count();
        assertThat(before).isLessThan(after);
    }
}
