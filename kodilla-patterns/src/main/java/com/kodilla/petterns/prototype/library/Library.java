package com.kodilla.petterns.prototype.library;

import com.kodilla.petterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
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

    public boolean addBook(Book book){
        return books.add( book );
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for(Book list : books) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = this.shallowCopy();
        cloneLibrary.books = new HashSet<>();

        for(Book book: getBooks()){
            cloneLibrary.addBook( new Book( book.getTitle(), book.getAuthor(), book.getPublicationDate() ) );
        }

        return cloneLibrary;
    }
}