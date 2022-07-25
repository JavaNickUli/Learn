package uli.nick.job4j.praxis.tasks133maphashmap;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class KeySetTest {

    @Test
    void main() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        KeySet.main(null);

        String actual = output.toString();
        String ln = System.lineSeparator();
        String expected = "1 - root@root" + ln
                + "2 - local@local" + ln
                + "3 - host@host" + ln;

        then(actual).isEqualTo(expected);
    }
}
