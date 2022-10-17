package uli.nick.javarush.task.pro.task05.task0508;

import java.util.Scanner;

public class Solution {

    public static String[] strings = new String[6];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                boolean duplicate = false;
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[j] != null && strings[j].equals(strings[i])) {
                        strings[j] = null;
                       duplicate = true;
                    }
                }
                if (duplicate) {
                    strings[i] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
