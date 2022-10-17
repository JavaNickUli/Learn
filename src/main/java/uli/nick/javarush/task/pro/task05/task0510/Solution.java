package uli.nick.javarush.task.pro.task05.task0510;

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {

        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                result[i][j] = i + j;
            }
        }

        for (int[] row : result) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
