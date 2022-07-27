package uli.nick.mgu.tasks;

/**
 * Найдите сумму номеров минимального и максимального элементов.
 */

public class SumOfMinAndMaxInArray {

    public static int sumOfMaxAndMin(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int max = array[0];
        int min = max;

        for (int i : array) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }

        return max + min;
    }
}
