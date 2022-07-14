package uli.nick.job4j.lessons.tracker.search;

import java.util.ArrayList;

/**
 * <p>1. Телефонный справочник на базе ArrayList [#41598 #311456]
 * <p>Задание.
 * <p>1. Доработайте требуемый функционал.
 * <p>2. Добавьте тест, когда по заданному критерию ничего найдено не будет, и в качестве результата будет
 * возвращён пустой список.
 */

public class PhoneDictionary {
    ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(key) || person.getSurname().contains(key)
                    || person.getPhone().contains(key) || person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}

// Каркас 1.:
//import java.util.ArrayList;
//
//public class PhoneDictionary {
//    private ArrayList<Person> persons = new ArrayList<>();
//
//    public void add(Person person) {
//        this.persons.add(person);
//    }
//
//    /**
//     * Вернуть список всех пользователей, который содержат key в любых полях.
//     * @param key Ключ поиска.
//     * @return Список подощедщих пользователей.
//     */
//    public ArrayList<Person> find(String key) {
//        ArrayList<Person> result = new ArrayList<>();
//        return result;
//    }
//}
//.
