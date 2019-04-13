package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        Calculator calc = new Calculator();

        int expectSum = 50;
        int actualSum = calc.add(a, b);

        int expectDifference = -10;
        int actualDifference = calc.substract( a, b);

        if (actualSum != expectSum) {
            System.out.println("Error");
        } else System.out.println("Result of sum is OK");

        if (expectDifference != actualDifference) {
            System.out.println("Error");
        } else System.out.println("Result of sum is OK");

    }
}
