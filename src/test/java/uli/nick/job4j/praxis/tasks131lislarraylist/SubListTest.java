package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class SubListTest {
    private List<String> list = new ArrayList<>();

    @BeforeEach
    void setUp() {
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("three");
        list.add("ten");
    }

    @Test
    void getElementsBetweenIndexes() {
        List<String> actual = SubList.getElementsBetweenIndexes(list, "three");
        List<String> expected = List.of("three", "four", "five", "six", "seven", "eight");

        then(actual).isEqualTo(expected);
    }

    @Test
    void getElementsBetweenIndexesIsEmpty() {
        List<String> actual = SubList.getElementsBetweenIndexes(list, "five");
        List<String> expected = List.of();

        then(actual).isEqualTo(expected);
    }
}
