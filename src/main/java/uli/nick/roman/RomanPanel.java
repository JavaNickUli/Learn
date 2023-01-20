package uli.nick.roman;

import javax.swing.*;

class Pane extends JOptionPane {

    static void showMessage(String txt, String title) {
        showMessageDialog(null, txt, title, PLAIN_MESSAGE);
    }

    static void showMessage(String txt) {
        showMessage(txt, "Сообщение");
    }

    static String getAnswer(String txt) {
        return showInputDialog(null, txt, "Калькулятор римских чисел", QUESTION_MESSAGE);
    }
}

public class RomanPanel {

    public static void main(String[] args) {
        Pane.showMessage("Привет, Крис!\nНадо поработать.)");
        String expression = Pane.getAnswer("Введите выражение");
        String answer = "Ответ : " + Roman.calculate(expression);
        Pane.showMessage(answer, "Калькулятор римских чисел");
    }
}
