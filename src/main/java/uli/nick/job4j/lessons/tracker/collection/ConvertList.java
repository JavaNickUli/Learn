package uli.nick.job4j.lessons.tracker.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>5. Конвертация листа массивов в один лист Integer [#10037 #311645]
 * <p>В этом задании Вам нужно будет преобразовать список с массивом чисел в список чисел.
 * <p>Метод convert должен пройтись по всем элементам всех массивов в списке list и добавить их в список rsl.
 * <p>Массивы в списке list могут быть разного размера.
 * <p>Задание
 * <p>1. Реализуйте класс ConvertList.
 */

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();

        for (int[] array : list) {
            for (int element : array) {
                result.add(element);
            }
        }

        return result;
    }
}

// Каркас 5.:
//import java.util.ArrayList;
//        import java.util.List;
//
//public class ConvertList {
//    public static List<Integer> convert(List<int[]> list) {
//        List<Integer> rsl = new ArrayList<>();
//        /// for-each
//        return rsl;
//    }
//}
//.
