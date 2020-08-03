package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CartTest {
    @Test

    void cartasos () {
        open("https://asos.com");

        $(byName("q")).setValue("Nike Classic Cortez trainers in retro leather").pressEnter();
        $(By.id("main-size-select-0")).selectOption("UK 6.5");
        $(".add-button").scrollIntoView(true).click();
        $("._1M-cSy1").click();

        sleep(5000);
        $("html").shouldHave(text("Items are reserved for 60 minutes"));

    }
}
