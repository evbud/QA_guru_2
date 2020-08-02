package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

class FNStest {
    @Test

    void FNSgavnoTest() {
        open("http://stat.customs.ru/apex/f?p=201:2:3992905730199104::NO");

        $(By.id("P2_DIRECTION_2")).click();
        $(By.id("P2_CH_PER_3")).click();
        $(By.id("P2_MONTH_LEFT")).selectOptionByValue("202006");
        $(By.id("P2_MONTH_MOVE")).click();
        $(By.id("P2_CH_STR2_0")).click();
        $(By.id("P2_TNVED")).selectOptionByValue("1");
        $(By.id("P2_CH_TNVED_0")).click();
        $(By.id("FEDERAL_DISTRICT_0")).click();
        $(By.id("FEDERAL_SUBJECT_0")).click();
        $(By.id("P2_DOLL_2")).click();
        $(By.id("P2_VES_1")).click();
        sleep(10000);
        $(By.id("B279390790422826180")).click();
        sleep(30000);
        $("html").shouldHave(Condition.text("Данные отсутствуют"));

    }
}
