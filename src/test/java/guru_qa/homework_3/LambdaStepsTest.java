package guru_qa.homework_3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class LambdaStepsTest {

    private static final String  REPOSITORY = "ElizavetaAlimbekova/qa.guru-autotests";


    @Test
    public void stepsSearsIssue() {

        step ("Открываем страницу GitHub", () -> {
            Selenide.open ("https://github.com/");
        });

        step ("Ищем свой репозиторий" + REPOSITORY, () -> {
            $ (".header-search-input").click ();
            $ (".header-search-input").setValue (REPOSITORY).pressEnter ();
        });

        step ("Переходим в репозиторий" + REPOSITORY, () -> {
            $ (By.linkText (REPOSITORY)).click ();
        });

        step ("Проверяем, что есть название Issues", () -> {
            $ ("#issues-tab").find (byText ("Issue")).should (Condition.exist);
        });

    }
}

