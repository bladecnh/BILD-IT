package com.company;

import java.util.Scanner;

public class Zadatak5 {

    public static double stopeUMetre(double stope){

        return stope * 0.3048;
    }

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite broj stopa: ");
        double stope = unos.nextDouble();

        System.out.printf("%.3f stopa je %.3f metara",stope,stopeUMetre(stope));
    }
}
