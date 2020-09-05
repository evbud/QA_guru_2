package tests.lesson1;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;


class GoogleTests {

    @Tag("for_jenkins")
    @Test
    void selenideSearchTest() {
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        Configuration.headless = true;

        // Открыть google
        open("https://google.com");

        // Ввести Selenide в поиск
        $(byName("q")).setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text("selenide.org"));
    }

    @Tag("for_jenkins")
    @Test
    void lepraSearchTest() {
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        Configuration.headless = true;
        open("https://ya.ru");

        $("#text").setValue("лепра").pressEnter();

        $("html").shouldHave(text("суверенный лепрозорий"));
    }
}
