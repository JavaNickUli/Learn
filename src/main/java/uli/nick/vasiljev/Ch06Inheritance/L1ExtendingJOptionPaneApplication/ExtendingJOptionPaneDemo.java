package uli.nick.vasiljev.Ch06Inheritance.L1ExtendingJOptionPaneApplication;

import javax.swing.*;

class MyPane extends JOptionPane {

    static void showMessage(String txt, String title) {
        showMessageDialog(null, txt, title, PLAIN_MESSAGE, new ImageIcon("C:/img/giraffe.jpg"));
    }

    static void showMessage(String txt) {
        showMessage(txt, "Сообщение");
    }

    static int getInteger(String txt) {
        String res;
        res = showInputDialog(null, txt, "Число (по умолчанию 10)", QUESTION_MESSAGE);
        if (res == null) {
            return 10;
        } else {
            return Integer.parseInt(res);
        }
    }
}

public class ExtendingJOptionPaneDemo {

    public static void main(String[] args) {
        MyPane.showMessage("Всем привет!");
        int number;
        number = MyPane.getInteger("Введите целое число");
        String txt = "Числа от 1 до " + number + ":\n";
        for (int k = 1; k <= number; k++) {
            txt += k + " ";
        }
        MyPane.showMessage(txt, "Целые числа");
    }
}
