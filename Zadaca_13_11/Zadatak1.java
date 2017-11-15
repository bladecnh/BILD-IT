package com.company;

import java.util.Scanner;

public class Zadatak1 {

    public static void ispisiSortiraneBrojeve(double broj1, double broj2, double broj3){

        double broj;

        if (broj1 > broj2){
            broj = broj1;
            broj1 = broj2;
            broj2 = broj;
        }

        if (broj2 > broj3){
            broj = broj2;
            broj2 = broj3;
            broj3 = broj;
        }
        if (broj1 > broj2){
            broj = broj1;
            broj1 = broj2;
            broj2 = broj;
        }
        System.out.println("Brojevi u rastucem redoslijedu: " +broj1+ " " +broj2+ " " +broj3);

    }

    public static void main(String[] args){
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite 3 broja: ");
        double broj1 = unos.nextInt();
        double broj2 = unos.nextInt();
        double broj3 = unos.nextInt();

        ispisiSortiraneBrojeve(broj1, broj2, broj3);


    }

}
