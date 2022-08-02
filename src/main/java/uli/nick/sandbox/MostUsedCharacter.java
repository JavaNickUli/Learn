package uli.nick.sandbox;

import java.util.Map;
import java.util.TreeMap;

public class MostUsedCharacter {
    public static char getMaxCount(String string) {
        char spaceSymbol = ' ';
        Map<Character, Integer> symbolsByFrequency = new TreeMap<>();

        for (char symbol : string.toLowerCase().toCharArray()) {
            if (symbol != spaceSymbol) {
                symbolsByFrequency.computeIfPresent(symbol, (key, frequency) -> ++frequency);
                symbolsByFrequency.putIfAbsent(symbol, 1);
            }
        }

        int maxFrequency = 0;
        char resultSymbol = ' ';

        for (Map.Entry<Character, Integer> entry : symbolsByFrequency.entrySet()) {
            int frequency = entry.getValue();

            if (maxFrequency < frequency) {
                resultSymbol = entry.getKey();
                maxFrequency = frequency;
            }
        }

        return resultSymbol;
    }
}
