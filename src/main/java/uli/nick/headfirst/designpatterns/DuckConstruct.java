package uli.nick.headfirst.designpatterns;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DuckConstruct {
    public static void main(String[] args) {
        List<Duck> allDuck = new ArrayList<>(List.of(
                new MallardDuck(), new RedheadDuck(), new RubberDuck()
        ));
        for (Duck duck : allDuck) {
            for (Method method : duck.getClass().getMethods()) {
                try {
                    Method expr = Duck.class.getMethod(method.getName());
                    expr.invoke(duck);
                } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("_______________");
        }
    }


}
