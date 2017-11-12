package com.company;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Unesi cijeli broj: ");
        int n = input.nextInt();
        int i = 1;
        System.out.print("Faktori broja " + n + " su: ");
        while (i <= n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }


    }


}
