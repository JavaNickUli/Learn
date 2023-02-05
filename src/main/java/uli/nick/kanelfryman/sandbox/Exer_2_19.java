package uli.nick.kanelfryman.sandbox;

import java.util.Scanner;

public class Exer_2_19 {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt() - 1;
        System.out.printf("%d %d %d\n", num++, num++, num);
    }
}
