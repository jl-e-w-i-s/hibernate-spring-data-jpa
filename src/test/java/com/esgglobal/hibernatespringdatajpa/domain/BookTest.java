package com.esgglobal.hibernatespringdatajpa.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testEquals_differentId_returnsFalse() {
        Book one = Book.builder().id(1L).build();
        Book two = Book.builder().id(2L).build();
        assertNotEquals(one, two);
    }

    @Test
    void testEquals_sameId_returnsTrue() {
        Book one = Book.builder().id(1L).build();
        Book alsoOne = Book.builder().id(1L).build();
        assertEquals(one, alsoOne);
    }

    @Test
    void testEquals_sameIdDifferentTitle_returnsTrue() {
        Book one = Book.builder().id(1L).title("one").build();
        Book alsoOne = Book.builder().id(1L).title("two").build();
        assertEquals(one, alsoOne);
    }

    @Test
    void testEquals_IdAndNull_returnsFalse() {
        Book one = Book.builder().id(1L).build();
        Book two = Book.builder().build();
        assertNotEquals(one, two);
    }
}