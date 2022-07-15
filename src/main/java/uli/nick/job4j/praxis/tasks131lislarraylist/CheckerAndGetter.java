package uli.nick.job4j.praxis.tasks131lislarraylist;

import java.util.List;

/**
 * <p>0.1. Проверить список и получить первый элемент.
 * <p>Начнем знакомиться с методами, которые определены в интерфейсе List, как они работают и для чего
 * предназначены. Рассмотрим такие методы:
 * <p>boolean isEmpty() - метод позволяет проверить содержатся ли элементы в коллекции. true - коллекция пуста,
 * false - коллекция содержит элементы.
 * <p>E get(int index) - возвращает объект типа E из списка по индексу index. Если элементов нет - генерируется
 * исключение IndexOutOfBoundsException - значит нужно быть аккуратным при использовании этого метода.
 * <p>Также стоит упомянуть, что нумерация индексов в коллекции, как и в массивах, начинается с 0, поэтому первый
 * элемент в списке имеет индекс 0, а не 1.
 * <p>Задание: вам необходимо реализовать метод, который будет возвращать первую строку из коллекции строк, но
 * прежде чем получить результат - необходимо проверить содержатся ли элементы в списке. Если их нет
 * - возвращаем пустую строку, иначе - первый элемент в коллекции.
 */

public class CheckerAndGetter {
    public static String getElement(List<String> list) {
        return list.isEmpty() ? "" : list.get(0);
    }
}

// Каркас 0.1.:
//import java.util.List;
//
//public class CheckerAhdGetter {
//    public static String getElement(List<String> list) {
//        return null;
//    }
//}
//.
