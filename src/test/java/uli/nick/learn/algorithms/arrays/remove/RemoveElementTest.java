package uli.nick.learn.algorithms.arrays.remove;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class RemoveElementTest {

    @Test
    void removeElementTest0() {
        int[] test = {1, 2, 3, 4, 5};

        int[] actual = RemoveElement.removeElement(test, 3);
        int[] expected = {1, 2, 4, 5};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeElementTest1() {
        int[] test = {3, 3, 3, 3, 3};

        int[] actual = RemoveElement.removeElement(test, 3);
        int[] expected = {};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeElementTest2() {
        int[] test = {3, 1, 3, 1, 3};

        int[] actual = RemoveElement.removeElement(test, 3);
        int[] expected = {1, 1};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeElementTest3() {
        int[] test = {1, 3, 1, 3, 1};

        int[] actual = RemoveElement.removeElement(test, 3);
        int[] expected = {1, 1, 1};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeElementTest4() {
        int[] test = {1};

        int[] actual = RemoveElement.removeElement(test, 3);
        int[] expected = {1};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeElementTest5() {
        int[] test = {3};

        int[] actual = RemoveElement.removeElement(test, 3);
        int[] expected = {};

        then(actual).isEqualTo(expected);
    }

    @Test
    void removeElementTest6() {
        int[] test = {};

        int[] actual = RemoveElement.removeElement(test, 3);
        int[] expected = {};

        then(actual).isEqualTo(expected);
    }
}
