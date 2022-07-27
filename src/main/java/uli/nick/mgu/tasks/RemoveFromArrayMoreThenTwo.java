package uli.nick.mgu.tasks;

/**
 * Удалить в массиве все числа, которые повторяются более двух раз.
 */

public class RemoveFromArrayMoreThenTwo {

    public static int[] removeMoreThanTwo(int[] array) {
        int size = array.length;

        for (int i = 1; i < size; i++) {

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    int k = i;

                    for (int l = i + 1; l < size; l++) {
                        if (array[i] != array[l]) {
                            k++;
                            if (k != l) {
                                array[k] = array[l];
                            }
                        }
                    }
                    size = k + 1;
                }
            }
        }

        int[] trimArray = new int[size];
        System.arraycopy(array, 0, trimArray, 0, size);

        return trimArray;
    }
}
