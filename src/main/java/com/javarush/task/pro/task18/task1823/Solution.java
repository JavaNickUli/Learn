package com.javarush.task.pro.task18.task1823;

import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        return stringStream.filter(el -> el.length() > 6).collect(toSet());
    }
}
