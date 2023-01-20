package uli.nick.roman;

public class RomanCalculate {

    public String parseRoman(String expression) {
        expression = removeNotRomanSigns(expression.toUpperCase());
        return expression;
    }

    private String removeNotRomanSigns(String expression) {
        StringBuilder stringBuilder = new StringBuilder("Answer: ");
        for (char aChar : expression.toCharArray()) {
            if (isRomanSigns(aChar) || isArithmeticSigns(aChar)) {
                stringBuilder.append(aChar);
            }
        }
        return stringBuilder.toString();
    }

    private boolean isRomanSigns(char aChar) {
        for (RomanEnum anEnum : RomanEnum.values()) {
            if (anEnum.name().equals(String.valueOf(aChar))) {
                return true;
            }
        }
        return false;
    }

    private boolean isArithmeticSigns(char aChar) {
        for (SignsEnum anEnum : SignsEnum.values()) {
            if (anEnum.sign() == aChar) {
                return true;
            }
        }
        return false;
    }
}
