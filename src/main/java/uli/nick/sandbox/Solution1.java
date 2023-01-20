package uli.nick.sandbox;

public class Solution1 {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 0, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишите тут ваш код
        int j = 0;
        int m;
        for (int i = array.length - 1; i > array.length / 2; i--) {
            m = array[j];
            array[j] = array[i];
            array[i] = m;
            j++;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
