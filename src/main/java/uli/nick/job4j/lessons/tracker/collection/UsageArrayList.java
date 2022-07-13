package uli.nick.job4j.lessons.tracker.collection;

import java.util.ArrayList;

/**
 * <p>0. Коллекции, ArrayList, List, Обобщения [#10094 #311376]
 * <p>Задание
 * <p>1. Создайте класс ru.job4j.collection.UsageArrayList.
 * <p>2. В нем создайте метод main.
 * <p>3. В методе main создайте объект ArrayList с типом String. Добавьте в него 3 имени: Petr, Ivan, Stepan. Далее
 * через цикл for-each выведите все элементы на консоль.
 */

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

// Каркас 0.:
//public class UsageArrayList {
//}
//.
