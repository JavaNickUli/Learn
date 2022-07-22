package uli.nick.job4j.praxis.tasks132sethashset;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.BDDAssertions.then;

class FirewallTest {

    @Test
    void checkName() {
        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Создание многомодульного Gradle проекта SpringBoot + Angular в IDEA";

        String actual = Firewall.checkName(s, words);
        String expected = "Вы сделали правильный выбор!";

        then(actual).isEqualTo(expected);
    }

    @Test
    void checkNameFalse() {
        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Криштиану Роналду опубликовал новую фотографию с детьми в instagram";

        String actual = Firewall.checkName(s, words);
        String expected = "Выберите другую статью...";

        then(actual).isEqualTo(expected);
    }
}
