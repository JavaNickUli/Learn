package uli.nick.stepik.basic.tasks22;

/**
 * <p>Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш)
 * на расстоянии a.
 * <p>В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */

public class CharExpression {

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
