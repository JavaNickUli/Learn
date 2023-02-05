package uli.nick.kanelfryman.sandbox;

import java.util.Scanner;

public class Exer_2_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d\n%d\n%d\n", a *= a, b *= b, a + b);
    }
}
