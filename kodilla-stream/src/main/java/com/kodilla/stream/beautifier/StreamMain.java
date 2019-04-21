package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify( "Poem decorator",(a)->a.toUpperCase());
        poemBeautifier.beautify( "POEM DECORATOR",(a)->a.toLowerCase());
        poemBeautifier.beautify( "Poem decorator",(a)->a.replace( "o","@" ));
    }
}