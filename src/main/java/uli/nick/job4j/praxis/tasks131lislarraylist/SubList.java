package uli.nick.job4j.praxis.tasks131lislarraylist;

import java.util.List;

/**
 * <p>0.9. Получить часть списка с определенными индексами
 * <p>Может возникнуть ситуация, когда у нас есть список и нам нужно получить его часть, которая находится между
 * двумя интересующими нас индексами. Что же делать в данной ситуации? Не отчаиваться, не усложнять, а
 * просто применить метод subList():
 * <p>List<E> subList(int fromIndex, int toIndex) - метод возвращает список, который содержит все элементы исходного
 * списка начиная с индекса fromIndex(включительно) и до toIndex(значение исключается). При этом, если
 * выполняется условие fromIndex == toIndex,- метод вернет пустой список.
 * <p>Задание: метод принимает два параметра - список и элемент, который предполагается, что содержится в этом
 * списке. Необходимо реализовать метод, чтобы он возвращал результаты следующим образом:
 * <p>1. Элемента нет в списке - возвращает пустой список.
 * <p>2. Элемент в списке встречается 1 раз - возвращает пустой список.
 * <p>3. Элемент встречается более одного - возвращается список, начиная с первого вхождения элемента и
 * заканчивая предшествующим последнему вхождению элемента в исходной коллекции.
 */

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int lastIndexOf = list.lastIndexOf(el);
        return lastIndexOf < 0 ? List.of() : list.subList(list.indexOf(el), lastIndexOf);
    }
}

// Каркас 0.9.:
//import java.util.List;
//
//public class SubList {
//    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
//        return list;
//    }
//}
//.
