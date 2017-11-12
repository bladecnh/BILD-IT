package com.company;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite string: ");
        String str = s.nextLine();

        String reStr = new StringBuffer(str).reverse().toString();

        System.out.println("Vas string naopako je: " +reStr);

    }
}
