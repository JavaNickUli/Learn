package uli.nick.job4j.praxis.tasks133maphashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>1.3. Получить значения отображения по ключу.
 * <p>Рассмотрим 2 очень простых, но очень важных метода, которые будут использоваться в Вашей практике очень часто:
 * <p>V get(K key) - метод возвращает значение объекта, которому соответствует ключ key. Если вдруг окажется, что
 * такого элемента нет - то метод вернет null.
 * <p>Set<K> keySet() - возвращает набор всех ключей отображения.
 * <p>Важно упомянуть, что отображение не позволяет хранить 2 значения по одинаковому ключу, т.е. ключ для
 * отображения - уникальный идентификатор. При этом в качестве ключа допускается использовать null
 * (допускается не означает, что это хорошая идея). При этом ключ со значением null может быть только один.
 * <p>Задание: Вам необходимо раскомментировать код, заполнить пропуски (обозначены ...) так, чтобы в консоль
 * были выведены все значения отображения. При этом необходимо использовать метод keySet() и get().
 */

public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(
                        1, "root@root",
                        2, "local@local",
                        3, "host@host"
                )
        );
        for (int key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}

// Каркас 1.3:
//import java.util.HashMap;
//import java.util.Map;
//
//public class KeySet {
//    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>(
//                Map.of(
//                        1, "root@root",
//                        2, "local@local",
//                        3, "host@host"
//                )
//        );
////        for (...) {
////            System.out.println(... + " - " + ...);
////        }
//    }
//}
//.
