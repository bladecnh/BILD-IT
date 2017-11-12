package com.company;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite ASCII code: ");
        int code = input.nextInt();

        char ascii = (char) code;

        System.out.println("Karakter za ASCII code " +code+ " je: " +ascii);


    }
}
