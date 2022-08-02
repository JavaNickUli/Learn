package uli.nick.stepik.basic.tasks24;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class MergeArraysTest {

    @Test
    void mergeArraysTest0() {
        int[] test1 = {0, 2, 2};
        int[] test2 = {1, 3};
        then(MergeArrays.mergeArrays(test1, test2)).isEqualTo(new int[]{0, 1, 2, 2, 3});
    }

    @Test
    void mergeArraysTest1() {
        int[] test1 = {0, 0, 0};
        int[] test2 = {1, 1};
        then(MergeArrays.mergeArrays(test1, test2)).isEqualTo(new int[]{0, 0, 0, 1, 1});
    }

    @Test
    void mergeArraysTest2() {
        int[] test1 = {0, 2, 2};
        int[] test2 = {1, 3};
        then(MergeArrays.mergeArrays(test1, test2)).isEqualTo(new int[]{0, 1, 2, 2, 3});
    }

    @Test
    void mergeArraysTest3() {
        int[] test1 = {};
        int[] test2 = {1, 1};
        then(MergeArrays.mergeArrays(test1, test2)).isEqualTo(new int[]{1, 1});
    }
}
