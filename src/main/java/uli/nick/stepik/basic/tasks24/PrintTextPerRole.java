package uli.nick.stepik.basic.tasks24;

/**
 * <p>Вам дан список ролей и сценарий пьесы в виде массива строчек.
 * <p>Каждая строчка сценария пьесы дана в следующем виде:
 * <p>Роль: текст
 * <p>Текст может содержать любые символы.
 * <p>Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат
 * в виде готового текста (см. пример). Каждая группа распечатывается в следующем виде:
 * <p>Роль:
 * <p>i) текст
 * <p>j) текст2
 * <p>...
 * <p>==перевод строки==
 * <p>i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в
 * соответствии с порядком ролей. Переводы строк между группами обязательны, переводы строк в конце текста
 * не учитываются.
 * <p>Заметим, что вам предстоит обработка огромной пьесы в 50 000 строк для 10 ролей – соответственно,
 * неправильная сборка результирующей строчки может выйти за ограничение по времени.
 * <p>Обратите внимание еще на несколько нюансов:
 * <p>имя персонажа может встречаться в строке более одного раза, в том числе с двоеточием;
 * <p>название одной роли может быть префиксом названия другой роли (например, "Лука" и "Лука Лукич");
 * <p>роль, у которой нет реплик, тоже должна присутствовать в выходном файле;
 * <p>в качестве перевода строки надо использовать символ '\n' (перевод строки в стиле UNIX);
 * <p>будьте внимательны, не добавляйте лишних пробелов в конце строк.
 * <p>Sample Input:
 * <p>
 * <p>roles:
 * <p>Городничий
 * <p>Аммос Федорович
 * <p>Артемий Филиппович
 * <p>Лука Лукич
 * <p>textLines:
 * <p>Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
 * <p>Аммос Федорович: Как ревизор?
 * <p>Артемий Филиппович: Как ревизор?
 * <p>Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
 * <p>Аммос Федорович: Вот те на!
 * <p>Артемий Филиппович: Вот не было заботы, так подай!
 * <p>Лука Лукич: Господи боже! еще и с секретным предписаньем!
 * <p>Sample Output:
 * <p>
 * <p>Городничий:
 * <p>1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
 * <p>4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
 * <p>
 * <p>Аммос Федорович:
 * <p>2) Как ревизор?
 * <p>5) Вот те на!
 * <p>
 * <p>Артемий Филиппович:
 * <p>3) Как ревизор?
 * <p>6) Вот не было заботы, так подай!
 * <p>
 * <p>Лука Лукич:
 * <p>7) Господи боже! еще и с секретным предписаньем!
 */

public class PrintTextPerRole {

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder playRole = new StringBuilder();
        for (String role : roles) {
            playRole.append(role).append(":\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(role + ":")) {
                    playRole.append(j + 1).append(")")
                            .append(textLines[j].substring(role.length() + 1)).append("\n");
                }
            }
            playRole.append("\n");
        }
        return playRole.toString();
    }
}
