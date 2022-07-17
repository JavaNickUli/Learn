package uli.nick.job4j.praxis.tasks131lislarraylist;

import java.util.List;

/**
 * <p>0.5. Заполнение списка фабричным методом
 * <p>До этого мы заполняли список, используя метод add(E e). Каким образом можно еще заполнить список
 * значениями? Для этого определен метод фабричный метод of().
 * <p>List<E> of(E ... elements) - метод возвращает список, в которые помещены список элементов elements типа E. Как мы
 * видим метод принимает переменное количество аргументов (обозначается ...). Т.е. мы можем перечислять
 * большое количество аргументов через запятую.
 * <p>Стоит упомянуть, что метод возвращает неизменяемый список, т.е. вызвать метод add(), remove() и т.п. на такой
 * коллекции не получится, будет сгенерировано исключение UnsupportedOperationException.
 * <p>Задание: в методе вам нужно заполнить коллекцию значениями от first до fifth с помощь фабричного метода
 * of(). После этого с помощью цикла for() с индексами и метода get() вывести все элементы.
 */

public class Factory {
    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third", "fourth", "fifth");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

// Каркас 0.5.:
//import java.util.List;
//
//public class Factory {
//    public static void main(String[] args) {
////        List<String> list =
////        for (int i = 0; i < ; i++) {
////            System.out.println();
////        }
//    }
//}
//.
