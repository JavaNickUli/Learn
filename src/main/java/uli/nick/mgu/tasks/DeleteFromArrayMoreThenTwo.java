package uli.nick.mgu.tasks;

public class DeleteFromArrayMoreThenTwo {

    public static int[] deleteMoreThenTwo(int[] array) {
        int size = array.length;

        for (int i = 0; i < size; i++) {
            int count = 0;
            int number = array[i];

            for (int j = i; j < size; j++) {
                if (number == array[j] && count++ > 1) {
                    int k = i;

                    for (int l = i; l < size; l++) {
                        if (number != array[l]) {

                            if (k != l) {
                                array[k] = array[l];
                            }
                            k++;
                        }
                    }
                    i--;
                    size = k;
                }
            }
        }

        int[] trimArray = new int[size];
        System.arraycopy(array, 0, trimArray, 0, size);

        return trimArray;
    }

}
