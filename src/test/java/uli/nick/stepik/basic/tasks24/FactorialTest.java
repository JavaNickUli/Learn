package uli.nick.stepik.basic.tasks24;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class FactorialTest {

    @Test
    void factorialTest0() {
        then(Factorial.factorial(3)).isEqualTo(6);
    }

    @Test
    void factorialTest01() {
        then(Factorial.factorial(1)).isEqualTo(1);
    }

    @Test
    void factorialTest02() {
        then(Factorial.factorial(5)).isEqualTo(120);
    }

    @Test
    void factorialTest03() {
        then(Factorial.factorial(0)).isEqualTo(1);
    }
}
