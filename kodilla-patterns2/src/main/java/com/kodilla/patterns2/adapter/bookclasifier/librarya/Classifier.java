package com.kodilla.patterns2.adapter.bookclasifier.librarya;

import java.util.Set;

public interface Classifier {
    int publictionYearMedian(Set<BookA> bookSet);
}
