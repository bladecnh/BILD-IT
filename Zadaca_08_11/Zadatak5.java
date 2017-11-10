package com.company;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite broj redova: ");
        int br = unos.nextInt();

        for (int i = 1; i <= br; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);

            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i<=br; i++){
            for (int j=1; j<=br-i; j++){
                System.out.print(" ");}
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
