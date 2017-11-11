package com.company;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args){
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite iznos za isplatu: ");
        int iznos = unos.nextInt();

        int kolicina1 = iznos / 5;
        int iznos1 = iznos % 5;

        int kolicina2 = (iznos1 / 3);
        int kolicina12 = kolicina2 + kolicina1;

        int iznos2 = iznos1 % 3;

        int kolicina3 = kolicina12 + iznos2;
        System.out.println("Potreban broj kovanica je: " + kolicina3);
        System.out.println ("Za vas iznos od " +iznos+ " KM potrebno je " +kolicina1+ " kovanice od 5 KM, " +kolicina2+ " kovanice od 3 KM, " +iznos2+ " kovanice od 1 KM.");




    }
}
