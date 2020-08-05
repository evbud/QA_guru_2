package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class AutoruRegion {
    @Test
    void regionReset() {
        open("https://moto.auto.ru");

        $(".GeoSelect").click();
        $(".GeoSelectPopupRegion__clear").click();
        $(byText("Сохранить")).click();

        $(".GeoSelect__title").shouldHave(text("Любой регион"));

    }
}

