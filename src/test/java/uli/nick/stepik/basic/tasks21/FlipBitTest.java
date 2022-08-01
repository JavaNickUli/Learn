package uli.nick.stepik.basic.tasks21;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class FlipBitTest {

    @Test
    void flipBitTest0() {
        then(FlipBit.flipBit(0, 1) == 1).isTrue();
    }

    @Test
    void flipBitTest1() {
        then(FlipBit.flipBit(0, 7) == 64).isTrue();
    }

    @Test
    void flipBitTest2() {
        then(FlipBit.flipBit(500, 5) == 484).isTrue();
    }

    @Test
    void flipBitTest3() {
        then(FlipBit.flipBit(-1, 32) == 2147483647).isTrue();
    }
}
