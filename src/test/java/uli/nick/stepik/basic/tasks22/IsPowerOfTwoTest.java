package uli.nick.stepik.basic.tasks22;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class IsPowerOfTwoTest {

    @Test
    void isPowerOfTwoTest0() {
        then(IsPowerOfTwo.isPowerOfTwo(0)).isFalse();
    }

    @Test
    void isPowerOfTwoTest1() {
        then(IsPowerOfTwo.isPowerOfTwo(1)).isTrue();
    }

    @Test
    void isPowerOfTwoTest2() {
        then(IsPowerOfTwo.isPowerOfTwo(-2)).isTrue();
    }

    @Test
    void isPowerOfTwoTest3() {
        then(IsPowerOfTwo.isPowerOfTwo(-3)).isFalse();
    }

    @Test
    void isPowerOfTwoTest4() {
        then(IsPowerOfTwo.isPowerOfTwo(-4)).isTrue();
    }
}
