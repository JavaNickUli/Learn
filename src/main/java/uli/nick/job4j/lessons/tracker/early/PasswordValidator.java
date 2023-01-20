package uli.nick.job4j.lessons.tracker.early;

/**
 * <p>4. Принципы раннего возврата и охранных выражений [#504875]
 * <p>Задание
 * <p>1. Создать класс PassportValidator, который занимается проверкой пароля:
 * <p>2. Добавить валидацию в метод validate(), применив принцип охранных выражений. Если password null, то
 * выбросить исключение IllegalArgumentException;
 * <p>3. Учесть требования к паролю ниже. Если хотя бы одно из требований нарушается, то возвращать нужно
 * соответствующее сообщение:
 * <p>1) Длина пароля находится в диапазоне [8, 32];
 * <p>2) Пароль содержит хотя бы один символ в верхнем регистре;
 * <p>3) Пароль содержит хотя бы один символ в нижнем регистре;
 * <p>4) Пароль содержит хотя бы одну цифру;
 * <p>5) Пароль содержит хотя бы один спец. символ (не цифра и не буква);
 * <p>6) Пароль не содержит подстрок без учета регистра: qwerty, 12345, password, admin, user. Без учета регистра,
 * значит что, например, ни qwerty ни QWERTY ни qwErty и т.п. быть не должно быть в составе пароля.
 * <p>Для проверок использовать статические методы класса Character.
 * <p>4. Создать класс PasswordValidatorTests. Реализовать Unit тесты, которые учитывают все условия,
 * реализованные в методе validate();
 */

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("argument \"passport\" is null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("argument \"passport\" must be between 8 and 32 characters");
        }

        return null;
    }
}

// Каркас 4.:
//public class PasswordValidator {
//    public static String validate(String password) {
//    }
//}
//.
