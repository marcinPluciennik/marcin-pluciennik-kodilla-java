package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publictionYearMedian(Set<BookA> bookSet){
        Map<BookSignature, BookB> bookMap = new HashMap<>();
        for (BookA book: bookSet){
            bookMap.put(new BookSignature(book.getSignature()),
                    new BookB(book.getTitle(), book.getAuthor(), book.getPublicationYear()));
        }
        return medianPublicationYear(bookMap);
    }
}
