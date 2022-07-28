package uli.nick.mgu.tasks;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static uli.nick.mgu.tasks.ArithmeticMeanOfColumnInArray.arithmeticMeanOfColumn;

class ArithmeticMeanOfColumnInArrayTest {

    @Test
    void arithmeticMeanOfColumnTest0() {
        int[][] array = {{1, 2, 3, 4}, {1, 2, 3, 4, 5}};

        double[] actual = arithmeticMeanOfColumn(array);
        double[] expected = {2.5, 3};

        then(actual).containsExactly(expected, Offset.offset(0.01));
    }

    @Test
    void arithmeticMeanOfColumnTest1() {
        int[][] array = {{1, 2, 3, 4}, {-1, -2, -3, -4, -5}};

        double[] actual = arithmeticMeanOfColumn(array);
        double[] expected = {2.5, -3};

        then(actual).containsExactly(expected, Offset.offset(0.01));
    }

    @Test
    void arithmeticMeanOfColumnTest2() {
        int[][] array = {{1, 1, 1, 1}, {-1, -2, 0, 1, 2}};

        double[] actual = arithmeticMeanOfColumn(array);
        double[] expected = {1, 0};

        then(actual).containsExactly(expected, Offset.offset(0.01));
    }

    @Test
    void arithmeticMeanOfColumnTest3() {
        int[][] array = {{0, 0, 0, 0}, {-1, 1, -1, 1, -1}};

        double[] actual = arithmeticMeanOfColumn(array);
        double[] expected = {0, -0.2};

        then(actual).containsExactly(expected, Offset.offset(0.01));
    }

    @Test
    void arithmeticMeanOfColumnTest4() {
        int[][] array = {{3, 5, 7, 9}, {-2, -4, -6, -8, -10}};

        double[] actual = arithmeticMeanOfColumn(array);
        double[] expected = {6, -6};

        then(actual).containsExactly(expected, Offset.offset(0.01));
    }

    @Test
    void arithmeticMeanOfColumnTest5() {
        int[][] array = {{}, {1}};

        double[] actual = arithmeticMeanOfColumn(array);
        double[] expected = {0, 1};

        then(actual).containsExactly(expected, Offset.offset(0.01));
    }

    @Test
    void arithmeticMeanOfColumnTest6() {
        int[][] array = {{1}, {}};

        double[] actual = arithmeticMeanOfColumn(array);
        double[] expected = {1, 0};

        then(actual).containsExactly(expected, Offset.offset(0.01));
    }

    @Test
    void arithmeticMeanOfColumnTest7() {
        int[][] array = {};

        double[] actual = arithmeticMeanOfColumn(array);
        double[] expected = {};

        then(actual).containsExactly(expected, Offset.offset(0.01));
    }
}
