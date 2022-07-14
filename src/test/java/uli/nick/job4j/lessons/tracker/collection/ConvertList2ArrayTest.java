package uli.nick.job4j.lessons.tracker.collection;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class ConvertList2ArrayTest {

    @Test
    void mainCheckingConsoleOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        ConvertList2Array.main(null);

        String actual = out.toString();
        String ln = System.lineSeparator();
        String expected = String.join(ln, "1 2 3", "4 5 6", "7 0 0") + ln;

        then(actual).isEqualToIgnoringWhitespace(expected);
    }

    @Test
    void toArrayWhen7Elements3CellsThen3X3Array() {
        int[][] actual = ConvertList2Array.toArray(List.of(1, 2, 3, 4, 5, 6, 7), 3);
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 0, 0}};

        then(actual).isEqualTo(expected);
    }

    @Test
    void toArrayWhen5Elements2CellsThen3X2Array() {
        int[][] actual = ConvertList2Array.toArray(List.of(1, 2, 3, 4, 5), 2);
        int[][] expected = {{1, 2}, {3, 4}, {5, 0}};

        then(actual).isEqualTo(expected);
    }

    @Test
    void toArrayWhen5Elements7CellsThen1X7Array() {
        int[][] actual = ConvertList2Array.toArray(List.of(1, 2, 3, 4, 5), 7);
        int[][] expected = {{1, 2, 3, 4, 5, 0, 0}};

        then(actual).isEqualTo(expected);
    }

    @Test
    void toArrayWhen9Elements3CellsThen3X3Array() {
        int[][] actual = ConvertList2Array.toArray(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), 3);
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        then(actual).isEqualTo(expected);
    }

    @Test
    void toArrayWhen5Elements1CellsThen5X1Array() {
        int[][] actual = ConvertList2Array.toArray(List.of(1, 2, 3, 4, 5), 1);
        int[][] expected = {{1}, {2}, {3}, {4}, {5}};

        then(actual).isEqualTo(expected);
    }

    @Test
    void toArrayWhen0Elements1CellsThenArrayIsEmpty() {
        int[][] actual = ConvertList2Array.toArray(List.of(), 1);
        int[][] expected = {};

        then(actual).isEqualTo(expected);
    }

    @Test
    void toArrayWhen1Elements0CellsThenOutOfMemoryError() {
        try {
            ConvertList2Array.toArray(List.of(1), 0);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e) {
            then(e.getMessage()).isEqualTo("Requested array size exceeds VM limit");
        }
    }
}
