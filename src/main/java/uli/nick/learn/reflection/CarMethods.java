package uli.nick.learn.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

public class CarMethods {

    private static CarMethods carMethods = new CarMethods();
    private Car car = new Car(100, "AA180A1");

    public static void main(String[] args) {
        carMethods.getFull();
    }

    public void getNameMethods() {
        Stream.of(car.getClass().getDeclaredMethods())
                .map(Method::getName).forEach(System.out::println);
    }

    public void getModifiersMethods() {

        Stream.of(car.getClass().getDeclaredMethods())
                .map(Method::getModifiers).map(Modifier::toString).forEach(System.out::println);
    }

    public void getReturnMethods() {

        Stream.of(car.getClass().getDeclaredMethods())
                .map(Method::getReturnType).forEach(System.out::println);
    }

    public void getFull() {
        Stream.of(car.getClass().getDeclaredMethods())
                .map(e -> Modifier.toString(e.getModifiers()) + " " + e.getReturnType() + " " +
                        e.getGenericReturnType() + " " + e.getName()).forEach(System.out::println);
    }
}
