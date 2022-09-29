package uli.nick.codewars.kyu8;

/**
 * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 * The output should be two capital letters with a dot separating them.
 */

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        return (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
    }
}
