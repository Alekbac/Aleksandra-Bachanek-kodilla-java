package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Book book1 = new Book("Wojciech Orliński","Lem. Życie nie z tej ziemi", 2017, "001");
        Book book2 = new Book("Stephen King", "TO", 1986, "002");
        Book book3 = new Book("Camilla Lackberg", "Czarownica", 2018, "003");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedia = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2017, publicationYearMedia, 0);
    }
}
