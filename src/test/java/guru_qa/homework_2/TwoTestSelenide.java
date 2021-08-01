package guru_qa.homework_2;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

//проверка содержимого страницы
public class TwoTestSelenide {

    @Test
    void testSearchSelenide(){
        //открыть страницу github selenide
        open("https://github.com/selenide/selenide");
        //перейти в раздел wiki
        $(byText("Wiki")).click();
        //найти в блоке Pages по тексту страницу SoftAssertions,
        $("#wiki-pages-filter").setValue("SoftAssertions");
        //открыть SoftAssertions
        $(".wiki-rightbar").find(byText("SoftAssertions")).click();
        //проверить что есть код junit5
        $("#wiki-body").shouldHave(Condition.text("Using JUnit5 extend test class"));
    }


}
