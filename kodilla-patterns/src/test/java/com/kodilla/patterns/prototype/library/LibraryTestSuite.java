package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("My Library");

        Book book1 = new Book("Title 1", "Author 1", LocalDate.now().minusDays(10));
        Book book2 = new Book("Title 2", "Author 2", LocalDate.now().minusDays(20));
        Book book3 = new Book("Title 3", "Author 3", LocalDate.now().minusDays(30));
        Book book4 = new Book("Title 4", "Author 4", LocalDate.now().minusDays(40));
        Book book5 = new Book("Title 5", "Author 5", LocalDate.now().minusDays(50));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Your Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("His Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book1);

        System.out.println(library.getName());
        System.out.println(library.getBooks());
        System.out.println();
        System.out.println(cloneLibrary.getName());
        System.out.println(cloneLibrary.getBooks());
        System.out.println();
        System.out.println(deepCloneLibrary.getName());
        System.out.println(deepCloneLibrary.getBooks());

        //When
        //Than
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, cloneLibrary.getBooks().size());
        Assert.assertEquals(5, deepCloneLibrary.getBooks().size());
    }
}
