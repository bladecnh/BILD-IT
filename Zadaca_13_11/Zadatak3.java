package com.company;

import java.util.Scanner;

public class Zadatak3 {

    public static void prebrojiSlova(String s){

    int counter = 0;
    for (int i = 0; i < s.length(); i++) {
        if (Character.isLetter(s.charAt(i)))
        counter++;
        }
        System.out.println("Broj slova u stringu je: " +counter);;
        }

    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        System.out.print("Unesite string: ");
        String s = str.nextLine();

        prebrojiSlova(s);

    }

}