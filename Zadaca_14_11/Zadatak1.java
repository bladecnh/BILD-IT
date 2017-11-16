package com.company;

public class Zadatak1 {

    public static void main(String[] args) {
        // write your code here
        int n = 1;
        while (n <= 10) {
            for (int i = 0; i < 5; i++) {
                char randomChar = (char) ((int) 'A' + Math.random() * ((int) 'Z' - (int) 'A' + 1));
                int broj = (int) (Math.random() * 9);
                System.out.print(broj + "" + randomChar);
            }
            System.out.println();
            n++;
        }
    }


}
