package guru_qa.homework_3;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SelenideTest {

    @Test
    public void searsIssue(){

        //Открыть git
        Selenide.open ("https://github.com/");
        //Найти в поиске свой репозиторий
        $(".header-search-input").click ();
        $(".header-search-input").setValue ("ElizavetaAlimbekova/qa.guru-autotests").pressEnter ();
        //Перейти в репозиторий
        $(By.linkText ("ElizavetaAlimbekova/qa.guru-autotests")).click ();
        //Проверить название Issue
        $("#issues-tab").find(byText("Issues")).should(Condition.exist);
    }

}
