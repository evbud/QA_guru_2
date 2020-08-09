package tests.lesson2;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


class YarkiyTests {

    @Test
    void addToCartTest() {
        open("https://www.yarkiy.ru/");

        $(byName("q")).setValue("Leica SL2").pressEnter();
        $(withText("LEICA SL2 Body")).click();
        $(byClassName("button-addToCard")).click();
        $(byText("Корзина")).click();
        $(byPartialLinkText("Перейти в корзину")).click();

        $("html").shouldHave(text("Оформить заказ"));
    }
}
