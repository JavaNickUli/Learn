package uli.nick.sandbox;

import java.util.Random;
import java.util.Scanner;

public class Wer {
    public static void main(String[] args) {
        Wer wer = new Wer();
        wer.foo();

        Random random = new Random();
        int v = 0;
        int m = 0;
        for (int i = 0; i < 1000; i++) {
            v = random.nextInt(10);
            if (m < v) {
                m = v;
            }
        }
        System.out.println(m);
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = scanner.nextInt();

        System.out.println("Give the second number:");
        int second = scanner.nextInt();

        System.out.println("The sum of two numbers is " + (first + second));
    }

    void foo() {
        String m = "Hello";
        System.out.print(m);
        func(m);
        System.out.print(m);
    }

    void func(String m) {
        m += " World!";
    }

}
