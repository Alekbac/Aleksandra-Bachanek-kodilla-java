package com.kodilla.patterns.prototype.library;

import com.kodilla.petterns.prototype.library.Book;
import com.kodilla.petterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){

        //Given
        Library library = new Library("Library");

        Book book1 = new Book("Book1", "Author1", LocalDate.of(2016,1,05));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(2016,2,05));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(2016,3,05));
        Book book4 = new Book("Book4", "Author4", LocalDate.of(2016,4,05));
        Book book5 = new Book("Book5", "Author5", LocalDate.of(2016,5,05));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library shallowCopy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName( "Library deepCopy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.removeBook(book2);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
