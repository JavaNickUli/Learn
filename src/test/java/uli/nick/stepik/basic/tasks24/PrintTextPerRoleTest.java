package uli.nick.stepik.basic.tasks24;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class PrintTextPerRoleTest {

    @Test
    void printTextPerRoleTest() {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        String actual = PrintTextPerRole.printTextPerRole(roles, textLines);
        String expected = """
                Городничий:
                1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
                4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.

                Аммос Федорович:
                2) Как ревизор?
                5) Вот те на!

                Артемий Филиппович:
                3) Как ревизор?
                6) Вот не было заботы, так подай!

                Лука Лукич:
                7) Господи боже! еще и с секретным предписаньем!

                """;

        then(actual).isEqualTo(expected);
    }
}