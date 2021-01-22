package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LibraryTestSuite{
    @Test
    public void testGetBooks(){
        Library library = new Library("polska");
        IntStream.iterate(1,n->n+1)
                .limit(4)
                .forEach(x->library.getBooks().add(new Book("Ksiazka " + x, "Autor " + x, LocalDate.now())));

        Assertions.assertEquals(4, library.getBooks().size());
    }

    @Test
    public void testGetBooksCopy(){
        Library library = new Library("polska");
        IntStream.iterate(1,n->n+1)
                .limit(4)
                .forEach(x->library.getBooks().add(new Book("Ksiazka " + x, "Autor " + x, LocalDate.now())));

        Book bookToDelete = new Book("Ksiazka x", "Autor x", LocalDate.now());
        library.getBooks().add(bookToDelete);

        Library shallowCopiedLibrary = null;
        try{
            shallowCopiedLibrary = library.getShallowCopy();
            shallowCopiedLibrary.setName("shallow Library");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        Library deepCopiedLibrary = null;
        try{
            deepCopiedLibrary = library.getDeepCopy();
            deepCopiedLibrary.setName("deep copy Library");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        Assertions.assertEquals(5, shallowCopiedLibrary.getBooks().size());
        Assertions.assertEquals("shallow Library", shallowCopiedLibrary.getName());
        Assertions.assertEquals(5, deepCopiedLibrary.getBooks().size());
        Assertions.assertEquals("deep copy Library", deepCopiedLibrary.getName());
        Assertions.assertTrue(shallowCopiedLibrary.getBooks().contains(bookToDelete));
        Assertions.assertTrue(deepCopiedLibrary.getBooks().contains(bookToDelete));

        library.getBooks().remove(bookToDelete);
        Assertions.assertEquals(4, shallowCopiedLibrary.getBooks().size());
        Assertions.assertEquals(5, deepCopiedLibrary.getBooks().size());

    }

    
}
