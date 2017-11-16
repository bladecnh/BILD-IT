package com.company;

import java.util.Scanner;

public class Zadatak5 {
    public static String pretvoriMilisekunde(long millis){

        long sec = millis / 1000;

        long sekunde = sec % 60;
        long minute = (sec / 60) % 60;
        long sati = (sec / 60 / 60) / 24;
        return sati + ":" + minute + ":" + sekunde;

    }

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite iznos milisekundi: ");
        long millis = unos.nextLong();
        System.out.println(pretvoriMilisekunde(millis));

    }


}
