package uli.nick.sandbox;

import org.assertj.core.api.BDDSoftAssertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.assertThat;

class BDDASoftlyTest {

    @Test
    void testList() {
        var actual = List.of("first value", "second value", "third value");
        var expected = List.of("first value", "second value");

        var softly = new BDDSoftAssertions();
        softly.then(actual).contains("first value");
        softly.then(actual).first().isEqualTo("first value");
//        softly.then(actual).containsExactly("first value", "second value"); // fails
//        softly.then(actual).containsExactlyInAnyOrderElementsOf(expected); // fails
        softly.then(actual).doesNotContain("forbidden value", "another value");
        softly.then(actual).allSatisfy(s -> assertThat(s).doesNotStartWith("foo"));
        softly.assertAll();
    }
}