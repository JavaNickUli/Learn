package uli.nick.learn.algorithms.arrays.remove;

/**
 * Удаление всех вхождений элемента.
 */

public class RemoveElement {

    public static int[] removeElement(int[] array, int num) {
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (num != array[i]) {
                if (j != i) {
                    array[j] = array[i];
                }
                j++;
            }
        }

        int[] trimArray = new int[j];
        System.arraycopy(array, 0, trimArray, 0, j);

        return trimArray;
    }
}
