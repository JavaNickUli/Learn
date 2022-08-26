package uli.nick.headfirst.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class DuckConstruct {
    public static void main(String[] args) {
        List<Duck> allDuck = new ArrayList<>(List.of(
                new MallardDuck(), new RedheadDuck()
        ));
        for (Duck duck : allDuck) {
            duck.display();
            duck.quack();
            duck.swim();
            duck.fly();
            System.out.println("_______________");
        }
    }
}
