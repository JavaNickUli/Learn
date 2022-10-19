package uli.nick.javarush.task.pro.task05.task0526;

import java.util.Arrays;

/**
 * <p>Проинициализируй двумерный массив при объявлении любыми значениями (рекомендуем использовать быструю
 * инициализацию). Размерность массива должна быть 3х4 (высота-ширина). Переверни массив зеркально
 * относительно центральной строки.
 * <p>Например, ты заполнил массив таким образом:
 * <pre>{@code {
 * {1,2,3,4},
 * {4,5,6,7},
 * {7,8,9,0}
 * }}</pre>
 * <p>Тогда зеркально перевернутый массив будет выглядеть вот так:
 * <pre>{@code {
 * {7,8,9,0},
 * {4,5,6,7},
 * {1,2,3,4}
 * }}</pre>
 * <p>Требования:
 * <p>В классе Solution должна быть публичная статическая переменная array типа int[][].
 * <p>Проинициализируй переменную array при объявлении согласно условию.
 * <p>Переверни массив array зеркально относительно центральной строки (смотри пример в условии).
 */

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
