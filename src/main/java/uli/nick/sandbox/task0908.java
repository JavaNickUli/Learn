package uli.nick.sandbox;

public class task0908 {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));

    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.length() == 0)
            return "";
        else {
            String hexNumber = "";
            while (binaryNumber.length() % 4 != 0) {
                binaryNumber = 0 + binaryNumber;
            }
            for (int i = binaryNumber.length(); i > 0; i = i - 4) {
                int y = 0;
                int x;
                for (int j = 0; j < 4; j++) {
                    if (binaryNumber.charAt(i - j - 1) == 49 || binaryNumber.charAt(i - j - 1) == 48) {
                        x = binaryNumber.charAt(i - j - 1) == 49 ? 1 : 0;
                        y = y + x * (int) Math.pow(2, j);
                    } else
                        return "";
                }
                hexNumber = HEX.charAt(y) + hexNumber;
            }
            return hexNumber;
        }
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        String binaryNumber = "";
        if (hexNumber == null || hexNumber.length() == 0)
            return "";
        else {
            int tempBinary;
            for (int i = 0; i < hexNumber.length(); i++) {
                String tempBinaryNumber = "";
                tempBinary = HEX.indexOf(hexNumber.charAt(i));
                if (tempBinary == -1) {
                    return "";
                }
                else if (tempBinary == 0) {
                    // binaryNumber = binaryNumber + "0000";
                    tempBinaryNumber = "0000";
                } else {
                    while (tempBinary != 0) {
                        tempBinaryNumber =  tempBinary % 2 + tempBinaryNumber;
                        tempBinary = tempBinary / 2;
                    }
                }
                binaryNumber = binaryNumber + tempBinaryNumber;
            }
            return binaryNumber;
        }
    }
}
