package com.company;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite recenicu: ");
        String rec = s.nextLine();
        int upperCase = 0;
        int lowerCase = 0;
        int z = rec.length();

        for (int y = 0; y < z; y++){
            if (Character.isUpperCase(rec.charAt(y))) upperCase++;
            if (Character.isLowerCase(rec.charAt(y))) lowerCase++;
        }

        double procenatVeliki = (upperCase * 1D) / ((upperCase + lowerCase) * 1D) * 100D;
        double procenatMali = (lowerCase * 1D) / ((upperCase + lowerCase) * 1D) * 100;
        System.out.printf("Ima %.2f %% velikih slova i %.2f %% malih slova u recenici." ,procenatVeliki,procenatMali);

}}
