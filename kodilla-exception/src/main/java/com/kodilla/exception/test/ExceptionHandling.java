package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            System.out.println("First try...");
            String result = secondChallenge.probablyIWillThrowException(10.1, 3.5);
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Catching exception" + e);
        }finally{
            System.out.println("I'm gonna be here... always!");
        }

    }
}
