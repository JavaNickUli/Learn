package uli.nick.job4j.praxis.tasks132sethashset;

import java.util.Set;

/**
 * <p>0.4. Собственный файерволл
 * <p>Настало время сдавать очередной экзамен. Дело ответственное, хочется успеха с первого раза. Для подготовки
 * нам надо отобрать около 10 статей. Но в наш век интернет-маркетинга это не так просто: кругом баннеры,
 * контекстная реклама и прочие способы нас отвлечь. Поэтому мы решили реализовать метод который будет
 * фильтровать названия статей.
 * <p>Метод принимает строку, которая является названием статьи, а также коллекцию Set в которой содержатся
 * слова, которые не должны содержаться в названиях статей, чтобы мы могли сконцентрироваться на материале
 * изучения. Метод должен вернуть:
 * <p>1. Если в строке нет ни одного слова из коллекции Set, то метод должен вернуть строку: Вы сделали правильный выбор!
 * <p>2. Если в строке имеется хоть одно из слов из коллекции Set, метод должен вернуть строку: Выберите другую статью...
 */

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        for (String string : s.toLowerCase().split(" ")) {
            if (words.contains(string)) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }
}

// Каркас 0.4.:
//import java.util.Set;
//
//public class Firewall {
//    public static String checkName(String s, Set<String> words) {
//        return "";
//    }
//}
//.