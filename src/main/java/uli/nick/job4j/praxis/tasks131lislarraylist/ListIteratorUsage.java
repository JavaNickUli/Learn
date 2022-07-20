package uli.nick.job4j.praxis.tasks131lislarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * <p>1.3. ListIterator для списка.
 * <p>В интерфейсе List<E> определен особый метод listIterator(), который возвращает объект ListIterator<E>  и позволяет
 * обойти все элементы коллекции:
 * <p>ListIterator < E >  listIterator() - возвращает итератор списка для элементов в этом списке.
 * <p>ListIterator < E >  listIterator (int index) - возвращает итератор списка для элементов в этом списке, начиная с
 * элемента индекс которого равен index.
 * <p>Вы скажете - у нас уже есть Iterator<E>, для чего нам нужен еще один? Ответ прост - названия у них похожи, но
 * работают они по-разному, поэтому укажем важные различия и каким пользоваться - выбор за Вами.
 * <p>1. ListIterator может использоваться только со списками, т.е. реализациями интерфейса List<E>, тогда как
 * Iterator<E>  применим к любым наследникам и реализациям интерфейса Collection<E>
 * <p>2. ListIterator позволяет перебирать список в обоих направлениях, Iterator<E> только в прямом порядке.
 * <p>3. ListIterator допускает модификацию списка, за счет его дополнительных методов add и remove. Iterator<E> такой
 * возможности не имеет.
 * <p>В дополнение к методам, которые были определены в Iterator<E>, в ListIterator добавлены еще несколько:
 * <p>boolean hasPrevious() - если предыдущий элемент существует, метод возвращает true.
 * <p>E previous() - метод перемещает курсор на предыдущий элемент, и при этом возвращает его значение.
 * <p>Задание: необходимо раскомментировать, заполнить пропуски (обозначены ...) так, чтобы мы сначала прошлись по
 * списку в прямом порядке, а потом в обратном.
 */

public class ListIteratorUsage {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("one", "two", "three"));
        ListIterator<String> iterator = list.listIterator();
        System.out.println("Start iterate...");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Change direction iterate...");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println("Finish iterate...");
    }
}

// Каркас 1.3.:
//import java.util.ArrayList;
//import java.util.List;
//import java.util.ListIterator;
//
//public class ListIteratorUsage {
//    public static void main(String[] args) {
////        List<String> list = new ArrayList<>(List.of("one", "two", "three"));
////        ListIterator<String> iterator = ...;
////        System.out.println("Start iterate...");
////        while (...) {
////            System.out.println(...);
////        }
////        System.out.println("Change direction iterate...");
////        while (...) {
////            System.out.println(...);
////        }
////        System.out.println("Finish iterate...");
//    }
//}
//.
