package com.company;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite recenicu: ");
        String rec = s.nextLine();
        int upperCase = 0;
        int lowerCase = 0;
        int z = rec.length();

        for (int y = 0; y < z; y++){
            if (Character.isUpperCase(rec.charAt(y))) upperCase++;
            }
        System.out.printf("Broj velikih slova u stringu je %d.", upperCase);
}}
