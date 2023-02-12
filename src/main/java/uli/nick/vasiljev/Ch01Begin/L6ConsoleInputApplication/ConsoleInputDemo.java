package uli.nick.vasiljev.Ch01Begin.L6ConsoleInputApplication;

import java.util.Scanner;

public class ConsoleInputDemo {

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
