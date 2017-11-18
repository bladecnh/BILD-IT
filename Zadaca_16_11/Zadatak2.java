package com.company;

import java.util.Scanner;

public class Zadatak2 {

    public static String ukloniKarakter(String str, char ch) {
        StringBuilder str1 = new StringBuilder(str);

        for (int i = 0; i <= str1.length() - 1; i++) {
            if (str1.charAt(i) == ch) {
                str1.deleteCharAt(i);
            }
        }
        return str1.toString();


    }

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesi string: ");
        String str = unos.nextLine();
        System.out.print("Unesi karakter: ");
        char ch = unos.next().charAt(0);

        System.out.println("Rezultat: " + ukloniKarakter(str, ch));


    }
}
