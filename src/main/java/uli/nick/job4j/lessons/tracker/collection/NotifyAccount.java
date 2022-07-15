package uli.nick.job4j.lessons.tracker.collection;

import java.util.HashSet;
import java.util.List;

/**
 * <p>3. Модели данных и HashSet. [#218530 #312297]
 * <p>Уникальность элементов в HashSet проверяется через методы equals и hashCode. Если мы хотим хранить в
 * <p>HashSet пользовательские темы данных нам нужно обеспечить эти модели методами equals и hashCode.
 * <p>Давайте создадим модель данных - клиент банка. ru.job4j.collection.Account.
 * <p>В этой модели будут поля: серия и номер паспорта, ФИО, номер счета.
 * <p>Обратите внимание, что для вычисления equals и hashCode тут используется только одно поле - это серия и
 * номер паспорта. Этого поля достаточно, чтобы проверить, что клиент банка уникален.
 * <p>Решение этой задачи сводится к преобразованию List в Set. HashSet устранит дубликаты клиентов банка
 * самостоятельно.
 * <p>Задание.
 * <p>1. Реализуйте метод ru.job4j.collection.NotifyAccount.sent.
 * <p>2. Допишите тесты, которые проверяют удаление дубликатов.
 */

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> result = new HashSet<>();
        for (Account account : accounts) {
            result.add(account);
        }
        return result;
    }
}

// Каркас 3.:
//import java.util.HashSet;
//import java.util.List;
//
//public class NotifyAccount {
//    public static HashSet<Account> sent(List<Account> accounts) {
//        HashSet<Account> rsl = new HashSet<>();
//        /* for-each accounts to HashSet; */
//        return rsl;
//    }
//}
//.
