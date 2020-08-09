package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EaptekaTests {
    @Test
    void loginTests () {
        open("https://eapteka.ru");

        $(by("data-tab-id", "auth")).click();
        $(byName("LOGIN")).setValue("");
        $(byName("PASSWORD")).setValue("");
        $(byText("Запомнить")).click();
        $(byText("Войти")).click();

        //$(by("class", "htop__links right")).shouldHave(text("Выход"));
        $(".header").shouldHave(text("Выход"));
    }
}
