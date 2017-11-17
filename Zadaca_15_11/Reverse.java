package com.company;

public class Reverse {

    public static int reverse(int n) {
        {
            int result = 0;
            int remainder;
            while (n > 0)
            {
                remainder = n % 10;
                n = n / 10;
                result = result * 10 + remainder;
            }

            return result;
        }
    }
}
