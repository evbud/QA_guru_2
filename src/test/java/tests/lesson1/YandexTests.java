package tests.lesson1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


class YandexTests extends TestBase {

    //@Tag("for_jenkins")
    @Test
    void lepraSearchTest() {
        open("https://ya.ru");

        $("#text").setValue("лепра").pressEnter();

        $("html").shouldHave(text("суверенный лепрозорий"));
    }
}