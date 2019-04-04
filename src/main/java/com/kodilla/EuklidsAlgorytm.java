package com.kodilla;
import java.lang.*;

class EuklidsAlgorytm {

    public static void main(String[] args) {
        int a = 5000;
        int b = 3250;

        while (a != b) {
            if (a % b == 0) {
                a -= b;
            } else {
                b -= a;
            }
        }
    System.out.println("Największy wspólny dzielnik (NWD) wynosi: "+ a);
    }
}


