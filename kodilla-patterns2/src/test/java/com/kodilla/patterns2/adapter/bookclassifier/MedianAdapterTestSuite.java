package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Set<Book> bookASet = new HashSet<>();
        bookASet.add(new Book("Pan Tadeusz", "Adam Mickieiwcz", 1800, "PTAM"));
        bookASet.add(new Book("Pan Alojzy", "Adam Słowacki", 1850, "PAAS"));
        bookASet.add(new Book("Pan Ziutek", "Adam Krasicki", 1900, "PZAK"));
        bookASet.add(new Book("Pan Czesio", "Adam Konopnicki", 1950, "PCAK"));
        bookASet.add(new Book("Pan Reksio", "Adam Sienkiewicz", 2000, "PRAS"));

        //When
        int median = medianAdapter.publictionYearMedian(bookASet);

        //Than
        System.out.println(median);
        assertEquals(1900, median);
    }
}
