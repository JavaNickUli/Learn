package uli.nick.javarush.task.pro.task04.task0403;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }

        if (scanner.nextLine().equals("ENTER")) {
            System.out.println(sum);
        }
    }
}