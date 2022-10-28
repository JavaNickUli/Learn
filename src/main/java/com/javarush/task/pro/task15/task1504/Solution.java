package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String src = scanner.nextLine();
        String dest = scanner.nextLine();
        scanner.close();

        try (var input = Files.newInputStream(Path.of(src));
             var output = Files.newOutputStream(Path.of(dest))) {
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
