package com.company;

public class Zadatak5 {
    public static void main(String[] args) {
        int count = 0;
        int linije = 10;
        for (int n = 0; count <=100; n++){
            if (Palindrom.Palindrom(n) && PrimeNumber.isProstiBroj(n)){
                count++;
                System.out.print(count % linije == 0 ? "\n": n +" ");

            }
        }

    }
}
