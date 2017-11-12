package com.company;

public class Zadatak1 {
    public static void main(String[] args) {
        // write your code here

        for (int n = 0; n <= 1000; n++) {

            int d = n;
            int a;
            int arm = 0;

            while (d > 0) {
                a = d % 10;
                d = d / 10;
                arm = arm + a * a * a;
            }
            if (arm == n) {
                System.out.print(n + " ");
            }


        }
    }
}
