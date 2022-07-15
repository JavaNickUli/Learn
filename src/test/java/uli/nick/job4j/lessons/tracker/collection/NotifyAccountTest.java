package uli.nick.job4j.lessons.tracker.collection;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class NotifyAccountTest {

    @Test
    void sentWithoutDuplicate() {
        HashSet<Account> actual = NotifyAccount.sent(List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        ));
        HashSet<Account> expected = new HashSet<>(List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        ));

        then(actual).isEqualTo(expected);
    }

    @Test
    void sentWithDuplicate() {
        HashSet<Account> actual = NotifyAccount.sent(List.of(
                new Account("142", "Petr Arsentev", "000001"),
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        ));
        HashSet<Account> expected = new HashSet<>(List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        ));

        then(actual).isEqualTo(expected);
    }

    @Test
    void sentIsEmpty() {
        HashSet<Account> actual = NotifyAccount.sent(List.of());
        HashSet<Account> expected = new HashSet<>(List.of());

        then(actual).isEqualTo(expected);
    }

    @Test
    void sentNull() {
        try {
            NotifyAccount.sent(null);
        } catch (NullPointerException e) {
            then(e.getMessage()).isEqualTo(
                    "Cannot invoke \"java.util.List.iterator()\" because \"accounts\" is null");
        }
    }
}
