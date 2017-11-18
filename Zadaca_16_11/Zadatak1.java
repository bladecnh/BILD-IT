package com.company;

public class Zadatak1 {

   public static String format(int number, int width) {

       String broj = number + "";
       if (broj.length() < width){
           for (int i = width - broj.length(); i>0; i--){
               broj = 0 + broj;
           }
       }
       return broj;

   }
    public static void main(String[] args) {
        System.out.println(format(34,5));
    }


}
