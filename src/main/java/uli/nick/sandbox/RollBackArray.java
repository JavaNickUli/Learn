package uli.nick.sandbox;

public class RollBackArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] out = rollback(array);
        for (int i : out) {
            System.out.print(i + " ");
        }
    }

    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastIndex = array.length - 1 - index;
            int currentIndex = index;
            result[currentIndex] = array[lastIndex];
        }
        return result;
    }
}
