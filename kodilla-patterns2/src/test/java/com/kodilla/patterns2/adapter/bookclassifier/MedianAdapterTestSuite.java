package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Set<BookA> bookASet = new HashSet<>();
        bookASet.add(new BookA("Pan Tadeusz", "Adam Mickieiwcz", 1800, "PTAM"));
        bookASet.add(new BookA("Pan Alojzy", "Adam Słowacki", 1850, "PAAS"));
        bookASet.add(new BookA("Pan Ziutek", "Adam Krasicki", 1900, "PZAK"));
        bookASet.add(new BookA("Pan Czesio", "Adam Konopnicki", 1950, "PCAK"));
        bookASet.add(new BookA("Pan Reksio", "Adam Sienkiewicz", 2000, "PRAS"));

        //When
        int median = medianAdapter.publictionYearMedian(bookASet);

        //Than
        System.out.println(median);
        assertEquals(1900, median);
    }
}
