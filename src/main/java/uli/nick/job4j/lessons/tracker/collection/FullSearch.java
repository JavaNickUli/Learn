package uli.nick.job4j.lessons.tracker.collection;

import java.util.HashSet;
import java.util.List;

/**
 * <p>1. Уникальные задачи. [#212653 #312240]
 * <p>В этом задании вам нужно оставить уникальные номера задач.
 * <p>Представьте, что у нас есть система поиска задач по тексту. Система возвращает нам список задач. Некоторые задачи могут повторяться несколько раз.
 * <p>Система не проверяет, что такая задача уже есть в выборке.
 * <p>Вам нужно убрать дубликаты из списка.
 * <p>Задание.
 * <p>1. Реализуйте метод ru.job4j.collection.FullSearch.extractNumber.
 */

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}

// Каркас 1.:
//import java.util.HashSet;
//import java.util.List;
//
//public class FullSearch {
//    public static HashSet<String> extractNumber(List<Task> list) {
//        HashSet<String> numbers = new HashSet<>();
//        // for-each
//        return numbers;
//    }
//}
//.
