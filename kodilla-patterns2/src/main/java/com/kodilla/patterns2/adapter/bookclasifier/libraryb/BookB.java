package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class BookB {
    private final String title;
    private final String author;
    private final int yearOfPublication;

    public BookB(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}