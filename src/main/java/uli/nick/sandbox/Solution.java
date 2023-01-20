package uli.nick.sandbox;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             InputStream input = Files.newInputStream(Paths.get(scanner.nextLine()));
             OutputStream output = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            while (input.available() > 1) {
                int secondByte = input.read();
                output.write(input.read());
                output.write(secondByte);
            }
            if (input.available() > 0) {
                output.write(input.read());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
