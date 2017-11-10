package com.company;

import java.util.Scanner;

public class Zadatak2 {


    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite niz: ");
        int i = 0;
        int broj = 1;
        float rez = 0;
        int brpoz = 0;
        int brneg = 0;
        while (broj != 0){
            broj = unos.nextInt();
            rez = rez + broj;
            i++;
            if (broj<0){
                brneg++;

            }
            else {
                brpoz++;
            }
        }
        System.out.println("Zbir je: " +rez);
        System.out.println("Prosjek je: " +rez/(i - 1));
        System.out.println("Pozitivni: " +brpoz);
        System.out.println("Negativni: " +brneg);
    }
}
