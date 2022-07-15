package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class CheckerAndGetterTest {

    @Test
    void getElementWhenListIsEmptyThenNone() {
        String actual = CheckerAndGetter.getElement(List.of());
        String expected = "";

        then(actual).isEqualTo(expected);
    }

    @Test
    void getElementWhenListContainsThenFirstString() {
        String actual = CheckerAndGetter.getElement(List.of("first", "second", "third"));
        String expected = "first";

        then(actual).isEqualTo(expected);
    }

    @Test
    void getElementWhenListIsNullThenException() {
        try {
            CheckerAndGetter.getElement(null);
        } catch (NullPointerException e) {
            then(e.getMessage()).isEqualTo(
                    "Cannot invoke \"java.util.List.isEmpty()\" because \"list\" is null");
        }
    }
}
