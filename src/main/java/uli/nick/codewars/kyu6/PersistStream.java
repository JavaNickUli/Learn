package uli.nick.codewars.kyu6;

public class PersistStream {

    public static int persistence(long n) {
        if (n < 10L) {
            return 0;
        }
        n = Long.toString(n).chars().reduce(1, (a, b) -> a * (b - 48));

        return persistence(n) + 1;
    }

    static int persistence1(long n) {
        int times = 0;
        while (n > 9) {
            n = (n + "").chars().reduce(1, (a, b) -> a * (b - 48));
            times++;
        }
        return times;
    }
}
