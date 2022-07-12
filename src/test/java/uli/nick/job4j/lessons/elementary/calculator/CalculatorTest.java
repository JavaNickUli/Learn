package uli.nick.job4j.lessons.elementary.calculator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class CalculatorTest {

    @Test
    void checkTestOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculator.main(null);

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "3", "8", "3", "3") + ln;

        then(actual).isEqualTo(expected);
    }
}
