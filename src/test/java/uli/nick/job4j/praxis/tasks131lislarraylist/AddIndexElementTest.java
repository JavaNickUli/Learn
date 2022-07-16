package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class AddIndexElementTest {

    @Test
    void addNewElementWhenPresentThenFalse() {
        List<String> list = new ArrayList<>(List.of("one", "two", "three", "four"));

        then(AddIndexElement.addNewElement(list, 1, "two")).isFalse();
    }

    @Test
    void addNewElementWhenNotPresentThenTrue() {
        List<String> list = new ArrayList<>(List.of("one", "two", "three", "four"));

        then(AddIndexElement.addNewElement(list, 4, "five")).isTrue();
    }

    @Test
    void addNewElementWhenIsEmptyThenTrue() {
        List<String> list = new ArrayList<>(List.of());

        then(AddIndexElement.addNewElement(list, 0, "one")).isTrue();
    }

    @Test
    void addNewElementWhenIndexOutThenException() {
        try {
            AddIndexElement.addNewElement(new ArrayList<>(List.of()), 1, "one");
        } catch (IndexOutOfBoundsException e) {
            then(e.getMessage()).isEqualTo("Index: 1, Size: 0");
        }
    }
}
