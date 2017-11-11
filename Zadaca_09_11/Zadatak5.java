package com.company;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite password: ");
        String pass = s.next();
        if (Provjera(pass)) {
            System.out.println("Password je validan");
        } else {
            System.out.println("Password nije validan.");
        }

    }

    public static boolean Provjera(String pass) {
        if (pass.length() < 8) {
            return false;
        } else {
            char c;
            int count = 1;
            for (int i = 0; i < pass.length(); i++) {
                c = pass.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return false;
                } else if (Character.isDigit(c)) {
                    count++;
                    if (count < 2) {
                        return false;
                    }
                }


            }


        }

        return true;
    }
}
