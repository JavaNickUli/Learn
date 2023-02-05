package uli.nick.vasiljev.ch01.task0107;

import java.util.Scanner;

public class ConsoleInputApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day, month;
        System.out.println("Какой сегодня день?");
        day = input.nextLine();
        System.out.println("Какой месяц?");
        month = input.nextLine();
        String text;
        text = "Сегодня " + day + ", месяц - " + month;
        System.out.println(text);
    }
}
