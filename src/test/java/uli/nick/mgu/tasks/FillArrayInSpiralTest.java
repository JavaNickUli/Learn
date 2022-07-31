package uli.nick.mgu.tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class FillArrayInSpiralTest {

    @Test
    void fillInSpiralTest0() {
        int[][] actual = FillArrayInSpiral.fillInSpiral(10, 10);
        int[][] expected = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {36, 37, 38, 39, 40, 41, 42, 43, 44, 11},
                {35, 64, 65, 66, 67, 68, 69, 70, 45, 12},
                {34, 63, 84, 85, 86, 87, 88, 71, 46, 13},
                {33, 62, 83, 96, 97, 98, 89, 72, 47, 14},
                {32, 61, 82, 95, 100, 99, 90, 73, 48, 15},
                {31, 60, 81, 94, 93, 92, 91, 74, 49, 16},
                {30, 59, 80, 79, 78, 77, 76, 75, 50, 17},
                {29, 58, 57, 56, 55, 54, 53, 52, 51, 18},
                {28, 27, 26, 25, 24, 23, 22, 21, 20, 19}
        };

        then(actual).isEqualTo(expected);
    }

    @Test
    void fillInSpiralTest1() {
        int[][] actual = FillArrayInSpiral.fillInSpiral(5, 10);
        int[][] expected = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {26, 27, 28, 29, 30, 31, 32, 33, 34, 11},
                {25, 44, 45, 46, 47, 48, 49, 50, 35, 12},
                {24, 43, 42, 41, 40, 39, 38, 37, 36, 13},
                {23, 22, 21, 20, 19, 18, 17, 16, 15, 14}
        };

        then(actual).isEqualTo(expected);
    }

    @Test
    void fillInSpiralTest2() {
        int[][] actual = FillArrayInSpiral.fillInSpiral(10, 5);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {26, 27, 28, 29, 6},
                {25, 44, 45, 30, 7},
                {24, 43, 46, 31, 8},
                {23, 42, 47, 32, 9},
                {22, 41, 48, 33, 10},
                {21, 40, 49, 34, 11},
                {20, 39, 50, 35, 12},
                {19, 38, 37, 36, 13},
                {18, 17, 16, 15, 14}
        };

        then(actual).isEqualTo(expected);
    }

    @Test
    void fillInSpiralTest3() {
        int[][] actual = FillArrayInSpiral.fillInSpiral(10, 10);
        int[][] expected = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {36, 37, 38, 39, 40, 41, 42, 43, 44, 11},
                {35, 64, 65, 66, 67, 68, 69, 70, 45, 12},
                {34, 63, 84, 85, 86, 87, 88, 71, 46, 13},
                {33, 62, 83, 96, 97, 98, 89, 72, 47, 14},
                {32, 61, 82, 95, 100, 99, 90, 73, 48, 15},
                {31, 60, 81, 94, 93, 92, 91, 74, 49, 16},
                {30, 59, 80, 79, 78, 77, 76, 75, 50, 17},
                {29, 58, 57, 56, 55, 54, 53, 52, 51, 18},
                {28, 27, 26, 25, 24, 23, 22, 21, 20, 19}
        };

        then(actual).isEqualTo(expected);
    }

    @Test
    void fillInSpiralTest4() {
        int[][] actual = FillArrayInSpiral.fillInSpiral(10, 10);
        int[][] expected = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {36, 37, 38, 39, 40, 41, 42, 43, 44, 11},
                {35, 64, 65, 66, 67, 68, 69, 70, 45, 12},
                {34, 63, 84, 85, 86, 87, 88, 71, 46, 13},
                {33, 62, 83, 96, 97, 98, 89, 72, 47, 14},
                {32, 61, 82, 95, 100, 99, 90, 73, 48, 15},
                {31, 60, 81, 94, 93, 92, 91, 74, 49, 16},
                {30, 59, 80, 79, 78, 77, 76, 75, 50, 17},
                {29, 58, 57, 56, 55, 54, 53, 52, 51, 18},
                {28, 27, 26, 25, 24, 23, 22, 21, 20, 19}
        };

        then(actual).isEqualTo(expected);
    }

    @Test
    void fillInSpiralTest5() {
        int[][] actual = FillArrayInSpiral.fillInSpiral(1, 10);
        int[][] expected = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};

        then(actual).isEqualTo(expected);
    }

    @Test
    void fillInSpiralTest6() {
        int[][] actual = FillArrayInSpiral.fillInSpiral(10, 1);
        int[][] expected = {{1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10}};

        then(actual).isEqualTo(expected);
    }

    @Test
    void fillInSpiralTest7() {
        int[][] actual = FillArrayInSpiral.fillInSpiral(0, 0);
        int[][] expected = {};

        then(actual).isEqualTo(expected);
    }
}
