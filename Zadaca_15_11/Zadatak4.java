package com.company;

public class Zadatak4 {
    public static void main(String[] args) {

        int count;
        int count1 = 0;

        for (count = 3; count + 2 < 10000; count++) {
            if ((PrimeNumber.isProstiBroj(count)) && (PrimeNumber.isProstiBroj(count + 2))) {
                count1++;
                if (count1 % 10 != 0) {
                    System.out.printf("(%d,%d)", count, count + 2);
                } else {
                    System.out.printf("(%d,%d)%n", count, count + 2);
                }

            }

        }

    }

}
