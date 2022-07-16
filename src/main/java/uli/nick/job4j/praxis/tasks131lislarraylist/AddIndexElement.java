package uli.nick.job4j.praxis.tasks131lislarraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>0.3. Добавление элемента в список по индексу
 * <p>А что если мы хотим добавить элемент не в конец списка, а в какое то конкретное место в списке. Не проблема,
 * в интерфейсе List<E> определен метод, который позволяет добавить элемент по индексу:
 * <p>void add(int index, E e) - где index - место куда мы добавляем элемент E. Метод ничего не возвращает, однако
 * может генерировать исключение IndexOutOfBoundsException, при условии что index < 0 или превышает размер
 * списка. Поэтому использовать его нужно с осторожностью.
 * <p>Также рассмотрим метод contains(E e), который определен в интерфейсе Collection<E>:
 * <p>boolean contains(E e) - метод проверяет содержит ли список элемент E, возвращает true если содержит, иначе -
 * false.
 * <p>Задание: необходимо реализовать метод, который добавляет элемент в список по индексу, при этом он должен
 * добавлять элемент только в том случае, если этого элемента еще нет в коллекции. При этом метод должен
 * вернуть булево значение. Для этого необходимо сравнить размер дубликата списка и списка в который мы
 * добавляем элемент. Используйте методы contains(E e), add(int index, E e), size().
 */

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String string) {
        List<String> check = new ArrayList<>(list);
        if (!list.contains(string)) {
            list.add(index, string);
        }
        return check.size() != list.size();
    }
}

// Каркас 0.3.:
//import java.util.ArrayList;
//import java.util.List;
//
//public class AddIndexElement {
//    public static boolean addNewElement(List<String> list, int index, String str) {
//        List<String> check = new ArrayList<>(list);
//        return false;
//    }
//}
//.
