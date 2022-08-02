package uli.nick.sandbox;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class BinaryTest {

    @Test
    void intToBinary() {
        double actual = 23.90;
        double expected = 23.90;

        assertThat(actual).isCloseTo(expected, offset(0.01D));
    }
}