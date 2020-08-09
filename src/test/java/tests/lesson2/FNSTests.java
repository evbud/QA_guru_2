package tests.lesson2;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

class FNSTests {
    @Test
    void FNSgavnoTests() {
        open("http://stat.customs.ru/apex/f?p=201:2:3992905730199104::NO");

        $("#P2_DIRECTION_2").click();
        $("#P2_CH_PER_3").click();
        $("#P2_MONTH_LEFT").selectOptionByValue("202005");
        $("#P2_MONTH_MOVE").click();
        $("#P2_CH_STR2_0").click();
        $("#P2_TNVED").selectOptionByValue("1");
        $("#P2_CH_TNVED_2").click();
        $("#P2_TNVED4_4").setValue("7108");
        $("#FEDERAL_DISTRICT_0").click();
        $("#FEDERAL_SUBJECT_0").click();
        $("#P2_DOLL_2").click();
        $("#P2_VES_1").click();

        //пауза для ввода капчи
        sleep(12000);

        $(By.id("B279390790422826180")).click();
        sleep(35000);

        $("html").shouldNotHave(Condition.text("Данные отсутствуют"));
    }
}
