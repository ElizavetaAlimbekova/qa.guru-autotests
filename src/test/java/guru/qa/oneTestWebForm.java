package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class oneTestWebForm {
    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @Test
    void positiveTest() {

        open("/automation-practice-form");
        $("#firstName").setValue("Liza");
        $("#lastName").setValue("Shilo");
        $("#userEmail").setValue("alim@mail.ru");
                $(byText("Female")).click();
                $("#userNumber").setValue("9626974543");
                $("#dateOfBirthInput").clear();
                $(".react-datepicker__month-select").selectOption("October");
                $(".react-datepicker__year-select").selectOption("1998");
                $(".react-datepicker__day--025").click();
                $("#subjectsInput").setValue("Computer Science").pressEnter();
                $("#hobbiesWrapper").$(byText("Reading")).click();
                $("#uploadPicture").uploadFile(new File("src/test/resources/Picture.png"));
                $("#currentAddress").setValue("my address");
                $("#react-select-3-input").setValue("Rajasthan").pressEnter();
                $("#react-select-4-input").setValue("Jaipur").pressEnter();
                $("#submit").click();


                //check date

        $(".modal-body").shouldHave(text("Liza"));
        $(".modal-body").shouldHave(text("Shilo"));
        $(".modal-body").shouldHave(text("Female"));
        $(".modal-body").shouldHave(text("alim@mail.ru"));
        $(".modal-body").shouldHave(text("9626974543"));
        $(".modal-body").shouldHave(text("25 October,1998"));
        $(".modal-body").shouldHave(text("Computer Science"));
        $(".modal-body").shouldHave(text("Reading"));
        $(".modal-body").shouldHave(text("Picture.png"));
        $(".modal-body").shouldHave(text("my address"));
        $(".modal-body").shouldHave(text("Rajasthan"));
        $(".modal-body").shouldHave(text("Jaipur"));

        $(".modal-body").shouldHave(text("Liza"), text("Shilo"), text("Female"));


    }


}
