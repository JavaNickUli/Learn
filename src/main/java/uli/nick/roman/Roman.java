package uli.nick.roman;

public class Roman {

    public static void main(String[] args) {
        calculate("1 zxcvbnm+   56iv-_ *//fr");
    }

    public static String calculate(String expression) {
        System.out.println(new RomanCalculate().parseRoman(expression));
        return "";
    }
}
