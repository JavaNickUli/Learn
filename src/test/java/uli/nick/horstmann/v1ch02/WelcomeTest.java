package uli.nick.horstmann.v1ch02;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class WelcomeTest {

    @Test
    void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Welcome1.main(null);

        String actual = out.toString();
        String expect =
                "Welcome to Core Java!" +
                        "=====================";

        then(actual).containsIgnoringWhitespaces(expect);
    }
}
