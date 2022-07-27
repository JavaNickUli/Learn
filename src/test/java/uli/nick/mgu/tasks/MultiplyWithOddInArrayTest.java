package uli.nick.mgu.tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static uli.nick.mgu.tasks.MultiplyWithOddInArray.multiplyWithOdd;

class MultiplyWithOddInArrayTest {

    @Test
    void multiplyWithOddTest0() {
        int[] test = {1, 1};

        int actual = multiplyWithOdd(test);
        int expected = 1;

        then(actual == expected).isTrue();
    }

    @Test
    void multiplyWithOddTest1() {
        int[] test = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        int actual = multiplyWithOdd(test);
        int expected = 1;

        then(actual == expected).isTrue();
    }

    @Test
    void multiplyWithOddTest2() {
        int[] test = {-1, 2, 1, 2, -1, 2, -2, 2, -1, 2, 1, 2, -1, 2, -2, -2};

        int actual = multiplyWithOdd(test);
        int expected = -256;

        then(actual == expected).isTrue();
    }

    @Test
    void multiplyWithOddTest3() {
        int[] test = {0, -1, 0, 1, 0, 2, 0, 1, 0, -1, 0, -2, 0, -1, 0, -2};

        int actual = multiplyWithOdd(test);
        int expected = -8;

        then(actual == expected).isTrue();
    }

    @Test
    void multiplyWithOddTest4() {
        int[] test = {0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7};

        int actual = multiplyWithOdd(test);
        int expected = 11025;

        then(actual == expected).isTrue();
    }

    @Test
    void multiplyWithOddTest5() {
        int[] test = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 0};

        int actual = multiplyWithOdd(test);
        int expected = 0;

        then(actual == expected).isTrue();
    }

    @Test
    void multiplyWithOddTest6() {
        int[] test = {1};

        int actual = multiplyWithOdd(test);
        int expected = 0;

        then(actual == expected).isTrue();
    }

    @Test
    void multiplyWithOddTest7() {
        int[] test = {};

        int actual = multiplyWithOdd(test);
        int expected = 0;

        then(actual == expected).isTrue();
    }
}
