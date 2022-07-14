package uli.nick.job4j.lessons.tracker.list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class ConvertMatrix2ListTest {

    @Test
    void toListWhenArray2X2ThenList4() {
        ConvertMatrix2List convert = new ConvertMatrix2List();
        int[][] array = {{1, 2}, {3, 4}};

        List<Integer> actual = convert.toList(array);
        List<Integer> expected = List.of(1, 2, 3, 4);

        then(actual).isEqualTo(expected);
    }

    @Test
    void toListWhenArray2X3ThenList6() {
        ConvertMatrix2List convert = new ConvertMatrix2List();
        int[][] array = {{1, 2, 3}, {4, 5, 6}};

        List<Integer> actual = convert.toList(array);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);

        then(actual).isEqualTo(expected);
    }

    @Test
    void toListWhenArray1X3ThenList3() {
        ConvertMatrix2List convert = new ConvertMatrix2List();
        int[][] array = {{1, 2, 3}};

        List<Integer> actual = convert.toList(array);
        List<Integer> expected = List.of(1, 2, 3);

        then(actual).isEqualTo(expected);
    }

    @Test
    void toListWhenArray3X1ThenList3() {
        ConvertMatrix2List convert = new ConvertMatrix2List();
        int[][] array = {{1}, {2}, {3}};

        List<Integer> actual = convert.toList(array);
        List<Integer> expected = List.of(1, 2, 3);

        then(actual).isEqualTo(expected);
    }

    @Test
    void toListWhenArrayIsEmptyThenListIsEmpty() {
        ConvertMatrix2List convert = new ConvertMatrix2List();
        int[][] array = {};

        List<Integer> actual = convert.toList(array);
        List<Integer> expected = List.of();

        then(actual).isEqualTo(expected);
    }

    @Test
    void toListWhenArrayIsNullThenException() {
        ConvertMatrix2List convert = new ConvertMatrix2List();

        try {
            convert.toList(null);
        } catch (Exception e) {
            then(e.getMessage()).isEqualTo("Cannot read the array length because \"<local3>\" is null");
        }
    }
}
