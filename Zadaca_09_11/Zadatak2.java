package com.company;

public class Zadatak2 {
    public static void main(String[] args) {

        // TODO Auto-generated method stub

        boolean isPrime;

        for (int i = 1000; i > 0; i--) {

            isPrime = true;

            if (i / 100 == i % 10) {

                for (int n = 2; n < i; n++) {

                    if (i % n == 0) {

                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println("Broj " + i + " je palindrom i prost !");
                    break;
                }

            }
        }
    }
}

