package uli.nick.javarush.task.pro.task06.task0607;

public class Solution {

    public static void main(String[] args) {

    }

    public static void signIn(String username){

        if ("user".equals(username)) {
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}
