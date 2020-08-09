package lection3Selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.*;

class AlfabankTests {
    @Test

    void archiveTest () {
        open("https://alfabank.ru/");

        $(byText("Вклады")).hover();
        $(byText("Депозиты")).click();
        $(byText("Архивные депозиты")).click();

        //Необходимо убедиться, что представлено ровно три архивных депозита
        $$(".product-cell__cell-box .product-cell__cell-even-delimiter").shouldHave(size(3));
    }

    @Test
    void insuranceTest () {
        open("https://alfabank.ru/");

        $(byTitle("Вклады")).click();
        $(byTitle("Депозиты")).parent().sibling(3).click();
        //$(byTitle("Специальный счет по 44-ФЗ")).closest("li").preceding(0).click(); //то же самое, но с closest(),preceding()

        $("html").shouldHave(text("Если банк прекращает работу"));
    }
}
