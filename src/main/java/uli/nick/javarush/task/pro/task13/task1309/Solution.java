package uli.nick.javarush.task.pro.task13.task1309;

import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Иванов Иван", 4.8);
        grades.put("Сидоров Максим", 4.2);
        grades.put("Тимуров Геннадий", 3.8);
        grades.put("Скворцова Ирина", 4.9);
        grades.put("Темяшева Алина", 4.0);
    }
}
