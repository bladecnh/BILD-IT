package com.company;

public class Zadatak3 {

    public static boolean isEmirp(int n) {
        return PrimeNumber.isProstiBroj(n) &&
                !Palindrom.Palindrom(n) &&
                PrimeNumber.isProstiBroj(Reverse.reverse(n));
    }

    public static void main(String[] args) {

        int broj = 100;
        int linije = 10;

        int count = 0;
        int i = 2;

        while (count < broj) {
            if (isEmirp(i)) {
                count++;
                System.out.print(count % linije == 0 ? i + "\n" : i + " ");
            }
            i++;
        }

    }
}
