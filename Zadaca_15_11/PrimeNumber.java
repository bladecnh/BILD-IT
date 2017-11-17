package com.company;

public class PrimeNumber {

    public static boolean isProstiBroj(int n) {

        boolean isPrime = true;

            for (int i = 2; i < n/2; i++) {

                if (n % i == 0) {

                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }

}
