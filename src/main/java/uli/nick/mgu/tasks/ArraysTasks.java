package uli.nick.mgu.tasks;

import java.util.Arrays;

public class ArraysTasks {

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1, 5};
        int[] test2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] test3 = {1, 2, 1, 3, 1, 5};

        System.out.println(Arrays.toString(removeMoreThanTwo(test2)));
        System.out.println(Arrays.toString(removeMoreThanTwo2(test2)));
    }

    public static int[] removeMoreThanTwo(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    for (int k = j + 1; k < size; k++) {
                        if (array[j] == array[k]) {
                            System.arraycopy(array, k + 1, array, k, size - k - 1);
                            size--;
                            k--;
                        }
                    }
                }
            }
        }
        int[] trimArray = new int[size];
        System.arraycopy(array, 0, trimArray, 0, size);

        return trimArray;
    }

    public static int[] removeMoreThanTwo2(int[] array) {
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
