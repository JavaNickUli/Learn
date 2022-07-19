package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class AddAllElementsListTest {

    @Test
    void containsElementWhenListContainsDuplicate() {
        List<String> left = new ArrayList<>();
        left.add("one");
        left.add("two");
        left.add("three");
        List<String> right = new ArrayList<>();
        right.add("four");
        right.add("two");
        right.add("five");
        String str = "two";

        int index = AddAllElementsList.containsElement(left, right, str);

        then(left.size() == 5).isTrue();
        then(index == 3).isTrue();
    }

    @Test
    void containsElementWhenListNotContainsDuplicate() {
        List<String> left = new ArrayList<>();
        left.add("one");
        left.add("two");
        left.add("three");
        List<String> right = new ArrayList<>();
        right.add("four");
        right.add("five");
        String str = "two";

        int index = AddAllElementsList.containsElement(left, right, str);

        then(left.size() == 5).isTrue();
        then(index == 1).isTrue();
    }
}
