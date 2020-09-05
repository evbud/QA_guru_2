package tests.lesson1;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


class YandexTests {

    @Test
    void selenideSearchTest() {
        open("https://ya.ru");

        $("#text").setValue("лепра").pressEnter();

        $("html").shouldHave(text("суверенный лепрозорий"));
    }
}