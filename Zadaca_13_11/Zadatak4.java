package com.company;

import java.util.Scanner;

public class Zadatak4 {

    public static int brojacKaraktera(String str, char ch){

        char charCount = ch;
        int count = 0;

        str= str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == charCount) {
                count++;
            }

        }

        return count;

    }

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite string: ");
        String str = unos.nextLine();
        System.out.print("Unesite koji karakter zelite izbrojati: ");
        char ch = unos.next().trim().charAt(0);

        System.out.println("Broj karaktera je: " +brojacKaraktera(str,ch));
    }

}
