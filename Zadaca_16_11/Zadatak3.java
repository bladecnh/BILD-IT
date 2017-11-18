package com.company;

import java.util.Scanner;

public class Zadatak3 {

    public static void brojPitanja(int pitanja){
        Scanner unos = new Scanner(System.in);
        int a,b,rezultat;
        int tacno = 0;
        int netacno = 0;

        for (int i = 1; i <= pitanja; i++){
            a = (int)(Math.random() * 10);
            b = (int)(Math.random() * 10);
            rezultat = a - b;
            System.out.printf("Koliko je %d + %d ? %n",a,b);
            int odgovor = unos.nextInt();
            if (odgovor == rezultat){
                tacno++;
            }
            else{
                netacno++;
            }

        }
        System.out.println("Imali ste " +tacno+ " tacna odgovora i " +netacno+ " pogresnih odgovora.");
    }

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite broj pitanja: ");
        int pitanja = unos.nextInt();
        brojPitanja(pitanja);
    }

}
