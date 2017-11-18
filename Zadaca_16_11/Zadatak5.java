package com.company;

import java.util.Scanner;

public class Zadatak5 {
    public static double obim(double stranica){
        double obim = 4 * stranica;
        return obim;
    }
    public static double povrisna(double stranica){
        double povrsina = stranica*stranica;
        return povrsina;
    }
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite duzinu stranice: ");
        double stranica = unos.nextDouble();

        System.out.println("Obim kvadrata je: "+obim(stranica));
        System.out.println("Povrsina kvadrata je: "+povrisna(stranica));
    }
}
