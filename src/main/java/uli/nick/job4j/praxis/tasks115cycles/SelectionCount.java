package uli.nick.job4j.praxis.tasks115cycles;

/**
 * <p>1.2. Найти количество отрезков, используя цикл
 * <p>Даны два целых положительных числа length, section. length это расстояние. Вам нужно не используя операцию
 * деления найти сколько раз отрезок длиной section помещает в length. Нужно использовать цикл while
 * <p>Например,
 * <p>Для length = 2, section = 1 => 2
 * <p>Для length = 3, section = 2 => 1
 */

public class SelectionCount {
    public static int count(int length, int section) {
        int result = 0;
        while (length >= section) {
            length -= section;
            result++;
        }
        return result;
    }
}

// Каркас 1.2.:
//public class SectionCount {
//    public static int count(int length, int section) {
//
//    }
//}
//.
