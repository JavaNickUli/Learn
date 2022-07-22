package uli.nick.job4j.praxis.tasks132sethashset;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>0.5. Джекпот в казино
 * <p>Выигрышной комбинацией для джекпота в казино считается такая, в которой все элементы одинаковые.
 * <p>Метод принимает массив строк, который содержит последовательность элементов игровой комбинации. Метод
 * должен вернуть true - если комбинация является выигрышной.
 * <p>Напомню, что коллекция Set не допускает наличие дубликатов. Поэтому если все элементы массива добавить в
 * коллекцию типа Set, то размер коллекции будет равен 1 при условии, что комбинация выигрышная.
 */

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> setJackpot = new HashSet<>();
        for (String string : combination) {
            setJackpot.add(string);
        }
        return setJackpot.size() == 1;
    }
}

// Каркас 0.5.:
//import java.util.HashSet;
//import java.util.Set;
//
//public class Jackpot {
//    public static boolean checkYourWin(String[] combination) {
//        return true;
//    }
//}
//.
