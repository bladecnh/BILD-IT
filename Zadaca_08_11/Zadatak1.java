package com.company;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite mjesecni iznos stednje: ");
        float mjeiznos = unos.nextFloat();
        System.out.print("Unesite broj mjeseci: ");
        double brojmjeseci = unos.nextDouble();
        double stednja;
        stednja = (brojmjeseci * (mjeiznos * (1 + 0.00417))) * (1 + 0.00417);
        System.out.println("Vrijednost racuna: " +stednja);

}
}

