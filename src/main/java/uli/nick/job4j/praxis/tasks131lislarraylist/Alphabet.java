package uli.nick.job4j.praxis.tasks131lislarraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * <p>1.7. Буквы в алфавитном порядке.
 * <p>Вам необходимо реализовать метод, который принимает строку, которое является одним словом, без знаков
 * препинания цифр и пробелов. Метод должен вернуть новую строку, в которой все символы исходной строки
 * будут расставлены в алфавитном порядке.
 * <p>Для разделения строки на подстроки используйте метод split(), добавьте все элементы в коллекцию List<String>,
 * отсортируйте в порядке возрастания - используйте метод sort, в который передадите компаратор. Новую
 * строку сформируйте с помощью StringBuilder.
 */

public class Alphabet {
    public static String reformat(String s) {
        List<String> list = new ArrayList<>(List.of(s.split("")));
        list.sort(Comparator.naturalOrder());
        StringBuilder stringBuilder = new StringBuilder();
        for (String symbol : list) {
            stringBuilder.append(symbol);
        }
        return stringBuilder.toString();
    }
}

// Каркас 1.7.:
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//
//public class Alphabet {
//    public static String reformat(String s) {
//        return s;
//    }
//}
//.
