package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class RepositionElementTest {
    private List<String> list = new ArrayList<>();

    @BeforeEach
    public void setList() {
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
    }

    @Test
    void changePositionWhenIndexInOfBound() {
        int index = 3;
        List<String> actual = RepositionElement.changePosition(list, index);

        then(actual.size()).isEqualTo(8);
        then(actual.get(index)).isEqualTo("nine");
    }

    @Test
    void changePositionWhenIndexOutOfBound() {
        int index = 10;
        List<String> actual = RepositionElement.changePosition(list, index);

        then(actual.size()).isEqualTo(8);
        then(actual.contains("nine")).isFalse();
    }
}
