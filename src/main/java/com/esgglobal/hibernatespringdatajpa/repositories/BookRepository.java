package com.esgglobal.hibernatespringdatajpa.repositories;

import com.esgglobal.hibernatespringdatajpa.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
