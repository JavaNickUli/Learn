package uli.nick.job4j.praxis.tasks132sethashset;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>0.6. Изограмма
 * <p>Изограмма - это слово, которое не содержит повторяющихся букв, т.е. все буквы в таком слове уникальные.
 * <p>Метод принимает на входе строку, которая является словом, все буквы написаны в нижнем регистре. Входная
 * строка - не фраза, а одно слово, поэтому ее не нужно делить на слова.
 * <p>Метод должен вернуть булево значение - если слово является изограммой - то метод вернет true, иначе - false.
 */

public class Isogram {
    public static boolean checkString(String s) {
        Set<Character> symbols = new HashSet<>();

        for (char symbol : s.toCharArray()) {
            symbols.add(symbol);
        }

        return symbols.size() == s.length();
    }
}

// Каркас 0.6.:
//import java.util.HashSet;
//import java.util.Set;
//
//public class Isogram {
//    public static boolean checkString(String s) {
//        return true;
//    }
//}
//.
