package uli.nick.codewars.kyu6;

/**
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 * <p>For example (Input --> Output):
 * <p>39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
 * <p>999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
 * <p>4 --> 0 (because 4 is already a one-digit number)
 */

public class Persist {

    public static int persistence1(long n) {
        if (n < 10) return 0;
        long num = 1;
        while (n > 0) {
            num *= n % 10;
            n /= 10;
        }
        return persistence(num) + 1;
    }

    public static int persistence(long n) {
        if (n < 10) return 0;
        long num = 1;
        for (;n > 0; num *= n % 10, n /= 10);
        return persistence(num) + 1;
    }
}
