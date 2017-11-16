package com.company;

import java.util.Scanner;

public class Zadatak3 {

    public static void printMatrix(int n){
        int i = 1;
        while (i<= n){
            for (int j=1; j<=n; j++){
                System.out.print((int)(Math.random()*2));
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args){
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite broj(n): ");
        int n = unos.nextInt();
        printMatrix(n);
    }
}
