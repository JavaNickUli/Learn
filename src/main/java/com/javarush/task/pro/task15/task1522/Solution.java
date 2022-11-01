package com.javarush.task.pro.task15.task1522;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Solution {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        try (InputStream input = url.openStream()) {
            System.out.println(new String(input.readAllBytes()));
        }
    }
}
