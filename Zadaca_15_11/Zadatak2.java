package com.company;

public class Zadatak2 {

    public static boolean isProstiBroj(int broj) {

        boolean isPrime = true;

        for (int n = 2; n < broj; n++) {

            if (broj % n == 0) {

                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static void main(String[] args) {


        for (int broj = 100000; broj>0; broj--){
            if(isProstiBroj(broj) == true)
                System.out.print(broj+ " " );
        }

    }
}
