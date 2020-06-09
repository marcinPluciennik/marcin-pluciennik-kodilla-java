package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        //Given
        Library library = new Library("My Library");

        IntStream.iterate(1, n -> n +1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Title " + n, "Author " + n, LocalDate.now().minusDays(n*10))));

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Your Library");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("His Library");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

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
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, cloneLibrary.getBooks().size());
        Assert.assertEquals(5,deepCloneLibrary.getBooks().size());
    }
}
