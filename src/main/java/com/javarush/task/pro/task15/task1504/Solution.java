package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var input = Files.newInputStream(Paths.get(scanner.nextLine()));
             var output = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] buffer = new byte[65536];
            while (input.available() > 0) {
                int real = input.read(buffer);
                for (int i = 1; i < real; i++) {
                    if (i % 2 != 0) {
                        byte temp = buffer[i];
                        buffer[i] = buffer[i - 1];
                        buffer[i - 1] = temp;
                    }
                }
                output.write(buffer, 0, real);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
