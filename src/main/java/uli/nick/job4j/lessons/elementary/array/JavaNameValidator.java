package uli.nick.job4j.lessons.elementary.array;

/**
 * <p>6.9. String - это массив [#504884]
 * <p>Задание.
 * <p>1. Необходимо разработать метод для проверки валидности имен в языке Java.
 * <p>Напомню, что переменные может содержать символы латинского алфавита и числа, символ подчеркивания и символ доллара.
 * <p>Переменная должна начинаться на строчную латинскую букву.
 */

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        return name.matches("^[a-z][a-zA-Z\\d_$]*");
    }
}

// Каркас 6.9.:
//public class JavaNameValidator {
//    public static boolean isNameValid(String name) {
//        return false;
//    }
//}
//.
