package uli.nick.test;

public class OddCount {

    public static int count(int a, int b) {
        return (b - a) / 2 + (a % 2 == 0 && b % 2 == 0 ? 0 : 1);
    }
}
