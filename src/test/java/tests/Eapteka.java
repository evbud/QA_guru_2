package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Eapteka {
    @Test
    void EaptekaAuthTests () {
        open("https://eapteka.ru");

        $(by("data-tab-id", "auth")).click();
        $(by("name", "LOGIN")).setValue("");
        $(by("name", "PASSWORD")).setValue("");
        $(byText("Запомнить")).click();
        $(byText("Войти")).click();

        $(by("class", "htop__links right")).shouldHave(text("Выход"));


    }
}
