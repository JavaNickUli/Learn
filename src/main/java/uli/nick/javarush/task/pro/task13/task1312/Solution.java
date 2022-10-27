package uli.nick.javarush.task.pro.task13.task1312;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        return new HashMap<>() {{
            put(0, "Java");
            put(1, "Kotlin");
            put(2, "Go");
            put(3, "Javascript");
            put(4, "Typescript");
            put(5, "Python");
            put(6, "PHP");
            put(7, "C++");
        }};
    }
}
