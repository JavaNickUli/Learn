package uli.nick.test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class OddCountTest {

    @Test
    void count() {
        then(OddCount.count(1, 9)).isEqualTo(5);
    }
}