package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TwoTestSelenide {

    @Test
    void testSearchSelenide(){
        //открыть страницу github selenide
        open("https://github.com/selenide/selenide");
        //перейти в раздел wiki
        $(byText("Wiki")).click();
        //найти по тексту страницу SoftAssertions, открыть SoftAssertions
        $(byText("Soft assertions")).click();
        //проверить что есть код junit5
        $("#wiki-body").shouldHave(Condition.text("Using JUnit5 extend test class"));
    }


}
