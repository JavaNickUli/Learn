package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path path;
        while (Files.exists(path = Path.of(scanner.nextLine()))) {
            System.out.println(path + (Files.isRegularFile(path) ? THIS_IS_FILE : THIS_IS_DIR));
        }
    }
}
