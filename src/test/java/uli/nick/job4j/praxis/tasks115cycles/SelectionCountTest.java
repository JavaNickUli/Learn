package uli.nick.job4j.praxis.tasks115cycles;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class SelectionCountTest {

    @Test
    void countWhen5And2Then2() {
        int actual = SelectionCount.count(5, 2);
        int expected = 5 / 2;
        then(actual == expected).isTrue();
    }

    @Test
    void countWhen5And4Then1() {
        int actual = SelectionCount.count(5, 4);
        int expected = 5 / 4;
        then(actual == expected).isTrue();
    }

    @Test
    void countWhen5And5Then1() {
        int actual = SelectionCount.count(5, 5);
        int expected = 1;
        then(actual == expected).isTrue();
    }

    @Test
    void countWhen5And6Then0() {
        int actual = SelectionCount.count(5, 6);
        int expected = 5 / 6;
        then(actual == expected).isTrue();
    }
}
