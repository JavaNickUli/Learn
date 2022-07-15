package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class AddElementTest {

    @Test
    void addNewElementWhenListContainThenTrue() {
        List<String> list = new ArrayList<>(List.of("first", "second", "third"));

        then(AddElement.addNewElement(list, "fourth")).isTrue();
    }

    @Test
    void addNewElementWhenListIsEmptyThenTrue() {
        List<String> list = new ArrayList<>(List.of());

        then(AddElement.addNewElement(list, null)).isTrue();
    }

    @Test
    void addNewElementWhenListIsNullThenException() {
        try {
            AddElement.addNewElement(null, null);
        } catch (NullPointerException e) {
            then(e.getMessage()).isEqualTo(
                    "Cannot invoke \"java.util.Collection.toArray()\" because \"c\" is null");
        }
    }
}
