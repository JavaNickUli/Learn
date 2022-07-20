package uli.nick.job4j.praxis.tasks131lislarraylist;

import java.util.Iterator;
import java.util.List;

/**
 * <p>1.2. Итератор для списка
 * <p>Чтобы обходить список и получать его элементы до этого мы использовали цикл for() в котором проходились
 * по индексам списка и метод get() который получал элемент на каждой итерации. Можно ли еще как-то
 * получить элементы? Да, можно. Для этого в интерфейсе Collection определен метод iterator():
 * <p>Iterator<E> iterator() - метод возвращает объект Iterator, который содержит в себе все элементы исходной коллекции.
 * <p>Что это за Iterator такой спросите Вы? Это объект который с помощью своих методов позволяет
 * последовательно обойти все элементы, которые он в себе содержит:
 * <p>E next() - метод переводит курсор на следующий элемент в списке, при этом возвращает этот элемент. Всегда
 * перед вызовом этого метода надо использовать метод hasNext(), иначе будет сгенерировано исключение
 * NoSuchElementException.
 * <p>boolean hasNext() - метод проверяет содержит ли итератор следующий элемент, возвращает false, если курсор
 * станет равным размеру списка, т.е. следующего элемента не существует.
 * <p>ВАЖНО! После того, как был получен объект Iterator<E>, нельзя производит никаких модификаций с исходным
 * списком, поскольку при последующем вызове метода next() будет сгенерировано исключение
 * ConcurrentModificationException, которое говорит о том, что в процессе обхода коллекции была произведена ее
 * модификация, а это недопустимо.
 * <p>Задание: необходимо расскомментировать код, заполнить места пропуска (обозначены ...). Метод должен
 * пройти по всему списку, вывести информацию что следующий элемент есть(в виде значения true), а также
 * значение этого элемента. Также после обхода списка необходимо вывести информацию, что больше элементов
 * нет. Используйте методы, которые были описаны выше.
 */

public class IteratorForList {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three", "four", "five");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Next element has - " + iterator.hasNext() + ", this element is " + iterator.next());
        }
        System.out.println("Next element has - " + iterator.hasNext());
    }
}

// Каркас 1.2.:
//import java.util.Iterator;
//import java.util.List;
//
//public class IteratorForList {
//    public static void main(String[] args) {
////        List<String> list = List.of("one", "two", "three", "four", "five");
////        Iterator<String> iterator = ...;
////        while(...) {
////            System.out.println("Next element has - " + ... + ", this element is " + ...);
////        }
////        System.out.println("Next element has - " + ...);
//    }
//}
//.
