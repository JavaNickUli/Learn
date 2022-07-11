package uli.nick.job4j.lessons.tasks111firstprogram;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class MultiplyTest {

    @Test
    void checkTestOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Multiply.main(null);

        String ln = System.lineSeparator();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i < 10; i++) {
            stringBuilder.append("1 * ").append(i).append(" = ").append(i).append(ln);
        }

        String actual = out.toString();
        String expected = stringBuilder.toString();

        then(actual).isEqualTo(expected);
    }
}
