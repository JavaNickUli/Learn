package uli.nick.skillbox.cofeemachine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeMachine {
    private static List<Product> products = new ArrayList<>();
    private static int amount;

    public static void main(String[] args) {
        initCoffeeMachine();
        startCoffeeMachine();
        amountCheck();
        printListProducts(amount);
    }

    private static void initCoffeeMachine() {
        System.out.println("Инициализация...\nЗагрузка списка продукции...");
        List<String> listOfProducts = new ArrayList<>();

        try {
            listOfProducts = Files.readAllLines(Paths.get(
                    "src/main/java/uli/nick/skillbox/cofeemachine/products.txt"));
        } catch (IOException e) {
            System.out.println("Системная информация: отсутсвует или повреждён файл списка продукции.");
            System.exit(130);
        }

        try {
            for (String line : listOfProducts) {
                String[] tokens = line.split("\s+");
                String name = tokens[0];
                int price = Integer.parseInt(tokens[1]);
                if (name.length() == 0 || name.length() > 10 || price < 10 || price > 999) {
                    throw new Exception();
                }
                products.add(new Product(name, price));
            }
        } catch (Exception e) {
            System.out.println("Системная информация: неверные данные в списке продукции.");
            System.exit(130);
        }

        System.out.println("Статус инициализации: успешно.");
    }

    private static void startCoffeeMachine() {
        System.out.println("Кофемашина \"Coffee Like\".\n   Добро пожаловать!");
        System.out.println("Прайс на предлагаемую продукцию.");
        printListProducts(999);
        System.out.print("Внесите суму, пожалуйста: ");
    }

    private static void amountCheck() {

        while (amount <= 0) {
            int cash;
            Scanner inputAmount = new Scanner(System.in);

            try {
                cash = inputAmount.nextInt();
            } catch (Exception e) {
                System.out.print("Вы ввели неверное значение.\nПопробуйте ещё раз: ");
                continue;
            }

            if (cash < 0) {
                System.out.print("Вы не можете забрать деньги из автомата!\nПопробуйте ещё раз: ");
                continue;
            }

            if (cash == 0) {
                System.out.print("Бесплатного ничего нет!\nПопробуйте ещё раз: ");
                continue;
            }

            amount = cash;
            System.out.println("Вы внесли: " + cash + "руб.");
            System.out.println("Вы можете приобрести:");
        }
    }

    private static void printListProducts(int amount) {
        int minPrice = 999;

        for (Product product : products) {
            int price = product.getPrice();
            if (price <= amount) {
                minPrice = Math.min(minPrice, price);
                System.out.println(product.getName() + " " + price);
            }
        }
        if (amount < minPrice) {
            System.out.println("Недостаточно средств для покупки.");
        }
    }
}
