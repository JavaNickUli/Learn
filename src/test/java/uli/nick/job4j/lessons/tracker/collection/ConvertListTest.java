package uli.nick.job4j.lessons.tracker.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class ConvertListTest {

    @Test
    void convertWhen2ArrayToList() {
        List<int[]> array = new ArrayList<>();
        array.add(new int[]{1});
        array.add(new int[]{2, 3});

        List<Integer> actual = ConvertList.convert(array);
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 3));

        then(actual).isEqualTo(expected);
    }

    @Test
    void convertWhen1ArrayToList() {
        List<int[]> array = new ArrayList<>();
        array.add(new int[]{1});

        List<Integer> actual = ConvertList.convert(array);
        List<Integer> expected = new ArrayList<>(List.of(1));

        then(actual).isEqualTo(expected);
    }

    @Test
    void convertWhenArrayIsEmptyThenListIsEmpty() {
        List<int[]> array = new ArrayList<>();
        array.add(new int[]{});

        List<Integer> actual = ConvertList.convert(array);
        List<Integer> expected = new ArrayList<>();

        then(actual).isEqualTo(expected);
    }

    @Test
    void convertWhenArrayIsNullThenListIsEmpty() {
        List<int[]> array = new ArrayList<>();

        List<Integer> actual = ConvertList.convert(array);
        List<Integer> expected = new ArrayList<>();

        then(actual).isEqualTo(expected);
    }
}
