package uli.nick.javarush.task.pro.task13.task1302;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public static HashSet<String> words = new HashSet<>(Arrays.asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println("Слово " + word + " есть в множестве");
        } else {
            System.out.println("Слова " + word + " нет в множестве");
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}