package uli.nick.job4j.lessons.elementary.calculator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class ArgMethodTest {

    @Test
    void mainCheckOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        ArgMethod.main(null);

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = "Hello, Job4j, age = 6" + ln
                + "Hello, Job4j, age = 6" + ln
                + "Hello, Job4j, age = 6" + ln
                + "Hello, Job4j, age = 6" + ln;

        then(actual).isEqualTo(expected);
    }

    @Test
    void helloCheckOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        ArgMethod.hello("Job4j", 6);

        String actual = out.toString();
        String expected = "Hello, Job4j, age = 6" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }
}
