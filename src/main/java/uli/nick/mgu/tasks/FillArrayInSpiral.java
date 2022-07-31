package uli.nick.mgu.tasks;

/**
 * Заполнить двумерный массив целыми числами от 1 до 100 по спирали.
 */

public class FillArrayInSpiral {

    public static int[][] fillInSpiral(int rowArray, int colArray) {
        if (rowArray < 1) {
            return new int[0][];
        }
        int[][] array = new int[rowArray][colArray];

        int rowBegin = 0;
        int rowEnd = rowArray - 1;
        int colBegin = -1;
        int colEnd = colArray - 1;
        int row = 0;
        int col = -1;
        int rowDelta = 0;
        int colDelta = 1;

        for (int i = 1; i <= rowArray * colArray; i++) {
            row += rowDelta;
            col += colDelta;
            array[row][col] = i;

            if (row == rowBegin && col == colEnd) {
                rowDelta = 1;
                colDelta = 0;
                colBegin++;
            }
            if (row == rowEnd && col == colEnd) {
                rowDelta = 0;
                colDelta = -1;
                rowBegin++;
            }
            if (row == rowEnd && col == colBegin) {
                rowDelta = -1;
                colDelta = 0;
                colEnd--;
            }
            if (row == rowBegin && col == colBegin && colBegin != colEnd) {
                rowDelta = 0;
                colDelta = 1;
                rowEnd--;
            }
        }

        return array;
    }
}
