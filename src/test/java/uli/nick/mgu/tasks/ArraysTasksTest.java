package uli.nick.mgu.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

class ArraysTasksTest {
    static int[] test = new int[100000];

    @BeforeEach
    void setUp() {
        Random random = new Random(123L);
        for (int i = 0; i < test.length; i++) {
            test[i] = random.nextInt();
        }
    }

    @Test
    void removeMoreThanTwoA() {
        ArraysTasks.removeMoreThanTwo(test);
    }

    @Test
    void removeMoreThanTwo2A() {
        ArraysTasks.removeMoreThanTwo2(test);
    }

    @Test
    void removeMoreThanTwoB() {
        ArraysTasks.removeMoreThanTwo(test);
    }

    @Test
    void removeMoreThanTwo2B() {
        ArraysTasks.removeMoreThanTwo2(test);
    }

    @Test
    void removeMoreThanTwoC() {
        ArraysTasks.removeMoreThanTwo(test);
    }

    @Test
    void removeMoreThanTwo2C() {
        ArraysTasks.removeMoreThanTwo2(test);
    }

    @Test
    void removeMoreThanTwoD() {
        ArraysTasks.removeMoreThanTwo(test);
    }

    @Test
    void removeMoreThanTwo2D() {
        ArraysTasks.removeMoreThanTwo2(test);
    }
}