package uli.nick.sandbox;

public class Binary {
    public static void main(String[] args) {
        int min = -2147483648;
        int max = 2147483647;
        intToBinary(min);
        intToBinary(min - 1);
        intToBinary(-100);
        intToBinary(0);
        intToBinary(100);
        intToBinary(max);
        intToBinary(max + 1);
        intToBinary(-1);
        intToBinary(-3 ^ -4);
        intToBinary(-4);
        intToBinary(~-4 + 1);
        intToBinary(4);
        intToBinary(~4 + 1);
        intToBinary(-3);
        intToBinary(~-3 + 1);
        intToBinary(3);
        intToBinary(~3 + 1);
    }

    static void intToBinary(int num) {
        String binary = Integer.toBinaryString(num);
        System.out.println("0".repeat(32 - binary.length()) + binary + " " + num);
    }
}
