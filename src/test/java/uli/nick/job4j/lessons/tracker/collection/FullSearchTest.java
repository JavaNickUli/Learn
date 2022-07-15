package uli.nick.job4j.lessons.tracker.collection;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class FullSearchTest {

    @Test
    void extractNumberWhenList1n2n1ThenSet1n2() {
        List<Task> list = List.of(
                new Task("1", "First desc"),
                new Task("2", "Second desc"),
                new Task("1", "First desc")
        );

        HashSet<String> actual = FullSearch.extractNumber(list);
        HashSet<String> expected = new HashSet<>(List.of("1", "2"));

        then(actual).isEqualTo(expected);
    }

    @Test
    void extractNumberWhenList2n1n2ThenSet1n2() {
        List<Task> list = List.of(
                new Task("2", "Second desc"),
                new Task("1", "First desc"),
                new Task("2", "Second desc")
        );

        HashSet<String> actual = FullSearch.extractNumber(list);
        HashSet<String> expected = new HashSet<>(List.of("1", "2"));

        then(actual).isEqualTo(expected);
    }

    @Test
    void extractNumberWhenList1ThenSet1() {
        List<Task> list = List.of(new Task("1", "First desc"));

        HashSet<String> actual = FullSearch.extractNumber(list);
        HashSet<String> expected = new HashSet<>(List.of("1"));

        then(actual).isEqualTo(expected);
    }

    @Test
    void extractNumberWhenListIsEmptyThenSetIsEmpty() {
        List<Task> list = List.of();

        HashSet<String> actual = FullSearch.extractNumber(list);
        HashSet<String> expected = new HashSet<>(List.of());

        then(actual).isEqualTo(expected);
    }

    @Test
    void extractNumberWhenListIsNullThenException() {
        try {
            HashSet<String> actual = FullSearch.extractNumber(null);
        } catch (Exception e) {
            then(e.getMessage()).isEqualTo(
                    "Cannot invoke \"java.util.List.iterator()\" because \"list\" is null");
        }
    }
}
