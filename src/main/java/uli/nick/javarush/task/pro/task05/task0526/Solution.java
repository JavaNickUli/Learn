package uli.nick.javarush.task.pro.task05.task0526;

import java.util.Arrays;

public class Solution {

    public static int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 6, 5},
            {4, 3, 2, 1}
    };

    public static void main(String[] args) {

        printArray();
        for (int i = 0; i < array.length / 2; i++) {
            int[] tempArray = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = tempArray;
        }
        printArray();
    }

    public static void printArray() {

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
