package uli.nick.vasiljev.Ch01Begin.L02ShowMeNewWindowApplication;

import javax.swing.*;

public class ShowMeNewWindowDemo {

    public static void main(String[] args) {
        String title = "Сообщение";
        String text = "Продолжаем изучать Java";
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.WARNING_MESSAGE);
    }
}
