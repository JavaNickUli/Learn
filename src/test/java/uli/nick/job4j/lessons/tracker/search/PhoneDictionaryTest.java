package uli.nick.job4j.lessons.tracker.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.BDDAssertions.then;

class PhoneDictionaryTest {

    @Test
    void addCheck() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));

        ArrayList<Person> actualList = phoneDictionary.persons;
        then(actualList.size() == 1).isTrue();

        Person actual = phoneDictionary.persons.get(0);
        then(actual.getName()).isEqualTo("Petr");
        then(actual.getSurname()).isEqualTo("Arsentev");
        then(actual.getPhone()).isEqualTo("534872");
        then(actual.getAddress()).isEqualTo("Bryansk");
    }

    @Test
    void whenFindByNameThenOneCoincidence() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phoneDictionary.add(new Person("Ivan", "Ivanov", "982237", "Moscow"));
        phoneDictionary.add(new Person("Marina", "Ivanova", "982248", "Moscow"));
        phoneDictionary.add(new Person("Ivan", "Serov", "128462", "Lipetsk"));

        ArrayList<Person> actualList = phoneDictionary.find("Petr");
        then(actualList.size() == 1).isTrue();

        Person actual = actualList.get(0);
        then(actual.getName()).isEqualTo("Petr");
        then(actual.getSurname()).isEqualTo("Arsentev");
        then(actual.getPhone()).isEqualTo("534872");
        then(actual.getAddress()).isEqualTo("Bryansk");
    }

    @Test
    void whenFindByNameThenThreeCoincidence() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phoneDictionary.add(new Person("Ivan", "Ivanov", "982237", "Moscow"));
        phoneDictionary.add(new Person("Marina", "Ivanova", "982248", "Moscow"));
        phoneDictionary.add(new Person("Ivan", "Serov", "128462", "Lipetsk"));

        ArrayList<Person> actualList = phoneDictionary.find("Ivan");
        then(actualList.size() == 3).isTrue();

        Person actual = actualList.get(0);
        then(actual.getName()).isEqualTo("Ivan");
        then(actual.getSurname()).isEqualTo("Ivanov");
        then(actual.getPhone()).isEqualTo("982237");
        then(actual.getAddress()).isEqualTo("Moscow");

        actual = actualList.get(1);
        then(actual.getName()).isEqualTo("Marina");
        then(actual.getSurname()).isEqualTo("Ivanova");
        then(actual.getPhone()).isEqualTo("982248");
        then(actual.getAddress()).isEqualTo("Moscow");

        actual = actualList.get(2);
        then(actual.getName()).isEqualTo("Ivan");
        then(actual.getSurname()).isEqualTo("Serov");
        then(actual.getPhone()).isEqualTo("128462");
        then(actual.getAddress()).isEqualTo("Lipetsk");
    }

    @Test
    void whenFindBySurnameThenTwoCoincidence() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phoneDictionary.add(new Person("Ivan", "Ivanov", "982237", "Moscow"));
        phoneDictionary.add(new Person("Marina", "Ivanova", "982248", "Moscow"));
        phoneDictionary.add(new Person("Ivan", "Serov", "128462", "Lipetsk"));

        ArrayList<Person> actualList = phoneDictionary.find("Ivanov");
        then(actualList.size() == 2).isTrue();

        Person actual = actualList.get(0);
        then(actual.getName()).isEqualTo("Ivan");
        then(actual.getSurname()).isEqualTo("Ivanov");
        then(actual.getPhone()).isEqualTo("982237");
        then(actual.getAddress()).isEqualTo("Moscow");

        actual = actualList.get(1);
        then(actual.getName()).isEqualTo("Marina");
        then(actual.getSurname()).isEqualTo("Ivanova");
        then(actual.getPhone()).isEqualTo("982248");
        then(actual.getAddress()).isEqualTo("Moscow");
    }

    @Test
    void whenFindByOneDigitPhoneThenFourCoincidence() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phoneDictionary.add(new Person("Ivan", "Ivanov", "982237", "Moscow"));
        phoneDictionary.add(new Person("Marina", "Ivanova", "982248", "Moscow"));
        phoneDictionary.add(new Person("Ivan", "Serov", "128462", "Lipetsk"));

        ArrayList<Person> actualList = phoneDictionary.find("8");
        then(actualList.size() == 4).isTrue();

        Person actual = actualList.get(0);
        then(actual.getName()).isEqualTo("Petr");
        then(actual.getSurname()).isEqualTo("Arsentev");
        then(actual.getPhone()).isEqualTo("534872");
        then(actual.getAddress()).isEqualTo("Bryansk");

        actual = actualList.get(1);
        then(actual.getName()).isEqualTo("Ivan");
        then(actual.getSurname()).isEqualTo("Ivanov");
        then(actual.getPhone()).isEqualTo("982237");
        then(actual.getAddress()).isEqualTo("Moscow");

        actual = actualList.get(2);
        then(actual.getName()).isEqualTo("Marina");
        then(actual.getSurname()).isEqualTo("Ivanova");
        then(actual.getPhone()).isEqualTo("982248");
        then(actual.getAddress()).isEqualTo("Moscow");

        actual = actualList.get(3);
        then(actual.getName()).isEqualTo("Ivan");
        then(actual.getSurname()).isEqualTo("Serov");
        then(actual.getPhone()).isEqualTo("128462");
        then(actual.getAddress()).isEqualTo("Lipetsk");
    }

    @Test
    void whenFindByPhoneThenNotCoincidence() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phoneDictionary.add(new Person("Ivan", "Ivanov", "982237", "Moscow"));
        phoneDictionary.add(new Person("Marina", "Ivanova", "982248", "Moscow"));
        phoneDictionary.add(new Person("Ivan", "Serov", "128462", "Lipetsk"));

        ArrayList<Person> actualList = phoneDictionary.find("123456");
        then(actualList.isEmpty()).isTrue();
    }

    @Test
    void whenFindByAddressThenOneCoincidence() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phoneDictionary.add(new Person("Ivan", "Ivanov", "982237", "Moscow"));
        phoneDictionary.add(new Person("Marina", "Ivanova", "982248", "Moscow"));
        phoneDictionary.add(new Person("Ivan", "Serov", "128462", "Lipetsk"));

        ArrayList<Person> actualList = phoneDictionary.find("Lipetsk");
        then(actualList.size() == 1).isTrue();

        Person actual = actualList.get(0);
        then(actual.getName()).isEqualTo("Ivan");
        then(actual.getSurname()).isEqualTo("Serov");
        then(actual.getPhone()).isEqualTo("128462");
        then(actual.getAddress()).isEqualTo("Lipetsk");
    }
}
