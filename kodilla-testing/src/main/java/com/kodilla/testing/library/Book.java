package com.kodilla.testing.library;

import java.util.Objects;

public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o){
       if(this==o)
           return true;
       if(o==null || o.getClass()!=this.getClass())
                return false;
       Book book = (Book)o;
       return (book.getAuthor().equals(this.getAuthor()) && book.getPublicationYear()==this.getPublicationYear()
       && book.getTitle().equals(this.getTitle()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}
