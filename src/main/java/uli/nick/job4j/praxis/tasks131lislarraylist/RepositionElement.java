package uli.nick.job4j.praxis.tasks131lislarraylist;

import java.util.List;

/**
 * <p>0.6. Удаление и замена элементов в списке
 * <p>Продолжим модифицировать список, познакомимся с методами для удаления элементов в списке и замены
 * элемента по индексу. Для этого предназначены методы set() и remove():
 * <p>E remove(int index) - удаляет элемент из списка по индексу index, при этом метод возвращает удаленный элемент.
 * <p>E set(int index, E e) - заменяет значение элемента, который имеет индекс index, значением e. При этом метод
 * возвращает старое значение элемента с индексом index.
 * <p>Задание:  метод принимает в качестве параметров список и индекс элемента который необходимо заменить.
 * необходимо дописать метод так, чтобы сначала удалялся последний элемент в списке, а потом этим элементом
 * заменить элемент по индексу, который пришел в параметрах метода. Необходимо учесть, что извне могут
 * передать индекс, который превышает значение размера списка. Чтобы этого избежать - необходимо добавить
 * проверку валидности входных параметров.
 */

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String element = list.remove(list.size() - 1);
        if (index < list.size()) {
            list.set(index, element);
        }

        return list;
    }
}

// Каркас 0.6.:
//import java.util.List;
//
//public class RepositionElement {
//    public static List<String> changePosition(List<String> list, int index) {
//        return list;
//    }
//}
//.
