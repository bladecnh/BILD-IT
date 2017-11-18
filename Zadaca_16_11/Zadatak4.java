package com.company;

public class Zadatak4 {
    public static void pismoGlava (int n){
        int pismo = 0;
        int glava = 0;
        for (int i = 1; i <= n; i++){
            int x = (int)(Math.random() * 2);
            if (x == 0){
                pismo++;
            }
            else{
                glava++;
            }
        }
        System.out.println("Glava je bila: " +glava+ "\nPismo je bilo: "+pismo);
    }
    public static void main(String[] args) {
        pismoGlava(8);
    }
}
