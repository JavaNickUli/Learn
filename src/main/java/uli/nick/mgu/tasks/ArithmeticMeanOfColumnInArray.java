package uli.nick.mgu.tasks;

/**
 * Дан целочисленный массив А[1..4, 1..5]. Найти среднее арифметическое каждого из столбцов.
 */

public class ArithmeticMeanOfColumnInArray {
    static double[] arithmeticMeanOfColumn(int[][] array) {
        double[] result = new double[array.length];

        for (int column = 0; column < array.length; column++) {
            double sum = 0;

            for (int cell : array[column]) {
                sum += cell;
            }
            if (sum != 0) {
                result[column] = sum / array[column].length;
            }
        }

        return result;
    }
}
