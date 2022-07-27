package uli.nick.mgu.tasks;

/**
 * Найдите произведение элементов массива с нечетными номерами.
 */

public class MultiplyWithOddInArray {

    public static int multiplyWithOdd(int[] array) {
        int result = 1;
        if (array.length < 2) {
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                if (array[i] == 0) {
                    return 0;
                }
                result *= array[i];
            }
        }

        return result;
    }
}
