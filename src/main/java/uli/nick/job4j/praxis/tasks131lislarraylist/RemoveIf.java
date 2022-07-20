package uli.nick.job4j.praxis.tasks131lislarraylist;

import java.util.List;

/**
 * <p>1.1. Удаление элементов по условию
 * <p>Может возникнуть ситуация, когда нам надо удалить элементы, которые удовлетворяют какому-то условию.
 * Чтобы не писать цикл, в котором будет проверяться условие, в интерфейсе Collection(наследником которого
 * является интерфейс List) определен метод removeIf():
 * <p>default boolean removeIf(Predicate<? super E> filter) - метод удаляет все элементы из коллекции, которые
 * удовлетворяют условию определенному в предикате filter(передается в виде лямбда выражения). Если в
 * результате работы метода список изменился - метод возвращает true.
 * <p>Задание: необходимо реализовать метод, который вернет список строк, которые состоят из 5 и более символов.
 */

public class RemoveIf {
    public static List<String> sortList(List<String> list) {
        list.removeIf(e -> e.length() < 5);
        return list;
    }
}

// Каркас 1.1.:
//import java.util.List;
//
//public class RemoveIf {
//    public static List<String> sortList(List<String> list) {
//        return list;
//    }
//}
//.
