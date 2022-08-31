package uli.nick.stepik.basic.tasks34;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.BDDAssertions.then;

class ComplexNumberTest {

    @Test
    void testEqualsTest0() {
        then(new ComplexNumber(31.573, 9.426).equals(new ComplexNumber(31.573, 9.426))).isTrue();
    }

    @Test
    void testEqualsTest1() {
        then(new ComplexNumber(31.573, 9.426).equals(new ComplexNumber(31.462, 9.426))).isFalse();
    }

    @Test
    void testHashCodeTest0() {
        double[] nums = new double[]{31.573, 9.426};
        then(new ComplexNumber(31.573, 9.426).hashCode() == Arrays.hashCode(nums)).isTrue();
    }
}