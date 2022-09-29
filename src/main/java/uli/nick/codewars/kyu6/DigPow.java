package uli.nick.codewars.kyu6;

/**
 * Some numbers have funny properties. For example:
 * <p>89 --> 8¹ + 9² = 89 * 1
 * <p>695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
 * <p>46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
 * <p>Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p
 * <p>we want to find a positive integer k, if it exists, such that the sum of the digits of n taken to the
 * successive powers of p is equal to k * n.
 * <p>In other words:
 * <p>Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
 * <p>If it is the case we will return k, if not return -1.
 * <p>Note: n and p will always be given as strictly positive integers.
 * <pre>{@code
 * digPow(89, 1) should return 1 since 8¹ + 9² = 89 = 89 * 1
 * digPow(92, 1) should return -1 since there is no k such as 9¹ + 2² equals 92 * k
 * digPow(695, 2) should return 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
 * digPow(46288, 3) should return 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
 * }</pre>
 */

public class DigPow {

    public static long digPow1(int n, int p) {
        p += String.valueOf(n).length() - 1;
        int number = n;
        long sumOfPow = 0;
        while (number != 0) {
            sumOfPow += Math.pow(number % 10, p--);
            number /= 10;
        }
        return sumOfPow % n == 0 ? sumOfPow / n : -1;
    }

    public static long digPow(int n, int p) {
        long sumOfPow = 0;
        for (int num : String.valueOf(n).toCharArray()) {
            sumOfPow += Math.pow((num - '0') % 10, p++);
        }
        return sumOfPow % n == 0 ? sumOfPow / n : -1;
    }
}
