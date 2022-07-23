package uli.nick.job4j.praxis.tasks133maphashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * <p>1.1. Вставка новых элементов.
 * <p>Начнем знакомиться с методами, которые определены в интерфейсе Map<K, V>, который представляет собой
 * отображение, в котором каждому значению K (ключ) соответствует значение V(value). Map используется очень
 * часто, поэтому тему нужно освоить очень хорошо.
 * <p>Начнем с методов, которые позволяют добавить новый элемент в коллекцию, а также проверить существует ли
 * уже такой ключ в Map:
 * <p>V put(K key, V value) - помещает в коллекцию новый объект с ключом key и значением value. Если в коллекции
 * уже есть объект с подобным ключом, то он перезаписывается. Если ключа еще не было в коллекции, то метод
 * возвращает null, иначе - предыдущее значение которое соответствовало ключу key.
 * <p>boolean containsKey(K key) - возвращает true, если Map уже содержит ключ key.
 * <p>При этом, сравнение производится с помощью equals() и hashcode(), поэтому если Вы используете свои
 * реализации моделей данных - эти методы будет необходимо переопределить.
 * <p>Задание: в классе определенно 2 метода, оба принимают список пользователей.
 * <p>1. Выполняет вставку значений в отображение без проверки содержится ли такой ключ уже в отображении.
 * <p>2. Выполняет вставку значений в отображение с проверкой содержится ли такой ключ уже в отображении.
 * <p>Необходимо перебрать весь список и добавить пользователей в отображение, при этом в качестве ключа
 * использовать id пользователя, значения - объект типа User. В задании необходимо использовать методы,
 * описанные в выше.
 */

public class PutContainsKey {
    public static Map<Integer, User> addNewElementWithoutCheck(List<User> list) {
        Map<Integer, User> result = new HashMap<>();
        for (User user : list) {
            result.put(user.id, user);
        }
        return result;
    }

    public static Map<Integer, User> addNewElementWithCheck(List<User> list) {
        Map<Integer, User> result = new HashMap<>();
        for (User user : list) {
            if (!result.containsKey(user.id)) {
                result.put(user.id, user);
            }
        }
        return result;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return id == user.id && name.equals(user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}

// Каркас 1.1.:
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Objects;
//
//public class PutContainsKey {
//
//    public static Map<Integer, User> addNewElementWithoutCheck(List<User> list) {
//        Map<Integer, User> rsl = new HashMap<>();
//        return rsl;
//    }
//
//    public static Map<Integer, User> addNewElementWithCheck(List<User> list) {
//        Map<Integer, User> rsl = new HashMap<>();
//        return rsl;
//    }
//
//    public static class User {
//        private int id;
//        private String name;
//
//        public User(int id, String name) {
//            this.id = id;
//            this.name = name;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            User user = (User) o;
//            return id == user.id;
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(id);
//        }
//    }
//}
//.
