package uli.nick.job4j.lessons.tracker.collection;

import java.util.HashSet;

/**
 * <p>0. Set, HashSet, Iterator. [#10095 #312235]
 * <p>Задание.
 * <p>1. Создайте класс ru.job4j.collection.UsageHashSet. В методе main допишите код.
 * <p>2. Добавьте в коллекцию autos марки машин: Lada, BMW, Volvo, Toyota.
 * <p>3. Добавьте цикл for-each и выведите элементы коллекции HashSet на консоль.
 */

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");

        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}

// Каркас 0.:
//import java.util.HashSet;
//
//public class UsageHashSet {
//    public static void main(String[] args) {
//        HashSet<String> autos = new HashSet<>();
//
//    }
//}
//.
