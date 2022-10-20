package uli.nick.javarush.task.pro.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * <p>1. Введи с клавиатуры 10 слов в список строк.
 * <p>2. Определить, является ли список упорядоченным по возрастанию длины строки.
 * <p>3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
 * <p>Требования:
 * <p>Объяви переменную типа список строк и сразу проинициализируй ee.
 * <p>Считай 10 строк с клавиатуры и добавь их в список.
 * <p>Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
 * <p>Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента,
 * нарушающего такую упорядоченность.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        while(true) {
            String s = reader.readLine();
            if(!s.isEmpty()) {
                strings.add(s);
            } else break;
        }

        for(int i = 1; i < strings.size(); i++) {
            int a  = strings.get(i).length();
            int b = strings.get(i-1).length();

            if(a < b) {
                System.out.println(i);
                break;
            }
        }//напишите тут ваш код
    }
}
