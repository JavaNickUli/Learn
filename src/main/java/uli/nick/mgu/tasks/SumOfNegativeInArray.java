package uli.nick.mgu.tasks;

/**
 * Найдите сумму отрицательных элементов массива.
 */

public class SumOfNegativeInArray {

    public static int sumOfNegative(int[] array) {
        int result = 0;

        for (int i : array) {
            if (i < 0) {
                result += i;
            }
        }

        return result;
    }
}
