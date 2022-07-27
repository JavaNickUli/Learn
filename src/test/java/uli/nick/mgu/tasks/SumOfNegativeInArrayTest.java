package uli.nick.mgu.tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static uli.nick.mgu.tasks.SumOfNegativeInArray.sumOfNegative;

class SumOfNegativeInArrayTest {

    @Test
    void sumOfNegativeTest0() {
        int[] test = {1, 1};

        int actual = sumOfNegative(test);
        int expected = 0;

        then(actual == expected).isTrue();
    }

    @Test
    void sumOfNegativeTest1() {
        int[] test = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        int actual = sumOfNegative(test);
        int expected = -16;

        then(actual == expected).isTrue();
    }

    @Test
    void sumOfNegativeTest2() {
        int[] test = {-1, 0, 1, 0, -1, 0, -2, 2, -1, 0, 1, 0, -1, 0, -2, 2};

        int actual = sumOfNegative(test);
        int expected = -8;

        then(actual == expected).isTrue();
    }

    @Test
    void sumOfNegativeTest3() {
        int[] test = {-1, -1, -1, -1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0};

        int actual = sumOfNegative(test);
        int expected = -4;

        then(actual == expected).isTrue();
    }

    @Test
    void sumOfNegativeTest4() {
        int[] test = {0, -1, -2, -3, -4, -5, -6, -7, 0, -1, -2, -3, -4, -5, -6, -7};

        int actual = sumOfNegative(test);
        int expected = -56;

        then(actual == expected).isTrue();
    }

    @Test
    void sumOfNegativeTest5() {
        int[] test = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int actual = sumOfNegative(test);
        int expected = 0;

        then(actual == expected).isTrue();
    }
}
