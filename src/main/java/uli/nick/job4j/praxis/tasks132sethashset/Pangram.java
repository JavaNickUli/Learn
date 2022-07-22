package uli.nick.job4j.praxis.tasks132sethashset;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>0.3. Панграмма
 * <p>Панграмма - короткий текст, который использует все буквы алфавита, по возможности не повторяя их.
 * <p>Метод принимает строку(на английском языке). Необходимо реализовать его так, чтобы метод определил
 * является ли входящая строка панграммой. Строчные и прописные буквы являются одинаковыми символами,
 * пробелы необходимо игнорировать.
 * <p>Напомню, что в английском алфавите 26 букв.
 */

public class Pangram {
    public static boolean checkString(String s) {
        Set<Character> symbols = new HashSet<>();

        for (char el : s.toLowerCase().toCharArray()) {
            if (el != ' ') {
                symbols.add(el);
            }
        }

        return symbols.size() == 26;
    }
}

// Каркас 0.3.:
//import java.util.HashSet;
//import java.util.Set;
//
//public class Pangram {
//    public static boolean checkString(String s) {
//        Set<Character> strings = new HashSet<>();
//        for (char el : s.toLowerCase().toCharArray()) {
//            if (el != ' ') {
//                strings.add(el);
//            }
//        }
//        return strings.size() == 26;
//    }
//}
//.
