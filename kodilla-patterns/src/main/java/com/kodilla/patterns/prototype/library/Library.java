package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library>{
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library getShallowCopy() throws CloneNotSupportedException{
        return super.clone();
    }

    public Library getDeepCopy() throws CloneNotSupportedException{
        Library libraryCopy = super.clone();
        Set<Book> bookSet = new HashSet<>();
        for(Book book: books){
            bookSet.add(book);
        }
        libraryCopy.books = bookSet;
        return libraryCopy;
    }
}
