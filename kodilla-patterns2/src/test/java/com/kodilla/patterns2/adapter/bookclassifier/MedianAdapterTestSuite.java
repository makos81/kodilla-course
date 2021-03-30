package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        /*
        którym stwórz przykładowy zbiór Set<Book> i wywołaj metodę publicationYearMedian() klasy MedianAdapter.
        Napisz asercję sprawdzającą czy wynik testu jest zgodny z oczekiwaniami.
         */
        Set<Book> booksA = new HashSet<>();
        booksA.addAll(Arrays.asList(new Book("autho1", "title1",2010, "sign1"),
                new Book("author2", "title2",2012, "sign2"),
                new Book("author3", "title3",2014, "sign3")));

        MedianAdapter medianAdapter = new MedianAdapter();
        assertEquals(2012, medianAdapter.publicationYearMedian(booksA));
    }
}
