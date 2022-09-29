package uli.nick.codewars.kyu6;

/**
 * Write a function that takes in a string of one or more words, and returns the same string, but with all
 * five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of
 * only letters and spaces. Spaces will be included only when more than one word is present.
 */

public class SpinWords {

    public String spinWords(String sentence) {
        char[] chars = sentence.toCharArray();
        for (int index = 0, space = 0; index <= chars.length; index++) {
            if (index == chars.length || chars[index] == ' ') {
                if (index - space > 4) {
                    reverseChars(chars, space, index - 1);
                }
                space = index + 1;
            }
        }
        return String.valueOf(chars);
    }

    public void reverseChars(char[] chars, int first, int last) {
        char temp;
        while (first < last) {
            temp = chars[first];
            chars[first++] = chars[last];
            chars[last--] = temp;
        }
    }

    public String spinWords1(String sentence) {
        for (String a : sentence.split(" ")) {
            if (a.length()> 4) {
                sentence = sentence.replace(a, new  StringBuffer(a).reverse());
            }
        }
        return sentence;
    }
}
