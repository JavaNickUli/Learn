package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class UniqueElementTest {

    @Test
    void checkListWhenFindUniqueThenTrue() {
        List<String> list = List.of("one", "two", "three");

        then(UniqueElement.checkList(list, "two")).isTrue();
    }

    @Test
    void checkListWhenFindNotUniqueThenFalse() {
        List<String> list = List.of("one", "two", "one");

        then(UniqueElement.checkList(list, "one")).isFalse();
    }

    @Test
    void checkListWhenFindIsEmptyThenFalse() {
        List<String> list = List.of("one", "two", "three");

        then(UniqueElement.checkList(list, "four")).isFalse();
    }
}
