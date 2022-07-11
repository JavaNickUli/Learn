package uli.nick.job4j.lessons.elementary;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class MainTest {

    @Test
    void checkTestOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Main.main(null);

        String actual = out.toString();
        String expected = "Hello World" + System.lineSeparator();

        then(actual).isEqualTo(expected);
    }
}
