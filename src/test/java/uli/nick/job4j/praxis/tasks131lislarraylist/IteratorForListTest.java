package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class IteratorForListTest {

    @Test
    void mainCheckingConsoleOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        IteratorForList.main(null);

        String actual = output.toString();
        String ln = System.lineSeparator();
        String expected = "Next element has - true, this element is one" + ln
                + "Next element has - true, this element is two" + ln
                + "Next element has - true, this element is three" + ln
                + "Next element has - true, this element is four" + ln
                + "Next element has - true, this element is five" + ln
                + "Next element has - false" + ln;

        then(actual).isEqualTo(expected);
    }
}
