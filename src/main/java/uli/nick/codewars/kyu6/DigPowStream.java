package uli.nick.codewars.kyu6;

import java.util.stream.IntStream;

public class DigPowStream {

    public static long digPow(int n, int p) {
        int[] digits = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        int sum = IntStream.range(0, digits.length).map(i -> (int) Math.pow(digits[i], i + p)).sum();
        return sum % n == 0 ? sum / n : -1;
    }

    public static long digPow1(int n, int p) {
        String digits = String.valueOf(n);
        long sum = IntStream.range(0, digits.length())
                .mapToLong(i -> (long) Math.pow(digits.charAt(i)-'0', i+p))
                .sum();
        return sum % n == 0 ? sum/n : -1;
    }
}
