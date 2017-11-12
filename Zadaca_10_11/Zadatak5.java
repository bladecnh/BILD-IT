package com.company;


import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite neki string: ");
        String str = input.nextLine();

        char word;
        int i = 0;

        while (i <= str.length()){
            word = str.charAt(i);
            if (str.indexOf(word) == str.lastIndexOf(word)){
                System.out.println("Prvi karakter koji se ne pojavljuje u ostatku stringa je: " +word);
                break;
            }
            i++;
        }


    }
}
