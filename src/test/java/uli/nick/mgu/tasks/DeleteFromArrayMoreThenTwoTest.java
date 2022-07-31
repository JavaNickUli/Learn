package uli.nick.mgu.tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class DeleteFromArrayMoreThenTwoTest {

    @Test
    void deleteMoreThenTwoTest0() {
        int[] test = {3, 4, 5, 3, 6, 7, 3, 3, 1};

        int[] actual = DeleteFromArrayMoreThenTwo.deleteMoreThenTwo(test);
        int[] expected = {4, 5, 6, 7, 1};

        then(actual).isEqualTo(expected);
    }

    @Test
    void deleteMoreThenTwoTest1() {
        int[] test = {3, 3, 3, 3, 6, 7, 3, 3, 1};

        int[] actual = DeleteFromArrayMoreThenTwo.deleteMoreThenTwo(test);
        int[] expected = {6, 7, 1};

        then(actual).isEqualTo(expected);
    }

    @Test
    void deleteMoreThenTwoTest2() {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] actual = DeleteFromArrayMoreThenTwo.deleteMoreThenTwo(test);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        then(actual).isEqualTo(expected);
    }

    @Test
    void deleteMoreThenTwoTest3() {
        int[] test = {1, 2, 3, 4, 5, 4, 3, 2, 1};

        int[] actual = DeleteFromArrayMoreThenTwo.deleteMoreThenTwo(test);
        int[] expected = {1, 2, 3, 4, 5, 4, 3, 2, 1};

        then(actual).isEqualTo(expected);
    }

    @Test
    void deleteMoreThenTwoTest4() {
        int[] test = {1, 1, 1, 2, 2, 2, 3, 3, 3};

        int[] actual = DeleteFromArrayMoreThenTwo.deleteMoreThenTwo(test);
        int[] expected = {};

        then(actual).isEqualTo(expected);
    }

    @Test
    void deleteMoreThenTwoTest5() {
        int[] test = {3, 3, 3, 3, 3, 3, 3, 3, 3};

        int[] actual = DeleteFromArrayMoreThenTwo.deleteMoreThenTwo(test);
        int[] expected = {};

        then(actual).isEqualTo(expected);
    }

    @Test
    void deleteMoreThenTwoTest6() {
        int[] test = {1, 1, 3, 3, 3, 3, 3, 3, 3};

        int[] actual = DeleteFromArrayMoreThenTwo.deleteMoreThenTwo(test);
        int[] expected = {1, 1};

        then(actual).isEqualTo(expected);
    }

    @Test
    void deleteMoreThenTwoTest7() {
        int[] test = {3, 3, 3, 3, 3, 3, 3, 1, 1};

        int[] actual = DeleteFromArrayMoreThenTwo.deleteMoreThenTwo(test);
        int[] expected = {1, 1};

        then(actual).isEqualTo(expected);
    }

    @Test
    void deleteMoreThenTwoTest8() {
        int[] test = {};

        int[] actual = DeleteFromArrayMoreThenTwo.deleteMoreThenTwo(test);
        int[] expected = {};

        then(actual).isEqualTo(expected);
    }
}
