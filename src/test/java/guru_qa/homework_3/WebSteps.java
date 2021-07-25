package guru_qa.homework_3;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Открываем страницу GitHub")
    public WebSteps openMainPage() {
        open("https://github.com");
        return this;
    }

    @Step("Ищем свой репозиторий {repository}")
    public WebSteps searchForRepository(String repository) {
        $ (".header-search-input").click ();
        $ (".header-search-input").setValue (repository).pressEnter ();
        return this;
    }

    @Step("Переходим в репозиторий {repository}")
    public WebSteps openRepository(String repository) {
        $ (By.linkText (repository)).click ();
        return this;
    }

    @Step("Проверяем, что есть название Issues")
    public WebSteps checkNameIssues() {
        $ ("#issues-tab").find (byText ("Issue")).should (Condition.exist);
        return this;
    }
}
