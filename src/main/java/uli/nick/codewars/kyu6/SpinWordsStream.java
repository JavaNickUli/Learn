package uli.nick.codewars.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWordsStream {
    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }

    public static final String WORD_DELIMITER = " ";

    public String spinWords1(String sentence) {
        return Arrays.stream(sentence.split(WORD_DELIMITER, -1))
                .map(SpinWordsStream::spinIfNecessary)
                .collect(Collectors.joining(WORD_DELIMITER));
    }

    private static String spinIfNecessary(String word) {
        return spinnable(word) ? spin(word) : word;
    }

    private static boolean spinnable(String word) {
        return word.length() >= 5;
    }

    private static String spin(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
