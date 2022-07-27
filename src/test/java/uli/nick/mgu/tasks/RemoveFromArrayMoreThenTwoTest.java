package uli.nick.mgu.tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static uli.nick.mgu.tasks.RemoveFromArrayMoreThenTwo.removeMoreThanTwo;

class RemoveFromArrayMoreThenTwoTest {

    @Test
    void removeMoreThanTwoTest0() {
        int[] test = {1, 1};

        int[] actual = removeMoreThanTwo(test);
        int[] expected = {1, 1};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeMoreThanTwoTest1() {
        int[] test = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int[] actual = removeMoreThanTwo(test);
        int[] expected = {1, 1};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeMoreThanTwoTest2() {
        int[] test = {-1, 0, 1, 0, -1, 0, -2, 2, -1, 0, 1, 0, -1, 0, -2, 2};

        int[] actual = removeMoreThanTwo(test);
        int[] expected = {-1, 0, 1, 0, -1, -2, 2, 1, -2, 2};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeMoreThanTwoTest3() {
        int[] test = {-1, -1, -1, -1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0};

        int[] actual = removeMoreThanTwo(test);
        int[] expected = {-1, -1, 0, 0, 1, 1};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeMoreThanTwoTest4() {
        int[] test = {0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7};

        int[] actual = removeMoreThanTwo(test);
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeMoreThanTwoTest5() {
        int[] test = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int[] actual = removeMoreThanTwo(test);
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeMoreThanTwoTest6() {
        int[] test = {1};

        int[] actual = removeMoreThanTwo(test);
        int[] expected = {1};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeMoreThanTwoTest7() {
        int[] test = {};

        int[] actual = removeMoreThanTwo(test);
        int[] expected = {};

        then(actual).isEqualTo(expected);
    }
}
