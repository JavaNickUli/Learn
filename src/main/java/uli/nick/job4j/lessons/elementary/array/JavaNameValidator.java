package uli.nick.job4j.lessons.elementary.array;

/**
 * <p>6.9. String - это массив [#504884]
 * <p>Задание.
 * <p>1. Необходимо разработать метод для проверки валидности имен в языке Java.
 * <p>Напомню, что переменные может содержать символы латинского алфавита и числа, символ подчеркивания и символ доллара.
 * <p>Переменная должна начинаться на строчную латинскую букву.
 * <p>Прежде чем разрабатывать каркас немного обсудим что нам понадобится для решения задачи. Посмотрим на
 * таблицу символов юникода:
 * <p>Таблица ЮНИКОДА
 * <p>на схеме отметим интересующие нас символы:
 * <p>Как мы видим, символы разделены на несколько отдельных групп. Поэтому проверить их одним большим
 * числовым диапазоном у нас не получится. Но давайте попробуем выделить несколько отдельных групп:
 * <p>- специальные символы (символ доллара (36) и нижнее подчеркивание (95));
 * <p>- прописные латинские символы (от 65 до 90 включая обе границы);
 * <p>- строчные латинские символы (от 97 до 122 включая обе границы).
 * <p>В скобках указаны коды символов согласно таблице юникода. Все это Вы можете проверить с помощью метода codePointAt():
 * <p><a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#codePointAt(int)">...</a>
 * <p>Мы намерено не приводим тут коды для чисел, поскольку это мы будем проверять иным образом.
 * <p>Таким образом, помимо целевого метода мы добавим методы для проверки принадлежности символа к той
 * или иной группе символов:
 * <p>- метод isSpecialSymbol(int code) - метод должен вернуть true, если символ является символом доллара и
 * нижнее подчеркивание;
 * <p>- метод isUpperLatinLetter(int code) - метод должен вернуть true, если символ является прописным латинским символом;
 * <p>- метод isLowerLatinLetter(int code) - метод должен вернуть true, если символ является строчным латинским символом.
 * <p>Для того, чтобы проверить является ли символ числом, мы будем использовать метод isDigit() класса Character:
 * <p><a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html#isDigit(int)">...</a>
 * <p>Данный метод возвращает true в том случае, если код символа является цифрой.
 * <p>К тому же нам необходимо проверить что первый символ в строке - строчный символ. Можно проверить что первый
 * символ прописной следующим методом:
 * <p><a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html#isUpperCase(int)">...</a>
 * <p>если метод вернет true - то наша строка невалидна и наш разработанный метод должен вернуть false.
 * <p>Предусмотрите в методе проверку, что исходная строка может быть пустой - в этом случае метод также
 * должен вернуть false. Для этого очень хорошо подойдет метод isEmpty() класса String:
 * <p><a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#isEmpty()">...</a>
 * <p>Метод вернет true в том случае, если длина строки равна 0. С учетом всех приведенных рекомендаций приведем ниже каркас.
 */

public class JavaNameValidator {

    public static boolean isNameValid(String name) {

        int i = 0;
        if (name.isEmpty() || !isLowerLatinLetter(name.codePointAt(i++))) {
            return false;
        }

        while (i < name.length()) {
             int s = name.codePointAt(i++);
             if (!(isSpecialSymbol(s) || isLowerLatinLetter(s)
                     || isUpperLatinLetter(s) || Character.isDigit(s))) {
                 return false;
             }
        }

        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 64 && code < 91;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 96 && code < 123;
    }

    public static boolean isNameValidRadix(String name) {
        return name.matches("^[a-z][a-zA-Z\\d_$]*");
    }
}

// Каркас 6.9.:
//public class JavaNameValidator {
//public static boolean isNameValid(String name) {
//    return false;
//}
//
//    public static boolean isSpecialSymbol(int code) {
//        return false;
//    }
//
//    public static boolean isUpperLatinLetter(int code) {
//        return false;
//    }
//
//    public static boolean isLowerLatinLetter(int code) {
//        return false;
//    }
//}
//.
