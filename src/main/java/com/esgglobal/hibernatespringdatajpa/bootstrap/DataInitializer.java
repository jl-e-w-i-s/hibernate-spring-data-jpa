package com.esgglobal.hibernatespringdatajpa.bootstrap;

import com.esgglobal.hibernatespringdatajpa.domain.Book;
import com.esgglobal.hibernatespringdatajpa.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {
        Book one = Book.builder().title("one").publisher("unknown").isbn("123").build();
        bookRepository.save(one);
        System.out.println("id #1: " + one.getId());
        Book two = Book.builder().title("two").publisher("someone").isbn("1234").build();
        bookRepository.save(two);
        System.out.println("id #2: " + two.getId());

        System.out.println("\nSaved and loaded from database..." + two.getId());
        this.bookRepository.findAll().forEach(book -> {
            System.out.println("id: " + book.getId());
            System.out.println("title: " + book.getTitle());
        });
    }
}
