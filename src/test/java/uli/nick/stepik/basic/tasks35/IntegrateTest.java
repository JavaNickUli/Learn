package uli.nick.stepik.basic.tasks35;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.offset;
import static org.assertj.core.api.BDDAssertions.then;

class IntegrateTest {

    @Test
    void integrateTest0() {
        double actual = Integrate.integrate(x -> 1, 0, 10);
        double expected = 10;

        then(actual).isEqualTo(expected, offset(0.001));
    }

    @Test
    void integrateTest1() {
        double actual = Integrate.integrate(x -> 1, 2, 8);
        double expected = 6;

        then(actual).isEqualTo(expected, offset(0.001));
    }

    @Test
    void integrateTest2() {
        double actual = Integrate.integrate(x -> x * x, 2, 8);
        double expected = 168;

        then(actual).isEqualTo(expected, offset(0.001));
    }

    @Test
    void integrateTest3() {
        double actual = Integrate.integrate(x -> 2 * x + 4, 2, 8);
        double expected = 84;

        then(actual).isEqualTo(expected, offset(0.001));
    }
}
