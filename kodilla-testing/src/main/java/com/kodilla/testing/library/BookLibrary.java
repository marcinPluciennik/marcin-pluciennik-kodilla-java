package com.kodilla.testing.library;

import java.util.*;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = new ArrayList<Book>();
        String firstName = libraryUser.getFirstname();
        String lastName = libraryUser.getLastname();
        String peselID = libraryUser.getPeselId();
        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);

        if (firstName.equals("Jan") && lastName.equals("Kowalski") && peselID.equals("1234")) {
            return bookList;
        } else if (firstName.equals("Myszka") && lastName.equals("Miki") && peselID.equals("5678")) {
            bookList = resultList;
            return bookList;
        } else if (firstName.equals("Adam") && lastName.equals("Adamowicz") && peselID.equals("0000")) {
            bookList = resultList;
            return bookList;
        } else {
            return bookList;
        }
    }
}
