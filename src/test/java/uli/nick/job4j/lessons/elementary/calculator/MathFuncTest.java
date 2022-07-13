package uli.nick.job4j.lessons.elementary.calculator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class MathFuncTest {

    @Test
    void mainCheckOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathFunc.main(null);

        String actual = out.toString();
        String expected = "10011" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }

    @Test
    void function1WhenNeg5Then26() {
        int actual = MathFunc.function1(-5);
        then(actual == 26).isTrue();
    }

    @Test
    void function1When0Then26() {
        int actual = MathFunc.function1(0);
        then(actual == 1).isTrue();
    }

    @Test
    void function1When5Then26() {
        int actual = MathFunc.function1(5);
        then(actual == 26).isTrue();
    }

    @Test
    void function2WhenNeg1ThenNeg1() {
        int actual = MathFunc.function2(-1);
        then(actual == -1).isTrue();
    }

    @Test
    void function2When0ThenDivByZero() {
        try {
            int actual = MathFunc.function2(0);
        } catch (Exception e) {
            then(e.getMessage()).isEqualTo("/ by zero");
        }

    }

    @Test
    void function2When1Then1() {
        int actual = MathFunc.function2(1);
        then(actual == 1).isTrue();
    }

    @Test
    void function2When5Then0() {
        int actual = MathFunc.function2(5);
        then(actual == 0).isTrue();
    }
}
