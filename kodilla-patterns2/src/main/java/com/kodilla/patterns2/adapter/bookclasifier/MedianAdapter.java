package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> libraryBbooks = new HashMap<>();
        for(Book bookA: bookSet){
            libraryBbooks.put(new BookSignature(bookA.getSignature()),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(bookA.getAuthor(),
                            bookA.getTitle(), bookA.getPublicationYear()));
        }
        return medianPublicationYear(libraryBbooks);
    }
}
