package com.company;

import java.util.Scanner;

public class Palindrom {

    public static boolean Palindrom(int n) {

        //negative numbers are not palindrome
        if (n < 0)
            return false;

        // initialize how many zeros
        int div = 1;
        while (n / div >= 10) {
            div *= 10;
        }

        while (n != 0) {
            int left = n / div;
            int right = n % 10;

            if (left != right)
                return false;

            n = (n % div) / 10;
            div /= 100;
        }

        return true;
    }
}
