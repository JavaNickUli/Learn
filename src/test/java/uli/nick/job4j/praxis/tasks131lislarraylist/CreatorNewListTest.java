package uli.nick.job4j.praxis.tasks131lislarraylist;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.BDDAssertions.then;

class CreatorNewListTest {

    @Test
    void mainCheckingConsoleOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        CreatorNewList.main(null);

        String actual = output.toString();
        String ln = System.lineSeparator();
        String expected = "Создаем список с пустым конструктором." + ln
                + "Добавляем 3 элемента в список." + ln
                + "Создаем список - в конструктор передаем коллекцию." + ln
                + "Выводим все элементы в списке." + ln
                + "one" + ln + "two" + ln + "three" + ln;

        then(actual).isEqualTo(expected);
    }
}
