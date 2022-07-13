package uli.nick.job4j.lessons.tracker.collection;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class UsageArrayListTest {

    @Test
    void mainCheckOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        UsageArrayList.main(null);

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "Petr", "Ivan", "Stepan") + ln;

        then(actual).isEqualTo(expected);
    }
}
