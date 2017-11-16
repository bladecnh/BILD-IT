package com.company;

import java.util.Scanner;

public class Zadatak2 {

    public static int saberCifre(long n){

        long treci = n % 10;
        long drugi = (n / 10) % 10;
        long prvi = (n / 100) % 10;

        int rezultat = (int)(prvi + drugi + treci);
        return rezultat;
    }

    public static void main(String[] args){

        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite broj: ");

        long n = unos.nextLong();

        if (n < 99 || n > 999)
            System.out.println("Morate unijeti trocifren broj!");
        else if (n < 0)
            System.out.println("Broj ne može biti negativan!");
        else  {
            System.out.println("Rezultat je: " +saberCifre(n));
        }

    }
}
