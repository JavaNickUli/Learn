package uli.nick.job4j.lessons.tracker.collection;

import java.util.HashSet;

/**
 * <p>2. Идентичные тексты [#212655 #312250]
 * <p>Нам нужно написать метод, который будет сравнивать два текста.
 * <p>Если они состоят из один и тех же слов, то мы считаем, что текст не уникальный.
 * <p>Алгоритм решения задания.
 * <p>1. Преобразовать строку в массив слов. Для этого используется метод String.split(" ").
 * <p>2. Массив строк вставить через цикл for-each в коллекцию HashSet.
 * <p>3. Преобразовать проверяемый текст в массив слов по аналогии с пунктом 1.
 * <p>4. Проверить массив строк через цикл for-each в коллекции HashSet используя метод contains.
 * <p>Задание.
 * <p>1. Реализуйте метод ru.job4j.collection.UniqueText.isEquals.
 */

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String element : origin) {
            check.add(element);
        }
        for (String element : text) {
            if (!check.contains(element)) {
                result = false;
                break;
            }
        }
        return result;
    }
}

// Каркас 2.:
//import java.util.HashSet;
//
//public class UniqueText {
//    public static boolean isEquals(String originText, String duplicateText) {
//        boolean rsl = true;
//        String[] origin = originText.split(" ");
//        String[] text = duplicateText.split(" ");
//        HashSet<String> check = new HashSet<>();
//        /* for-each origin -> new HashSet. */
//        /* for-each text -> hashSet.contains */
//        return rsl;
//    }
//}
//.
