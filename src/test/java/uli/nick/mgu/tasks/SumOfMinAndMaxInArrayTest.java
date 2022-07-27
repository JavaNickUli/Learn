package uli.nick.mgu.tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static uli.nick.mgu.tasks.SumOfMinAndMaxInArray.sumOfMaxAndMin;

class SumOfMinAndMaxInArrayTest {

    @Test
    void sumOfMaxAndMinTest0() {
        int[] test = {1, 1};

        int actual = sumOfMaxAndMin(test);
        int expected = 2;

        then(actual == expected).isTrue();
    }

    @Test
    void sumOfMaxAndMinTest1() {
        int[] test = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        int actual = sumOfMaxAndMin(test);
        int expected = -2;

        then(actual == expected).isTrue();
    }

    @Test
    void sumOfMaxAndMinTest2() {
        int[] test = {-1, 0, 1, 0, -1, 0, -2, 2, -1, 0, 1, 0, -1, 0, -2, 2};

        int actual = sumOfMaxAndMin(test);
        int expected = 0;

        then(actual == expected).isTrue();
    }

    @Test
    void sumOfMaxAndMinTest3() {
        int[] test = {-1, -1, -1, -1, 0, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 0};

        int actual = sumOfMaxAndMin(test);
        int expected = 1;

        then(actual == expected).isTrue();
    }

    @Test
    void sumOfMaxAndMinTest4() {
        int[] test = {0, -1, -2, -3, -4, -5, -6, -7, 0, -1, -2, -3, -4, -5, -6, -7};

        int actual = sumOfMaxAndMin(test);
        int expected = -7;

        then(actual == expected).isTrue();
    }

    @Test
    void sumOfMaxAndMinTest5() {
        int[] test = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int actual = sumOfMaxAndMin(test);
        int expected = 15;

        then(actual == expected).isTrue();
    }

    @Test
    void sumOfMaxAndMinTest6() {
        int[] test = {1};

        int actual = sumOfMaxAndMin(test);
        int expected = 2;

        then(actual == expected).isTrue();
    }

    @Test
    void sumOfMaxAndMinTest7() {
        int[] test = {};

        int actual = sumOfMaxAndMin(test);
        int expected = 0;

        then(actual == expected).isTrue();
    }
}