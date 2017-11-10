package com.company;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite broj redova: ");
        int br = unos.nextInt();

        System.out.println("Piramida A");

        for (int i = 1; i <= br; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Piramida C");
        for (int i = 1; i<=br; i++){
            for (int j=1; j<=br-i; j++){
                System.out.print(" ");}
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Piramida B");
        for (int i = br; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j);

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Piramida D");
        for (int i = 1; i<=br; i++){
            for (int j=1; j<i; j++){
                System.out.print(" ");}
            for (int j=1; j<=br-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
