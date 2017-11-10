package com.company;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite cijeli broj: ");
        int broj = unos.nextInt();
        int revers = 0;

        while (broj != 0){
            int ostatak = broj % 10;
            revers = revers * 10 + ostatak;
            broj /= 10;
        }
        System.out.print("Broj unazad je: " +revers);
    }
}
