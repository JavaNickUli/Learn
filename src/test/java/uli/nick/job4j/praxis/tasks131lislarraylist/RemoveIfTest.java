package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class RemoveIfTest {

    @Test
    void sortList() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");

        List<String> actual = RemoveIf.sortList(list);
        List<String> expected = List.of("three", "seven", "eight");

        then(actual).isEqualTo(expected);
    }
}
